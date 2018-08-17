package Factories;

import Models.User;
import org.apache.commons.lang3.ObjectUtils;

import java.util.ResourceBundle;
import java.util.UUID;

public class UserFactory {

    static ResourceBundle resource;
    private static final String EMPTY = "";

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

    public static User generateNonValidUserWOFName(User user){
        User userIn = new User();
        userIn.setFirstname(EMPTY);
        userIn.setLastname(user.getLastname());
        userIn.setEmail(user.getEmail());
        userIn.setPassword(user.getPassword());
        return userIn;
    }

    public static User generateNonValidUserWOLName(User user){
        User userIn = new User();
        userIn.setFirstname(user.getLastname());
        userIn.setLastname(EMPTY);
        userIn.setEmail(user.getEmail());
        userIn.setPassword(user.getPassword());
        return userIn;
    }

    public static User generateNonValidUserWOEmail(User user){
        User userIn = new User();
        userIn.setFirstname(user.getFirstname());
        userIn.setLastname(user.getLastname());
        userIn.setEmail(EMPTY);
        userIn.setPassword(user.getPassword());
        return userIn;
    }

}
