package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.functionalities.ObterDadosCadastraisFunctionality;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.io.IOException;

public class ObtemDadosCadastraisWebSteps {
    ObterDadosCadastraisFunctionality obterDadosCadastraisFunctionality = new ObterDadosCadastraisFunctionality();

    public ObtemDadosCadastraisWebSteps() {
        this.obterDadosCadastraisFunctionality = new ObterDadosCadastraisFunctionality();
    }

    @Dado("^que quero obter dados de cadastro validos atraves do site 4devs$")
    public void queQueroObterDadosDeCadastroComSucesso() {
    }

    @Quando("^clico no botao Gerar Pessoa$")
    public void clicoNoBotaoGerarPessoa() {
        this.obterDadosCadastraisFunctionality.clickGerarPessoa();
    }

    @Entao("^obtenho os dados validos$")
    public void obtenhoOsDadosValidos() throws IOException, InterruptedException {
        Thread.sleep(2000);
        this.obterDadosCadastraisFunctionality.armazenaDados();
    }

}
