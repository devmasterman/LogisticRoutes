package com.routes.mobile.app.model;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by Artemio on 25/05/2017.
 */

public class FacilityEvent extends SugarRecord {
    private int facilityEventId;
    private Date localArrivalDateTime;
    private Date localDepartatureDateTime;
    Facility facility;
    RouteEvent routeEvent;

    public int getFacilityEventId() {
        return facilityEventId;
    }

    public Date getLocalArrivalDateTime() {
        return localArrivalDateTime;
    }

    public Date getLocalDepartatureDateTime() {
        return localDepartatureDateTime;
    }

    public Facility getFacility() {
        return facility;
    }
}
