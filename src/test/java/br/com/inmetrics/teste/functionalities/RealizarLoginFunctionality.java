package br.com.inmetrics.teste.functionalities;

import br.com.inmetrics.teste.commons.BaseTestWeb;
import br.com.inmetrics.teste.pages.LoginWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RealizarLoginFunctionality extends BaseTestWeb {

    private LoginWebPage loginWebPage;

    public RealizarLoginFunctionality() {
        this.loginWebPage = new LoginWebPage(webDriver);
    }

    public void realizaLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(this.loginWebPage.getTxtUsername()));
        this.loginWebPage.getTxtUsername().sendKeys("inmetrics");
        wait.until(ExpectedConditions.elementToBeClickable(this.loginWebPage.getTxtPassword()));
        this.loginWebPage.getTxtPassword().sendKeys("automacao");
        wait.until(ExpectedConditions.elementToBeClickable(this.loginWebPage.getBtnLogin()));
        this.loginWebPage.getBtnLogin().click();
    }

}
