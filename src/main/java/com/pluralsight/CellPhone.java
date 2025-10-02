package com.pluralsight;

public class CellPhone {// Fields(Instances variables)
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){} //default constructor

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) { //Overload constructor + parameters
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {//method
        return serialNumber;
    }

    public String getModel() {//method
        return model;
    }

    public String getCarrier() {//method
        return carrier;
    }

    public String getPhoneNumber() {//method
        return phoneNumber;
    }

    public String getOwner() {//method
        return owner;
    }

    public void setSerialNumber(int serialNumber) {//method
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {//method
        this.model = model;
    }

    public void setCarrier(String carrier) {//method
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {//method
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {//method
        this.owner = owner;
    }

    //prints for info after code is entered for all(s) phones
    public void display(){//method
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Model: " + getModel());
        System.out.println("Carrier: " + getCarrier());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
    }
    //prints out the following for cellphone numbers
    public void dial(CellPhone otherPhone) {//method
        System.out.println(owner + "'s phone is calling " + otherPhone.getPhoneNumber());
    }

    public void dial(String phoneNumber){//method
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }
}