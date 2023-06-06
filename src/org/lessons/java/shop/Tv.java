package org.lessons.java.shop;

class Tv extends Product {
    private int dimension;
    private boolean isSmart;

    // CONSTRUCTORS
    public Tv(String name, String description, double price, int vatNumber, int dimension, boolean isSmart) {
        super(name, description, price, vatNumber);
        this.dimension = dimension;
        this.isSmart = isSmart;
    }

    //GETTERS & SETTERS


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "dimension=" + dimension +
                ", isSmart=" + isSmart +
                '}';
    }
}
