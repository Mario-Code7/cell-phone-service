package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.print("What is the serial number: ");
        int serialNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("What model is the phone?: ");
        String model = myScanner.nextLine();

        System.out.print("Who is the carrier?: ");
        String carrier = myScanner.nextLine();

        System.out.print("What is the phone number?: ");
        String phoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner of the phone?: ");
        String owner = myScanner.nextLine();

        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        System.out.println("What is the serial number?: " + cellPhone.getSerialNumber());
        System.out.println("What model is the phone?: " + cellPhone.getModel());
        System.out.println("Who is the carrier?: " + cellPhone.getCarrier());
        System.out.println("What is the phone number?: " + cellPhone.getPhoneNumber());
        System.out.println("Who is the owner of the phone?: " + cellPhone.getOwner());


        myScanner.close();
    }
}
