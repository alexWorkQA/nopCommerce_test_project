package Interfaces;

import org.openqa.selenium.WebElement;

public interface PageManager {

    void click(WebElement element);
    void sendKey(WebElement element,String key);
    String getText(WebElement element);
}
