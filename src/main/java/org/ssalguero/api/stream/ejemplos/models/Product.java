package org.ssalguero.api.stream.ejemplos.models;

import java.math.BigDecimal;

public class Product implements Comparable<Product>{
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public Product(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }
}
