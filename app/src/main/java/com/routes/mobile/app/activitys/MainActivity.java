package com.routes.mobile.app.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.routes.mobile.app.dao.IExcepcionsDAO;
import com.routes.mobile.app.dao.impl.ExceptionsDAO;
import com.routes.mobile.app.utils.DataBaseHelper;
import com.routes.mobile.app.model.Exceptions;

import java.io.IOException;
import java.util.List;

/**
 * Created by Edgar Román on 20/05/17.
 */
public class MainActivity extends AppCompatActivity {

    private DataBaseHelper myDB;
    private TextView tv1;

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

        tv1.setText("Salida:\n\n\n"+out);

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
