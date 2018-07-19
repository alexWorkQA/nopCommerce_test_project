package Helpers;

import Factories.WebSiteFactory;
import Pages.BasePage;

public class CommonHelper extends BasePage {

    public CommonHelper() {
    }

    public void openWebSite(){
        driver.get(WebSiteFactory.getSite().siteUrl);
    }

    public void closeWebBrowser(){
        driver.quit();
    }
}
