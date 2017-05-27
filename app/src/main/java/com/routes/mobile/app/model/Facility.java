package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class Facility extends SugarRecord {
    private int facilityId;
    private String facilityAcronym;
    private String addressLine;
    private String addressLine2;
    private String zipCode;
    private String latitude;
    private String longitude;


    public Facility(){}

    public Facility(int facilityId,String facilityAcronym,String addressLine,String addressLine2,String zipCode,String latitude,String longitude){
        this.facilityId=facilityId;
        this.facilityAcronym=facilityAcronym;
        this.addressLine=addressLine;
        this.addressLine2=addressLine2;
        this.zipCode=zipCode;
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public String getFacilityAcronym() {
        return facilityAcronym;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
    @Override
    public String toString() {
        return "Facility{" +
                "FacilityId='" + facilityId + '\'' +
                ", FacilityAcronym='" + facilityAcronym + '\'' +
                ", AddressLine='" + addressLine + '\'' +
                ", AddressLine2='" + addressLine2 + '\'' +
                ", ZipCode='" + zipCode + '\'' +
                ", Latitude='" + latitude + '\'' +
                ", Longitude='" + longitude + '\'' +
                '}';
    }
}
