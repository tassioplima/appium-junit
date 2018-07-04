package br.tassio.desafio.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"json:target/surefire-reports/cucumber.json" }, features = {"./src/test/resources/features"}, 
				glue = { "br.tassio.desafio.qa.mobile.steps", "br.tassio.desafio.qa.configuration"}, tags = { "@CTINSTA001" })

public class RunTest {

}