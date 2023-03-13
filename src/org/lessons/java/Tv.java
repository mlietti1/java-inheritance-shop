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
}
