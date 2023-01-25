package dev.adress.solid.isp.example;

public class Visa implements Payment{
    @Override
    public void calculatePayment() {

    }

    @Override
    public void creditCardPayment() {

    }

    //este metodo no se usa
    @Override
    public void bankTransferPayment() {

    }
}
