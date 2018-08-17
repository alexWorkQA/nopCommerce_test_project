package Helpers;

import Factories.PageFactory;
import Models.User;

public class LoginHelper {

    public void loginUser(User user){
        //PageFactory.mainPage.visit();
        PageFactory.loginPage.loginToSite(user);
    }

    public void logout(){
        PageFactory.mainPage.clickLogoutButton();
    }

    public User getLoggedInUser(){
        User user = new User();
        user.setFirstname(PageFactory.accountPage.getFisrtName());
        user.setLastname(PageFactory.accountPage.getLastName());
        user.setEmail(PageFactory.accountPage.getEmail());
        return user;
    }
}
