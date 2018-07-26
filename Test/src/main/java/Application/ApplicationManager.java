package Application;


import Helpers.*;
import Interfaces.Applicationable;
import Pages.AccountPage;

import java.io.IOException;

public class ApplicationManager implements Applicationable {
    public MainPageHelper mainPageHelper = new MainPageHelper();
    public CommonHelper commonHelper = new CommonHelper();
    public LoginPageHelper loginPageHelper = new LoginPageHelper();
    public AccountPageHelper accountPageHelper = new AccountPageHelper();
    public RegisterPageHelper registerPageHelper = new RegisterPageHelper();
    public RegisterResultPageHelper registerResultPageHelper = new RegisterResultPageHelper();


    @Override
    public void start() {
        commonHelper.openWebSite();
    }

    @Override
    public void stop() {
        commonHelper.closeWebBrowser();
    }
}
