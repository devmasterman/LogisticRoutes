package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 23/05/2017.
 */

public class CrewRole extends SugarRecord {
    private int crewRoleId;
    private String role;

    public CrewRole(){}

    public CrewRole(int crewRoleId,String role){
        this.crewRoleId=crewRoleId;
        this.role=role;
    }

    public String getRole() {  return role;    }

    public int getCrewRoleId() {  return crewRoleId;    }

    @Override
    public String toString() {
        return "CrewRole{" +
                "CrewRoleId='" + crewRoleId + '\'' +
                ", Role='" + role + '\'' +
                '}';
    }
}
