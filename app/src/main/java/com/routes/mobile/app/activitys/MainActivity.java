package com.routes.mobile.app.activitys;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.routes.mobile.app.dao.IDeliveryDAO;
import com.routes.mobile.app.dao.IExcepcionsDAO;
import com.routes.mobile.app.dao.impl.DeliveryDAO;
import com.routes.mobile.app.dao.impl.ExceptionsDAO;
import com.routes.mobile.app.model.DeliveryRoute;
import com.routes.mobile.app.model.Vehicle;
import com.routes.mobile.app.utils.DataBaseHelper;
import com.routes.mobile.app.model.Exceptions;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Edgar Román on 20/05/17.
 */
public class MainActivity extends AppCompatActivity {

    private DataBaseHelper myDB;
    private TextView tv1;
    public static TextView tvresult;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.idTv1);
        //Debemos copiar la DB por primera vez para que sea detectada por sugar ORM
        //Esto es para poder usar tablas ya creadas
        copyDB();

        //Inyectamos un objeto DAO para obtener toda la lista de excepciones
        IExcepcionsDAO expDAO = new ExceptionsDAO();
        List<Exceptions> lstEx=null;
        String out="";
        try {
            lstEx=expDAO.getAllEx();
            for(Exceptions ex :lstEx){
                out+=ex.toString() +"\n\n\n\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tvresult = (TextView) findViewById(R.id.tvresult);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });


        //creamos vehiculos
        crearVehiculos();
        out+="************************";
        out+="*****DELIVERY ROUTES****";
        out+="************************";
        out+="\n\n\n\n";
        //Listamos las entregas con sus vehiculos asociados
        IDeliveryDAO deliveryDAO = new DeliveryDAO();
        List<DeliveryRoute> lstRoutes=null;
        try{
            lstRoutes = deliveryDAO.getAll();

            for(DeliveryRoute dr : lstRoutes){
                out+=dr+"\n\n";
            }

        }catch(Exception e){

        }

        out="\n\n\n"+invokeRestFul();

        tv1.setText("Salida:\n\n\n"+out);


    }

    /**
     * Creamos una relacion "tiene un" entre un Vehicle y un DeliveryRoute
     */
    private void crearVehiculos(){

        Vehicle vh = new Vehicle();
        vh.setDescription("Avion");
        vh.setLicense("AXD-TYU");
        vh.setSerialNumber("12333333");
        vh.save();

        DeliveryRoute dr = new DeliveryRoute();
        dr.setImei("344324234");
        dr.setLocalEndDateTime(new Date());
        dr.setLocalStartDateTime(new Date());
        dr.setRouteUUID("dfsdfsdf");
        dr.setVehicle(vh);
        dr.save();
    }

    private String invokeRestFul(){
        // The connection URL
        String url = "https://ajax.googleapis.com/ajax/" +
                "services/search/web?v=1.0&q={query}";
        String result=null;
        try {

            //Usamos el modo estricto, esto debemos cambiarlo por un asyncTask, ya que los subprocesos
            //de android usan hilos, debemos tener cuidado con el modo estricto
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            // Create a new RestTemplate instance
            RestTemplate restTemplate = new RestTemplate();

            // Add the String message converter
            restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

            // Make the HTTP GET request, marshaling the response to a String
             result = restTemplate.getForObject(url, String.class, "Android");
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    private void copyDB(){

        myDB = new DataBaseHelper(getApplicationContext());

        try {
            myDB.createDataBase();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.print("OK");
    }
}
