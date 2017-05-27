package com.routes.mobile.app.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
