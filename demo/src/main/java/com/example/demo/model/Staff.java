package com.example.demo.model;

public class Staff {
    private String empid;

    @Override
    public String toString() {
        return "Staff{" +
                "empid='" + empid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }

    private String firstname;

    public String getEmpid() {
        return empid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public com.example.demo.model.position getPosition() {
        return position;
    }

    public Staff() {
    }

    private String lastName;

    public Staff(String empid, String firstname, String lastName, com.example.demo.model.position position) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastName = lastName;
        this.position = position;
    }

    private position position;
}
