package cucumber.Options;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features= {"src/test/java/Features"},plugin="json:target/jsonReports/cucumber-reporting.json",glue= {"Stepdefinitions"},tags= "@DeleteAPI")

public class Testrunner {

}
