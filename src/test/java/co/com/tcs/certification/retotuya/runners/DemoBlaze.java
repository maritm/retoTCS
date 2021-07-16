package co.com.tcs.certification.retotuya.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/demoblaze.feature",
        glue = "co.com.tcs.certification.retotuya.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class DemoBlaze {
}
