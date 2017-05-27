package com.routes.mobile.app.model;

import com.orm.SugarRecord;

/**
 * Created by Artemio on 23/05/2017.
 */

public class Employee extends SugarRecord {

    private int employeeId;
    private  String firstName;
    private String lastName;
    private String employeeNumber;
    private String password;

    public Employee(){}

    public Employee(int employeeId,String firstName,String lastName, String employeeNumber,String password){
        this.employeeId=employeeId;
        this.firstName = firstName;
        this.lastName=lastName;
        this.employeeNumber=employeeNumber;
        this.password=password;
    }

    public int getEmployeeId(){return employeeId; }

    public String getFirstName() { return firstName;  }

    public String getLastName() {  return lastName;   }

    public String getEmployeeNumber() { return employeeNumber; }

    public String getPassword() { return password;    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + employeeId + '\'' +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", EmployeeNumber='" + employeeNumber + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }

}
