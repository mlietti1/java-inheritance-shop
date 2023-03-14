package org.lessons.java;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean wireless;

    public Headphones() {
    }

    public Headphones(String name, String description, BigDecimal price, BigDecimal iva, String color, boolean wireless) {
        super(name, description, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public BigDecimal getDiscountedPrice(boolean withIva) {
        BigDecimal priceToReduce = withIva ? getPriceWithIva() : getPrice();
        if(!wireless){
            return priceToReduce.subtract(priceToReduce.multiply(new BigDecimal("0.07")));
        }
        return super.getDiscountedPrice(withIva);
    }

    @Override
    public String toString() {
        return "Headphones{" +
                super.toString() + " " + '\'' +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
