package Helpers;

import Factories.PageFactory;
import Models.User;

public class LoginHelper {

    public void loginUser(User user){
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

    public String getEmailErrorMessage(){
        return PageFactory.loginPage.getEmailErrorMessage();
    }

    public String getValidationErrorMessage(){
        return PageFactory.loginPage.getValidationErrorMessage();
    }
}
