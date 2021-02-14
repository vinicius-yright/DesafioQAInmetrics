package br.com.inmetrics.teste.runner;

import br.com.inmetrics.teste.commons.BaseTestWeb;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author vinicius souza
 *
 */
	
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/cucumber.json" }, features = { "./src/test/resources/featuresWeb", "./src/test/resources/featuresApi",  }, glue = {
				"br.com.inmetrics.teste.configuration","br.com.inmetrics.teste.steps" },
        tags = {"@alterarCadastroSucesso"})

public class RunCucumberTest extends BaseTestWeb {
		@AfterClass
		public static void AfterTests() {
			if (webDriver != null) {
				closeWeb();
			}
		}
}
