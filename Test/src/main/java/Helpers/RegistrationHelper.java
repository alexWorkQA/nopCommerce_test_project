package Helpers;

import Factories.PageFactory;
import Models.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RegistrationHelper {

    public void registrateUser(User user){
        PageFactory.registerPage.fillOutForm(user);
    }

    public String getAssertMessage(){
        return PageFactory.registerResultPage.getMessage();
    }

    public void completeRegistration(){
        PageFactory.registerResultPage.clickContinue();
    }

    public String getFNameErrorMessage(){
        return PageFactory.registerPage.getFNameErrorMessage();
    }

    public String getLNameErrorMessage(){
        return PageFactory.registerPage.getLNameErrorMessage();
    }

    public String getEMailErrorMessage(){
        return PageFactory.registerPage.getEMailErrorMessage();
    }

    public String getPasswordErrorMessage() { return PageFactory.registerPage.getPasswordErrorMessage(); }
}
