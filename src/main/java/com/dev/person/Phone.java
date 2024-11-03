package com.dev.person;

public class Phone {
    public String officeAreaCode;
    public String officeNumber;

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ") " + officeNumber ;
    }
}
