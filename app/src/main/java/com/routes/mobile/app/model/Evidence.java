package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class Evidence extends SugarRecord {
    private int evidenceId;
    private String text;
    EvidenceType evidenceType;
    RouteEvent routeEvent;

    public int getEvidenceId() {
        return evidenceId;
    }

    public String getText() {
        return text;
    }

    public EvidenceType getEvidenceType() {
        return evidenceType;
    }

    public RouteEvent getRouteEvent() {
        return routeEvent;
    }
}
