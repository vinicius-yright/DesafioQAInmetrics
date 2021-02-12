package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.CadastroFunctionality;
import br.com.inmetrics.teste.functionalities.ObterDadosCadastraisFunctionality;
import br.com.inmetrics.teste.functionalities.RealizarLoginFunctionality;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;

public class CadastroWebSteps {

    CadastroFunctionality cadastroFunctionality;
    RealizarLoginFunctionality realizarLoginFunctionality;
    ObterDadosCadastraisFunctionality obterDadosCadastraisFunctionality;

    public CadastroWebSteps() {
        this.cadastroFunctionality = new CadastroFunctionality();
        this.realizarLoginFunctionality = new RealizarLoginFunctionality();
        this.obterDadosCadastraisFunctionality = new ObterDadosCadastraisFunctionality();
    }

    @Dado("^que quero cadastrar um funcionario com sucesso$")
    public void queQueroLogarNoSiteComSucesso() {
        this.realizarLoginFunctionality.realizaLogin();
        this.cadastroFunctionality.clickIrTelaCadastro();
    }

    @E("^insiro as informacoes validas$")
    public void insiroAsInformacoesValidas() throws IOException {
        this.cadastroFunctionality.preencheDadosCadastro();
    }

    @Quando("^clico no botao Submit Query$")
    public void clicoNoBotaoSubmitQuery() {
        this.cadastroFunctionality.clickFinalizarCadastro();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagem(String mensagem) {
        Assert.assertTrue(this.cadastroFunctionality.pegaMensagemSucesso().contains(mensagem));
    }
}
