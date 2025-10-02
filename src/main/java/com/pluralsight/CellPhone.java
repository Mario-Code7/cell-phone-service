package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){}

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void display(){
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Model: " + getModel());
        System.out.println("Carrier: " + getCarrier());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Owner: " + getOwner());
    }
    public void dial(CellPhone otherPhone) {
        System.out.println(owner + "'s phone is calling " + otherPhone.getPhoneNumber());
    }

    public void dial(String phoneNumber){
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }
}