package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 25/05/2017.
 */

public class DeliveryRouteCrew extends SugarRecord {
    private int deliveryCrewRouteId;
    Employee employee;
    CrewRole crewRole;
    DeliveryRoute deliveryRoute;

    public int getDeliveryCrewRouteId() {
        return deliveryCrewRouteId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public CrewRole getCrewRole() {
        return crewRole;
    }

    public DeliveryRoute getDeliveryRoute() {
        return deliveryRoute;
    }
}
