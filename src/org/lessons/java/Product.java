package org.lessons.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String description;
    private BigDecimal price;

    private BigDecimal iva;

    public Product() {
        code = generateCode();
    }

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {

        code = generateCode();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    private int generateCode(){
        Random random = new Random();
        return random.nextInt(1, 10000);
    }

    public BigDecimal getPriceWithIva(){
        BigDecimal ivaOnPrice = price.multiply(iva);
        return  price.add(ivaOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }

}
