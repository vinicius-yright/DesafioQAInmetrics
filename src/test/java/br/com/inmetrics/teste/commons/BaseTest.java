package br.com.inmetrics.teste.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;


    protected void initializeWebApplication(WebApplication webApplication, boolean siteDesafio) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        if (siteDesafio) {
            webDriver.get(PropertiesManager.getPropertiesValue("URL_DESAFIO"));
        } else  {
            webDriver.get(PropertiesManager.getPropertiesValue("URL_4DEVS"));
        }

        wait = new WebDriverWait(webDriver, 30);
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
