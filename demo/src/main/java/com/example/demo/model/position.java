package com.example.demo.model;

public enum position {

    HOUSE_KEEPING,FRONTDESK,CONSEIRGE,SECURITY;


    @Override
    public String toString() {

        switch(this){
            case HOUSE_KEEPING:
                return "house keeping";
            case FRONTDESK:
                return "front desk";
            case CONSEIRGE:
                return "consierge";
            case SECURITY:
                return "security";
        }
        return "";
    }
}
