package Factories;

import Models.User;

import java.util.ResourceBundle;
import java.util.UUID;

public class UserFactory {

    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("users");
    }

    public static User generateValidUser() {
        User user = new User();
        user.setFirstname(UUID.randomUUID().toString());
        user.setLastname(UUID.randomUUID().toString());
        user.setEmail(UUID.randomUUID().toString() + "@mail.com");
        user.setPassword("Password1");
        return user;
    }
}
