package org.lessons.java.shop;

import java.util.Random;

public class Product {
    // CONSTANTS

    // FIELDS o ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private int vatNumber;

    // CONSTRUCTORS

    public Product(String name, String description, double price, int vatNumber) { // costruttore con parametri
        this.code = new Random().nextInt(0, 999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vatNumber = vatNumber;
    }

    // GETTERS (myProduct)
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getVatNumber() {
        return this.vatNumber;
    }

    // SETTERS (yourProduct)

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    // METHODS
    public double getVatNumberPrice() {
        return price + price * vatNumber / 100;
    }

    public String getNamePlusCode() {
        return name + "-" + code;
    }

    public void printYourProduct() {
        System.out.println("CODE: " + getCode());
        System.out.println("NAME: " + name);
        System.out.println("DESCRIPTION: " + description);
        System.out.println("PRICE: " + price + "€");
        System.out.println("VAT NUMBER: " + vatNumber + "%");
        System.out.println("FULL PRICE WITH VAT %: " + getVatNumberPrice() + "€");
        System.out.println("FULL NAME WITH CODE: " + getNamePlusCode());
        // CODICE A 8 CIFRE
        System.out.println("-----------------------------------");
        System.out.println("BONUS -> 8 DIGITS CODE : " + getPadCode());
        System.out.println("-----------------------------------");
    }

    //BONUS
    public String getPadCode() {
        String myCode = Integer.toString(code);
        while (myCode.length() < 8) {
            myCode = 0 + myCode;
        }
        return myCode;
    }
}
