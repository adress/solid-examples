package dev.adress.solid.ocp.refactored;

public class Discount implements IDiscount {
    public Double apply(Double price) {
        return price * 0.5;
    }
}
