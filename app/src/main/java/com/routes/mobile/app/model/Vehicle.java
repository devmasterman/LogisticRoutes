package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class Vehicle extends SugarRecord {
    private String serialNumber;
    private String license;
    private String description;

    public Vehicle(){}

    public Vehicle(int vehicleId,String serialNumber,String license,String description){
        this.serialNumber=serialNumber;
        this.license=license;
        this.description=description;
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

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", SerialNumber='" + serialNumber + '\'' +
                ", License='" + license + '\'' +
                ", Description='" + description + '\'' +
                '}';
    }

}
