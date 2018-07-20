package Helpers;

import Models.User;
import Pages.RegisterPage;

public class RegisterPageHelper extends RegisterPage {

    public void registerValidUser(User user){
        fillOutForm(user);
    }

}
