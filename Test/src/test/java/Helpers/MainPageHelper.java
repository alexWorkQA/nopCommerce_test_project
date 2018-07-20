package Helpers;

import Pages.MainPage;

public class MainPageHelper extends MainPage {

    public MainPageHelper() {
    }

    public void openLoginPage(){
        clickLogInButton();
    }

    public void logout(){
        clickLogoutButton();
    }

   public void openAccountPage(){
        clickMyAccountButton();
   }

   public void openRegisterPage(){
        clickRegisterButton();
   }
}
