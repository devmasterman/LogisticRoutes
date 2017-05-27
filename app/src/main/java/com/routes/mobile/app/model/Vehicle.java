package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class Vehicle extends SugarRecord {
    private int vehicleId;
    private String serialNumber;
    private String license;
    private String description;

    public Vehicle(){}

    public Vehicle(int vehicleId,String serialNumber,String license,String description){
        this.vehicleId=vehicleId;
        this.serialNumber=serialNumber;
        this.license=license;
        this.description=description;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getLicense() {
        return license;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleId='" + vehicleId + '\'' +
                ", SerialNumber='" + serialNumber + '\'' +
                ", License='" + license + '\'' +
                ", Description='" + description + '\'' +
                '}';
    }

}
