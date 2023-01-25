package dev.adress.solid.dip.example;

public class UserRepository {
    public User getUser(int id) {
        //consultar ususario
        User user = new User(1, "Jaime", "jaime@test.com");
        return user;
    }
}
