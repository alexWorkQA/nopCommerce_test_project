package Helpers;

import Factories.UserFactory;
import Models.User;
import Pages.LoginPage;

public class LoginPageHelper extends LoginPage {

    public void loginAsValidUser(User user){
        //User user = UserFactory.getValidUser();
        loginToSite(user);

    }

}
