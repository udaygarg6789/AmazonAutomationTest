package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/GoogleSearch.feature", glue = {"StepDefinition"},
monochrome = true,
plugin = {"pretty", "html:target/HTMLReports/Reporting.html"})

public class TestRunnerTest {

}