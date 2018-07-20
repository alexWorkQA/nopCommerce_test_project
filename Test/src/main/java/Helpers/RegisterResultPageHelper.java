package Helpers;

import Pages.RegisterResultPage;

public class RegisterResultPageHelper extends RegisterResultPage {

    public String getMessageForAssert(){
        return getMessage();
    }

    public void completeRegistration(){
        clickContinue();
    }
}
