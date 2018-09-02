package br.tassio.desafio.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE,dryRun = true, plugin = {"pretty",
		"json:target/surefire-reports/cucumber.json", "html:target/selenium-reports" }, features = {"classpath:features"},
				glue = {"classpath:steps", "classpath:configuration"}, tags = { "@CTINSTA001" })

public class RunTest {

}