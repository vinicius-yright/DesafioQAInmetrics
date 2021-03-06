package br.com.inmetrics.teste.configuration;

import br.com.inmetrics.teste.commons.BaseTestWeb;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Hooks extends BaseTestWeb {

    @Before(value = "@loginSucesso")
    public void beforeLoginSucesso() {
        initializeWebApplication(Web.CHROME_WINDOWS, true);
    }

    @After(value = "@loginSucesso")
    public void afterLoginSucesso() {
        closeWeb();
    }

    @Before(value = "@obterSucesso")
    public void beforeDadosSucesso() {
        initializeWebApplication(Web.CHROME_WINDOWS, false);
    }

    @After(value = "@obterSucesso")
    public void afterDadosSucesso() {
        closeWeb();
    }

    @Before(value = "@cadastroSucesso")
    public void beforeCadastroSucesso() {
        initializeWebApplication(Web.CHROME_WINDOWS, true);
    }

    @After(value = "@cadastroSucesso")
    public void afterCadastroSucesso() {
        closeWeb();
    }

    @Before(value = "@excluirSucesso")
    public void beforeExclusaoSucesso() {
        initializeWebApplication(Web.CHROME_WINDOWS, true);
    }

    @After(value = "@excluirSucesso")
    public void afterExclusaoSucesso() {
        closeWeb();
    }

    @Before(value = "@editarSucesso")
    public void beforeEdicaoSucesso() {
        initializeWebApplication(Web.CHROME_WINDOWS, true);
    }

    @After(value = "@editarSucesso")
    public void afterEdicaoSucesso() {
        closeWeb();
    }


}
