package org.lessons.java;

import java.math.BigDecimal;

public class Product {

    private int code;
    private String name;
    private String description;
    private BigDecimal price;

    private BigDecimal iva;

    public Product( String name, String description, BigDecimal price, BigDecimal iva) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getIva() {
        return iva;
    }
}