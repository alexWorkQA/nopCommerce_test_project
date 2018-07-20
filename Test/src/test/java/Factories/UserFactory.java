package Factories;

import Models.User;
import net.bytebuddy.implementation.bytecode.Throw;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ResourceBundle;
import java.util.UUID;

public class UserFactory {

    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("users");
    }

    public static User generateValidUser(){
        User user = new User();
        user.setFirstname(UUID.randomUUID().toString());
        user.setLastname(UUID.randomUUID().toString());
        user.setEmail(UUID.randomUUID().toString() + "@mail.com");
        user.setPassword("Password1");
        return user;
    }


    public static User getValidUser(){
        User user = new User();
        user.setEmail(resource.getString("valid.email"));
        user.setPassword(resource.getString("valid.password"));
        user.setFirstname(resource.getString("valid.firstname"));
        user.setLastname(resource.getString("valid.lastname"));
        return user;
    }
}
