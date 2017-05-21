package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Edgar Román on 20/05/17.
 */

public class Exceptions extends SugarRecord {

    //private int _id;
   // private int ID;
    private String CLAVE;
    private String DESCRIPCION;
    private String TIPO;

    public Exceptions() {
    }

    public Exceptions(String CLAVE, String DESCRIPCION, String TIPO) {
        this.CLAVE = CLAVE;
        this.DESCRIPCION = DESCRIPCION;
        this.TIPO = TIPO;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public String getTIPO() {
        return TIPO;
    }

    @Override
    public String toString() {
        return "Exceptions{" +
                "CLAVE='" + CLAVE + '\'' +
                ", DESCRIPCION='" + DESCRIPCION + '\'' +
                ", TIPO='" + TIPO + '\'' +
                '}';
    }
}
