package Application;


import Factories.PageFactory;
import Helpers.*;
import Interfaces.Applicationable;

public class ApplicationManager implements Applicationable {


    public LoginHelper loginHelper = new LoginHelper();
    public NavigationHelper navigationHelper = new NavigationHelper();
    public RegistrationHelper registrationHelper = new RegistrationHelper();
    public ProductHelper productHelper = new ProductHelper();
    public ShoppingCartHelper shoppingCartHelper = new ShoppingCartHelper();


    @Override
    public void start() {
        PageFactory.init();
        //navigationHelper.openMainPage();
        navigationHelper.openMainPageViaUrl();
    }

    @Override
    public void stop() {
       // PageFactory.basePage.closeWebApp();
        navigationHelper.closeWebBrowser();
    }
}
