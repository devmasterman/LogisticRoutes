package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class IdCardType extends SugarRecord {
    private int idCardTypeId;
    private String label;

    public IdCardType(){}

    public IdCardType(int idCardTypeId,String label){
        this.idCardTypeId=idCardTypeId;
        this.label=label;
    }

    public int getIdCardTypeId() {
        return idCardTypeId;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "IdCardType{" +
                "IdCardTypeId='" + idCardTypeId + '\'' +
                ", Label='" + label + '\'' +
                '}';
    }
}
