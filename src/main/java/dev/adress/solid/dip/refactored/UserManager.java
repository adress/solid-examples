package dev.adress.solid.dip.refactored;

public class UserManager {
    public void showUser() {
        //LocalUserRepository userRepository = new LocalUserRepository();
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUser(1);
        System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail());
    }
}
