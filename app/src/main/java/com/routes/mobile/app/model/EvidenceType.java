package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class EvidenceType extends SugarRecord {
    private int evidenceTypeId;
    private String label;

    public EvidenceType(){}

    public EvidenceType(int evidenceTypeId,String label){
        this.evidenceTypeId=evidenceTypeId;
        this.label=label;
    }

    public int getEvidenceTypeId() {
        return evidenceTypeId;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "EvidenceType{" +
                "EvidenceTypeId='" + evidenceTypeId + '\'' +
                ", Label='" + label + '\'' +
                '}';
    }
}
