package dev.adress.solid.isp.example;

public interface Payment {
    void calculatePayment();
    void creditCardPayment();
    void bankTransferPayment();
}
