package com.routes.mobile.app.model;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by Artemio on 25/05/2017.
 */

public class DeliveryRoute extends SugarRecord {
    private int deliveryRouteId;
    private Date localStartDateTime;
    private Date localEndDateTime;
    private String ROUTEUUID;
    private String IMEI;

    Vehicle vehicle;

    public int getDeliveryRouteId() {
        return deliveryRouteId;
    }

    public Date getLocalStartDateTime() {
        return localStartDateTime;
    }

    public Date getLocalEndDateTime() {
        return localEndDateTime;
    }

    public String getROUTEUUID() {
        return ROUTEUUID;
    }

    public String getIMEI() {
        return IMEI;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
