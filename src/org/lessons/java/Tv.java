package org.lessons.java;

import java.math.BigDecimal;

public class Tv extends Product {

    private int size;
    private boolean smart;

    public Tv() {

    }

    public Tv(String name, String description, BigDecimal price, BigDecimal iva, int size, boolean smart) {
        super(name, description, price, iva);
        this.size = size;
        this.smart = smart;
    }

    public int getSize() {
        return size;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }


    @Override
    public BigDecimal getDiscountedPrice(boolean withIva) {
        BigDecimal priceToReduce = withIva ? getPriceWithIva() : getPrice();
        if(!smart){
            return priceToReduce.subtract(priceToReduce.multiply(new BigDecimal("0.1")));
        }
        return super.getDiscountedPrice(withIva);
    }

    @Override
    public String toString() {
        return "Tv{" +
                super.toString() + " " + '\'' +
                "size=" + size + '\'' +
                ", smart=" + smart +
                '}';
    }
}
