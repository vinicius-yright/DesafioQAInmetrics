package br.com.inmetrics.teste.functionalities;

import br.com.inmetrics.teste.commons.BaseTest;
import br.com.inmetrics.teste.pages.CadastroWebPage;
import br.com.inmetrics.teste.pages.GerenciarFuncionariosWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GerenciarFuncionariosFunctionality extends BaseTest {

    private GerenciarFuncionariosWebPage gerenciarFuncionariosWebPage;
    private CadastroWebPage cadastroWebPage;

    public GerenciarFuncionariosFunctionality() {
        this.gerenciarFuncionariosWebPage = new GerenciarFuncionariosWebPage(webDriver);
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }

    public void clickTelaFuncionarios() {
        wait.until(ExpectedConditions.elementToBeClickable(this.gerenciarFuncionariosWebPage.getBtnTelaFuncionarios()));
        this.gerenciarFuncionariosWebPage.getBtnTelaFuncionarios().click();
    }

    public void deletarFuncionario() {
        wait.until(ExpectedConditions.elementToBeClickable(this.gerenciarFuncionariosWebPage.getBtnDeletarFuncionario()));
        this.gerenciarFuncionariosWebPage.getBtnDeletarFuncionario().click();
    }

    public void clickEditarFuncionario() {
        wait.until(ExpectedConditions.elementToBeClickable(this.gerenciarFuncionariosWebPage.getBtnEditarFuncionario()));
        this.gerenciarFuncionariosWebPage.getBtnEditarFuncionario().click();
    }

    public void editarFuncionario() {
        wait.until(ExpectedConditions.elementToBeClickable(this.cadastroWebPage.getBtnCadastrar()));
        this.cadastroWebPage.getTxtNome().clear();
        this.cadastroWebPage.getTxtNome().sendKeys("Funcionario nome editado");
        this.cadastroWebPage.getTxtCargo().clear();
        this.cadastroWebPage.getTxtCargo().sendKeys("Funcionario cargo editado");
        this.cadastroWebPage.getTxtDinheiro().clear();
        this.cadastroWebPage.getTxtDinheiro().sendKeys("999");
    }

    public String pegaMensagemExclusaoSucesso() {
        wait.until(ExpectedConditions.elementToBeClickable(this.gerenciarFuncionariosWebPage.getMsgUsuarioDeletado()));
        return this.gerenciarFuncionariosWebPage.getMsgUsuarioDeletado().getText();
    }

    public String pegaMensagemEdicaoSucesso() {
        wait.until(ExpectedConditions.elementToBeClickable(this.gerenciarFuncionariosWebPage.getMsgUsuarioEditado()));
        return this.gerenciarFuncionariosWebPage.getMsgUsuarioEditado().getText();
    }
}
