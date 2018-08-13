package Helpers;

import Factories.PageFactory;
import com.gargoylesoftware.htmlunit.Page;

public class NavigationHelper {

    public void openRegistrationPage() {
        PageFactory.mainPage.clickRegisterButton();
    }

    public void openMainPage() {
        PageFactory.basePage.visit();
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

    public void openNotebooksPage(){
        PageFactory.computersPage.clickNotebooksLink();
    }
}
