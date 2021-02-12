package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.CadastroFunctionality;
import br.com.inmetrics.teste.functionalities.GerenciarFuncionariosFunctionality;
import br.com.inmetrics.teste.functionalities.ObterDadosCadastraisFunctionality;
import br.com.inmetrics.teste.functionalities.RealizarLoginFunctionality;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class GerenciarFuncionariosWebSteps {

    RealizarLoginFunctionality realizarLoginFunctionality;
    GerenciarFuncionariosFunctionality gerenciarFuncionariosFunctionality;
    CadastroFunctionality cadastroFunctionality;

    public GerenciarFuncionariosWebSteps() {
        this.realizarLoginFunctionality = new RealizarLoginFunctionality();
        this.gerenciarFuncionariosFunctionality = new GerenciarFuncionariosFunctionality();
        this.cadastroFunctionality = new CadastroFunctionality();
    }

    @Dado("^que quero excluir um funcionario com sucesso$")
    public void queQueroExcluirUmFuncionarioComSucesso() {
        this.realizarLoginFunctionality.realizaLogin();
    }

    @Quando("^clico no botao de lixeira$")
    public void clicoNoBotaoDeLixeira() {
        this.gerenciarFuncionariosFunctionality.clickTelaFuncionarios();
        this.gerenciarFuncionariosFunctionality.deletarFuncionario();
    }

    @Entao("^vejo a mensagem \"([^\"]*)\"$")
    public void vejoAMensagem(String mensagem) {
        Assert.assertTrue((this.gerenciarFuncionariosFunctionality.pegaMensagemExclusaoSucesso().contains(mensagem)));
    }

    @Dado("^que quero editar um funcionario com sucesso$")
    public void queQueroEditarUmFuncionarioComSucesso() {
        this.realizarLoginFunctionality.realizaLogin();
    }

    @E("^clico no botao de lapis$")
    public void clicoNoBotaoDeLapis() {
        this.gerenciarFuncionariosFunctionality.clickEditarFuncionario();
    }

    @Quando("^edito as informacoes e clico no botao Submit Query$")
    public void editoAsInformacoesEClicoNoBotaoSubmitQuery() {
        this.gerenciarFuncionariosFunctionality.editarFuncionario();
        this.cadastroFunctionality.clickFinalizarCadastro();
    }

    @Entao("^recebo a mensagem \"([^\"]*)\"$")
    public void receboAMensagem(String mensagem) {
        Assert.assertTrue(this.gerenciarFuncionariosFunctionality.pegaMensagemEdicaoSucesso().contains(mensagem));
    }


}
