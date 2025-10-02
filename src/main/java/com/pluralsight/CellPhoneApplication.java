package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        System.out.print("What is the serial number for phone 1?: ");
        cellPhone1.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();

        System.out.print("What model is the phone?: ");
        cellPhone1.setModel(myScanner.nextLine());

        System.out.print("Who is the carrier?: ");
        cellPhone1.setCarrier(myScanner.nextLine());

        System.out.print("What is the phone number?: ");
        cellPhone1.setPhoneNumber(myScanner.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        cellPhone1.setOwner(myScanner.nextLine());
        System.out.println();


        CellPhone cellPhone2 = new CellPhone();
        System.out.print("What is the serial number for phone 2: ");
        cellPhone2.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();

        System.out.print("What model is the phone?: ");
        cellPhone2.setModel(myScanner.nextLine());

        System.out.print("Who is the carrier?: ");
        cellPhone2.setCarrier(myScanner.nextLine());

        System.out.print("What is the phone number?: ");
        cellPhone2.setPhoneNumber(myScanner.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        cellPhone2.setOwner(myScanner.nextLine());

        CellPhone cellPhone3 = new CellPhone(1231333, "Google", "AT&T", "456-123-3456", "Freddy Kruger");
        System.out.println();

        System.out.println("=== Phone 1 info ===");
        cellPhone1.display();
        System.out.println();

        System.out.println("=== Phone 2 info ===");
        cellPhone2.display();
        System.out.println();

        System.out.println("=== Phone 3 info ===");
        cellPhone3.display();
        System.out.println();

        System.out.println();
        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);
        cellPhone3.dial("123-545-6767");



        myScanner.close();
    }
}
