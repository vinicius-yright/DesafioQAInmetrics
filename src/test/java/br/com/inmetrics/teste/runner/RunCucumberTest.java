package br.com.inmetrics.teste.runner;

import br.com.inmetrics.teste.commons.BaseTest;
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
		"json:target/cucumber.json" }, features = { "./src/test/resources/features" }, glue = {
				"br.com.inmetrics.teste.configuration","br.com.inmetrics.teste.steps" },
        tags = {"@editarSucesso"})

public class RunCucumberTest extends BaseTest {
		@AfterClass
		public static void AfterTests() {
			if (webDriver != null) {
				closeWeb();
			}
		}
}
