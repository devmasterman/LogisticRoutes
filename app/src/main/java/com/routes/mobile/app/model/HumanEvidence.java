package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class HumanEvidence extends SugarRecord {
    private int humanEvidenceId;
    private String firstName;
    private String lastName;
    IdCardType idCardType;
    RouteEvent routeEvent;

    public int getHumanEvidenceId() {
        return humanEvidenceId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public IdCardType getIdCardType() {
        return idCardType;
    }

    public RouteEvent getRouteEvent() {
        return routeEvent;
    }
}
