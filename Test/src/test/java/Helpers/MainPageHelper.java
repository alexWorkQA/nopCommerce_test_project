package Helpers;

import Pages.MainPage;

public class MainPageHelper extends MainPage {

    public MainPageHelper() {
    }

    public void openLoginPage(){
        clickLogInButton();
    }

   public void openAccountPage(){
        clickMyAccountButton();
   }
}
