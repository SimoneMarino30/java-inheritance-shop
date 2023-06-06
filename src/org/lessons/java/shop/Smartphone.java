package org.lessons.java.shop;

public class Smartphone extends Product {
    // ATTRIBUTES
    private int imeiCode;
    private int memory;

    // CONSTRUCTORS
    public Smartphone(String name, String description, double price, int vatNumber, int imeiCode, int memory) {
        super(name, description, price, vatNumber);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }

    //GETTERS & SETTERS
    public int getImeiCode() {
        return imeiCode;
    }

    public int getMemory() {
        return memory;
    }


    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imeiCode=" + imeiCode +
                ", memory=" + memory +
                '}';
    }
}
