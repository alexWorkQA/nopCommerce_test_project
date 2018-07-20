package Factories;

import Models.User;
import net.bytebuddy.implementation.bytecode.Throw;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ResourceBundle;

public class UserFactory {

    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("users");
    }

    public static User generateValidUser(){
        throw new NotImplementedException();
       // return new User();
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
