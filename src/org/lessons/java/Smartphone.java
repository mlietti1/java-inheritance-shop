package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{

    private String IMEI;
    private int capacity;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, String IMEI, int capacity) {
        super(name, description, price, iva);
        this.IMEI = IMEI;
        this.capacity = capacity;
    }

    public String getIMEI() {
        return IMEI;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public BigDecimal getDiscountedPrice(boolean withIva) {
        BigDecimal priceToReduce = withIva ? getPriceWithIva() : getPrice();
        if(capacity > 32){
            return priceToReduce.subtract(priceToReduce.multiply(new BigDecimal("0.05")));
        }
        return super.getDiscountedPrice(withIva);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString()  + " " + '\'' +
                "IMEI=" + IMEI + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
