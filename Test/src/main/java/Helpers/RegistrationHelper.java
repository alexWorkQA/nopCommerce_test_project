package Helpers;

import Factories.PageFactory;
import Models.User;

public class RegistrationHelper {

    public void registrateValidUser(User user){
        PageFactory.registerPage.fillOutForm(user);
    }

    public String getAssertMessage(){
        return PageFactory.registerResultPage.getMessage();
    }

    public void completeRegistration(){
        PageFactory.registerResultPage.clickContinue();
    }
}
