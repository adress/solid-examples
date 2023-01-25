package dev.adress.solid.ocp.refactored;

public class BlackFridayDiscount implements IDiscount{
    public Double apply(Double price) {
        return price * 0.4;
    }
}
