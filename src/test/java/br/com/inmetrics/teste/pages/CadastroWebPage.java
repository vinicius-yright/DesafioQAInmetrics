package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroWebPage {

    public CadastroWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(), 'Novo Funcionário')]")
    private WebElement btnIniciarCadastro;

    @FindBy(xpath = "//input[@name='nome']")
    private WebElement txtNome;

    @FindBy(xpath = "//input[@id='cpf']")
    private WebElement txtCpf;

    @FindBy(xpath = "//input[@id='inputAdmissao']")
    private WebElement txtAdmissao;

    @FindBy(xpath = "//input[@id='inputCargo']")
    private WebElement txtCargo;

    @FindBy(xpath = "//input[@id='dinheiro']")
    private WebElement txtDinheiro;

    @FindBy(xpath = "//input[@id='clt']")
    private WebElement selectClt;

    @FindBy(xpath = "//input[@class='cadastrar-form-btn']")
    private WebElement btnCadastrar;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement txtSucesso;

    public WebElement getTxtNome() {
        return txtNome;
    }

    public WebElement getTxtCpf() {
        return txtCpf;
    }

    public WebElement getBtnIniciarCadastro() {
        return btnIniciarCadastro;
    }

    public WebElement getTxtAdmissao() {
        return txtAdmissao;
    }

    public WebElement getTxtCargo() {
        return txtCargo;
    }

    public WebElement getTxtDinheiro() {
        return txtDinheiro;
    }

    public WebElement getSelectClt() {
        return selectClt;
    }

    public WebElement getBtnCadastrar() {
        return btnCadastrar;
    }

    public WebElement getTxtSucesso() {
        return txtSucesso;
    }
}
