package org.lessons.java.shop;

public class Headphones extends Product {
    private String color;
    private boolean wireless;

    // CONSTRUCTORS
    public Headphones(String name, String description, double price, int vatNumber, String color, boolean wireless) {
        super(name, description, price, vatNumber);
        this.color = color;
        this.wireless = wireless;
    }
    //GETTERS & SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
