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
    public MoneyHelper moneyHelper = new MoneyHelper();


    @Override
    public void start() {
        PageFactory.init();
        navigationHelper.openMainPageViaUrl();
    }

    public void alStart(){
        PageFactory.init();
    }

    @Override
    public void stop() {
        navigationHelper.closeWebBrowser();
    }
}
