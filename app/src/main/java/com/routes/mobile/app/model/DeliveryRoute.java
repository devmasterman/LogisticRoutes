package com.routes.mobile.app.model;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by Artemio on 25/05/2017.
 */

public class DeliveryRoute extends SugarRecord {
    private Date localStartDateTime;
    private Date localEndDateTime;
    private String routeUUID;
    private String imei;

    private Vehicle vehicle; //tiene un vehicle

    public DeliveryRoute(Date localStartDateTime, Date localEndDateTime, String routeUUID, String imei, Vehicle vehicle) {
        this.localStartDateTime = localStartDateTime;
        this.localEndDateTime = localEndDateTime;
        this.routeUUID = routeUUID;
        this.imei = imei;
        this.vehicle = vehicle;
    }

    public DeliveryRoute() {
    }

    public Date getLocalStartDateTime() {
        return localStartDateTime;
    }

    public Date getLocalEndDateTime() {
        return localEndDateTime;
    }

    public String getRouteUUID() {
        return routeUUID;
    }

    public String getImei() {
        return imei;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setLocalStartDateTime(Date localStartDateTime) {
        this.localStartDateTime = localStartDateTime;
    }

    public void setLocalEndDateTime(Date localEndDateTime) {
        this.localEndDateTime = localEndDateTime;
    }

    public void setRouteUUID(String routeUUID) {
        this.routeUUID = routeUUID;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "DeliveryRoute{" +
                "localStartDateTime=" + localStartDateTime +
                ", localEndDateTime=" + localEndDateTime +
                ", routeUUID='" + routeUUID + '\'' +
                ", imei='" + imei + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
