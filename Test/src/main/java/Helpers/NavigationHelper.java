package Helpers;

import Factories.PageFactory;
import Factories.WebDriverFactory;
import Factories.WebSiteFactory;

public class NavigationHelper {


    public void openMainPageViaUrl(){
        WebDriverFactory.getDriverInstance().get(WebSiteFactory.getSite().siteUrl);
    }

    public void openLoginPageViaURL(){
        WebDriverFactory.getDriverInstance().get(WebSiteFactory.getSite().siteUrl+"/login");
    }

    public void openRegistrationPage() {
        PageFactory.mainPage.clickRegisterButton();
    }

   // public void openMainPage() {
     //   PageFactory.basePage.visit();
    //}

    public void openLoginPage() {
        PageFactory.mainPage.clickLogInButton();
    }

    public void openAccountPage() {
        PageFactory.mainPage.clickMyAccountButton();
    }

    public void openComputerPage() {
        PageFactory.mainPage.clickComputersLink();
    }

    public void openNotebooksPage() {
        PageFactory.computersPage.clickNotebooksLink();
    }

    public void openShoppingCartPage() {
        PageFactory.mainPage.clickShoppingCartLink();
    }

    public void closeWebBrowser(){
        WebDriverFactory.getDriverInstance().quit();
    }
}