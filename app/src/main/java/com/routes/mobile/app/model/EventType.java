package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 23/05/2017.
 */

public class EventType extends SugarRecord {
    private int eventTypeId;
    private String eventType;

    public EventType(){}

    public EventType(int eventTypeId,String eventType){
        this.eventTypeId=eventTypeId;
        this.eventType=eventType;

    }

    public int getEventTypeId() { return eventTypeId;     }

    public String getEventType() { return eventType;     }

    @Override
    public String toString() {
        return "EventType{" +
                "EvenTypeId='" + eventTypeId + '\'' +
                "EventType='" + eventType + '\'' +
                '}';
    }
}
