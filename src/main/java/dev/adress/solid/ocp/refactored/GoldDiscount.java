package dev.adress.solid.ocp.refactored;

public class GoldDiscount implements  IDiscount{
    public Double apply(Double price) {
        return price * 0.2;
    }
}
