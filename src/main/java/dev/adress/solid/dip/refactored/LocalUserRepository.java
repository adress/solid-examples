package dev.adress.solid.dip.refactored;

public class LocalUserRepository implements UserRepository {

    @Override
    public User getUser(int id) {
        User user = new User(1, "Jaime", "jaime@test.com");
        return user;
    }
}
