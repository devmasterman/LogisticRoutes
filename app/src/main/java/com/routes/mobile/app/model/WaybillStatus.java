package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 23/05/2017.
 */

public class WaybillStatus extends SugarRecord {
    private int waybillId;
    private String status;

    public WaybillStatus(){}

    public WaybillStatus(int waybillId,String status){
        this.waybillId=waybillId;
        this.status=status;

    }
    public int getWaybillId() { return waybillId;    }

    public String getStatus() { return status;       }

    @Override
    public String toString() {
        return "WaybillStatus{" +
                "WaybillId='" + waybillId + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}
