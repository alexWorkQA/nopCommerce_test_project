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

    public void openRegistrationPageViaUrl(){
        WebDriverFactory.getDriverInstance().get(WebSiteFactory.getSite().siteUrl+"/register");
    }

    public void openRegistrationPage() {
        PageFactory.mainPage.clickRegisterButton();
    }

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

    public void openDesktopPage(){PageFactory.computersPage.clickDesktopsLink();}

    public void openShoppingCartPage() {
        PageFactory.mainPage.clickShoppingCartLink();
    }

    public void closeWebBrowser(){
        WebDriverFactory.getDriverInstance().quit();
    }
}
