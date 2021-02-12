package br.com.inmetrics.teste.configuration;

import br.com.inmetrics.teste.commons.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public enum Web implements WebApplication {

    CHROME_WINDOWS {
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver","chromedriver_windows/chromedriver.exe");
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            return new ChromeDriver(options);
        }
    }

}
