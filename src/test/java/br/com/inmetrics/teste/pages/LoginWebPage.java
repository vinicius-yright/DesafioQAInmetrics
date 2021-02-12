package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage {

    public LoginWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement txtUsername;

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement txtPassword;

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement btnLogin;

    public WebElement getBtnLogin() {
        return btnLogin;
    }



}
