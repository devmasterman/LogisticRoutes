package com.routes.mobile.app.model;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by Artemio on 25/05/2017.
 */

public class RouteEvent extends SugarRecord {
    private int routeEventId;
    private Date UTCCreationDateTime;
    private Date localRouteEvnetDateTime;
    private String latitude;
    private String longitude;
    EventType eventType;
    DeliveryRoute deliveryRoute;


    public int getRouteEventId() {
        return routeEventId;
    }

    public Date getUTCCreationDateTime() {
        return UTCCreationDateTime;
    }

    public Date getLocalRouteEvnetDateTime() {
        return localRouteEvnetDateTime;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public EventType getEventType() {
        return eventType;
    }

    public DeliveryRoute getDeliveryRoute() {
        return deliveryRoute;
    }
}
