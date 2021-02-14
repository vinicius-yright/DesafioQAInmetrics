package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.CadastroWebFunctionality;
import br.com.inmetrics.teste.functionalities.ObterDadosCadastraisFunctionality;
import br.com.inmetrics.teste.functionalities.RealizarLoginFunctionality;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;

public class CadastroWebSteps {

    CadastroWebFunctionality cadastroWebFunctionality;
    RealizarLoginFunctionality realizarLoginFunctionality;
    ObterDadosCadastraisFunctionality obterDadosCadastraisFunctionality;

    public CadastroWebSteps() {
        this.cadastroWebFunctionality = new CadastroWebFunctionality();
        this.realizarLoginFunctionality = new RealizarLoginFunctionality();
        this.obterDadosCadastraisFunctionality = new ObterDadosCadastraisFunctionality();
    }

    @Dado("^que quero cadastrar um funcionario com sucesso$")
    public void queQueroLogarNoSiteComSucesso() {
        this.realizarLoginFunctionality.realizaLogin();
        this.cadastroWebFunctionality.clickIrTelaCadastro();
    }

    @E("^insiro as informacoes validas$")
    public void insiroAsInformacoesValidas() throws IOException {
        this.cadastroWebFunctionality.preencheDadosCadastro();
    }

    @Quando("^clico no botao Submit Query$")
    public void clicoNoBotaoSubmitQuery() {
        this.cadastroWebFunctionality.clickFinalizarCadastro();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagem(String mensagem) {
        Assert.assertTrue(this.cadastroWebFunctionality.pegaMensagemSucesso().contains(mensagem));
    }
}
