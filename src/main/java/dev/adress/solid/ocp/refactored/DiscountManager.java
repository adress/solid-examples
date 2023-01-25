package dev.adress.solid.ocp.refactored;

public class DiscountManager {

    Double apply(Double price, IDiscount discount){
        return discount.apply(price);
    }

}
