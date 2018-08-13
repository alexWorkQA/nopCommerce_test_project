package Application;


import Factories.PageFactory;
import Helpers.*;
import Interfaces.Applicationable;

public class ApplicationManager implements Applicationable {
    public MainPageHelper mainPageHelper = new MainPageHelper();
    public CommonHelper commonHelper = new CommonHelper();
    public LoginPageHelper loginPageHelper = new LoginPageHelper();
    public AccountPageHelper accountPageHelper = new AccountPageHelper();
    public RegisterPageHelper registerPageHelper = new RegisterPageHelper();
    public RegisterResultPageHelper registerResultPageHelper = new RegisterResultPageHelper();
    public ComputersPageHelper computersPageHelper = new ComputersPageHelper();
    public NotebooksPageHelper notebooksPageHelper = new NotebooksPageHelper();
    public ProductPageHelper productPageHelper = new ProductPageHelper();

    public LoginHelper loginHelper = new LoginHelper();
    public NavigationHelper navigationHelper = new NavigationHelper();
    public RegistrationHelper registrationHelper = new RegistrationHelper();
    public ProductHelper productHelper = new ProductHelper();


    @Override
    public void start() {
        commonHelper.openWebSite();
        PageFactory.init();
    }

    @Override
    public void stop() {
        commonHelper.closeWebBrowser();
    }
}
