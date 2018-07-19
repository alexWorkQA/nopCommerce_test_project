package Factories;

import Models.Site;

import java.util.ResourceBundle;

public class WebSiteFactory {
    static ResourceBundle resourceSite;

    static {
        resourceSite = ResourceBundle.getBundle("sites");
    }

    public static Site getSite(){
        return new Site (resourceSite.getString("site.Url"));
    }
}
