package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.CadastroAPIFunctionality;
import br.com.inmetrics.teste.functionalities.ListagemFunctionality;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.io.IOException;


public class CadastroApiSteps {

    CadastroAPIFunctionality cadastroAPIFunctionality;

    public CadastroApiSteps() {
        this.cadastroAPIFunctionality = new CadastroAPIFunctionality();
    }


    @Dado("^que quero cadastrar um empregado com sucesso$")
    public void queQueroCadastrarUmEmpregadoComSucesso() {
    }

    @Quando("^envio o request com parametros corretos$")
    public void envioORequestComParametrosCorretos() throws IOException {
        this.cadastroAPIFunctionality.cadastraEmpregado();
    }

    @Entao("^cadastro um empregado com sucesso$")
    public void cadastroUmEmpregadoComSucesso() {
    }
}
