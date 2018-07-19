package Factories;

import Models.User;

import java.util.ResourceBundle;

public class UserFactory {

    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("users");
    }

    public static User getValidUser(){
        User user = new User();
        user.setEmail(resource.getString("valid.email"));
        user.setPassword(resource.getString("valid.password"));
        return user;
    }
}
