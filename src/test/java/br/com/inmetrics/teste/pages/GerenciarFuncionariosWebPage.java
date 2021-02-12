package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GerenciarFuncionariosWebPage {

    public GerenciarFuncionariosWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Funcionários')]")
    private WebElement btnTelaFuncionarios;

    @FindBy(xpath = "//button[1][@id='delete-btn']")
    private WebElement btnDeletarFuncionario;

    @FindBy(xpath = "//button[@class[1]='btn btn-warning']")
    private WebElement btnEditarFuncionario;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show']")
    private WebElement msgUsuarioDeletado;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show']")
    private WebElement msgUsuarioEditado;

    public WebElement getBtnTelaFuncionarios() {
        return btnTelaFuncionarios;
    }

    public WebElement getBtnDeletarFuncionario() {
        return btnDeletarFuncionario;
    }

    public WebElement getBtnEditarFuncionario() {
        return btnEditarFuncionario;
    }

    public WebElement getMsgUsuarioDeletado() {
        return msgUsuarioDeletado;
    }

    public WebElement getMsgUsuarioEditado() {
        return msgUsuarioEditado;
    }
}
