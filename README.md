# Description
This is an example project, which created for testing "http://demo.nopcommerce.com".
Main goal of project is training of testing Web App.

Projects uses:
 - Java
 - TestNG
 - Selenium WebDriver
 - PageObject + Page Factory

Tests:
- Login test
- Registration test
- Add to Shopping cart tests
- Modify/Edit shopping cart

Known problem
- PageFactory class has a lot of Ctrl-C/Ctrl-V in init() method:

    public static void init() {
        //basePage = PageFactory.initElements(driver, BasePage.class);
        accountPage = PageFactory.initElements(driver, AccountPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        computersPage = PageFactory.initElements(driver, ComputersPage.class);
        desktopsPage = PageFactory.initElements(driver, DesktopsPage.class);
        notebooksPage = PageFactory.initElements(driver, NotebooksPage.class);
        productPage = PageFactory.initElements(driver, ProductPage.class);
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        registerResultPage = PageFactory.initElements(driver, RegisterResultPage.class);
        shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
        desktopsPage = PageFactory.initElements(driver,DesktopsPage.class);
    }


