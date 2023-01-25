package dev.adress.solid.dip.example;

public class UserManager {
    public void showUser() {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.getUser(1);
        System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail());
    }
}
