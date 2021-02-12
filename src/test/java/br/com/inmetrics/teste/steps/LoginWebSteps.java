package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.RealizarLoginFunctionality;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginWebSteps {
    RealizarLoginFunctionality realizarLoginFunctionality;

    public LoginWebSteps() {
        this.realizarLoginFunctionality = new RealizarLoginFunctionality();
    }

    @Dado("^que quero logar no site do desafio com sucesso$")
    public void queQueroLogarNoSiteComSucesso() {
        System.out.println("Iniciando teste de login...");
    }


    @Quando("^insiro as informacoes corretas e clico no botao Entrar$")
    public void insiroAsInformacoesCorretasEClicoNoBotaoEntrar() {
        this.realizarLoginFunctionality.realizaLogin();
    }


    @Entao("^visualizo a tela inicial$")
    public void visualizoATelaInicial() {
        System.out.println("Teste");
    }


}
