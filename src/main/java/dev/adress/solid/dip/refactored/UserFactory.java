package dev.adress.solid.dip.refactored;

public class UserFactory {
    public static UserRepository create(){
        return new LocalUserRepository();
    }
}
