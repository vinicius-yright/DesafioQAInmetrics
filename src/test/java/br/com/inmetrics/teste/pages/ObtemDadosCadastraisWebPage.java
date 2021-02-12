package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObtemDadosCadastraisWebPage {

    public ObtemDadosCadastraisWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "bt_gerar_pessoa")
    private WebElement btn4GerarPessoa;

    @FindBy(id = "nome")
    private WebElement btn4Nome;

    @FindBy(id = "cpf")
    private WebElement btn4Cpf;

    @FindBy(id = "data_nasc")
    private WebElement btn4Data;

    @FindBy(id = "email")
    private WebElement btn4Email;

    @FindBy(id = "telefone_fixo")
    private WebElement btn4Tel;


    public WebElement getBtn4GerarPessoa() {
        return btn4GerarPessoa;
    }

    public WebElement getBtn4Nome() {
        return btn4Nome;
    }

    public WebElement getBtn4Cpf() {
        return btn4Cpf;
    }

    public WebElement getBtn4Data() {
        return btn4Data;
    }

    public WebElement getBtn4Email() {
        return btn4Email;
    }

    public WebElement getBtn4Tel() {
        return btn4Tel;
    }




}
