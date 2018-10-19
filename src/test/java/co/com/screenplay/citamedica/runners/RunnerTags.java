package co.com.screenplay.citamedica.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/gestion_citas_medicas.feature",
		tags= "@tag",
		glue="co.com.screenplay.citamedica.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class RunnerTags {

}
