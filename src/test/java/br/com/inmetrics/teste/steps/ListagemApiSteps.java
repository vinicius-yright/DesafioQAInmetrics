package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.ListagemFunctionality;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class ListagemApiSteps {

    ListagemFunctionality listagemFunctionality;

    public ListagemApiSteps() {
        this.listagemFunctionality = new ListagemFunctionality();
    }

    @Dado("^que quero listar todos os empregados com sucesso$")
    public void queQueroObterDadosDeCadastroComSucesso() {
    }

    @Quando("^envio o request para endpoint empregados$")
    public void envioORequest() {
        this.listagemFunctionality.listaTodosEmpregados();
    }

    @Entao("^recebo a lista com empregados$")
    public void receboAListaComEmpregados() {
    }

    @Dado("^que quero listar um usuario especifico com sucesso$")
    public void queQueroListarUmUsuarioEspecificoComSucesso() {
    }

    @Quando("^envio o request para endpoint listagem filtrada$")
    public void envioORequestParaEndpointListagemFiltrada() {
        this.listagemFunctionality.listaEmpregadoEspecifico();
    }

    @Entao("^recebo o empregado$")
    public void receboOEmpregado() {
    }
}
