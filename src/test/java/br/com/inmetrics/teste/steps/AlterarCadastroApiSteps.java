package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.AlterarCadastroApiFunctionality;
import br.com.inmetrics.teste.functionalities.CadastroAPIFunctionality;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.io.IOException;


public class AlterarCadastroApiSteps {

    AlterarCadastroApiFunctionality alterarCadastroApiFunctionality;

    public AlterarCadastroApiSteps() {
        this.alterarCadastroApiFunctionality = new AlterarCadastroApiFunctionality();
    }


    @Dado("^que quero alterar os dados de um empregado com sucesso$")
    public void queQueroAlterarOsDadosDeUmEmpregadoComSucesso() {
    }

    @Quando("^envio o request com id do empregado$")
    public void envioORequestComIdDoEmpregado() throws IOException {
        this.alterarCadastroApiFunctionality.alteraEmpregado();
    }

    @Entao("^altero os dados de um empregado com sucesso$")
    public void alteroOsDadosDeUmEmpregadoComSucesso() {
    }
}
