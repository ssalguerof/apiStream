package org.ssalguero.api.stream.ejemplos.models;

import java.util.Collection;

public class Order {
    Collection<Product> products;

    //Inner
    public enum Discount{
        NORMAL, DISCOUNT_10, CHEAPEST_FREE
    }


}
