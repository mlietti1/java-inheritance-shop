package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{

    private final int IMEI;
    private int capacity;

    public Smartphone() {
        IMEI = generateIMEI();
    }

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, int capacity) {
        super(name, description, price, iva);
        IMEI = generateIMEI();
        this.capacity = capacity;
    }

    public int getIMEI() {
        return IMEI;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int generateIMEI(){
        Random random = new Random();
        return random.nextInt(1, 100000000);
    }
}
