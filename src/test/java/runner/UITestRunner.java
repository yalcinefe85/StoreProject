package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/uiFeatures/AuthenticationFunctionality.feature",
        glue = "stepDefs",
        dryRun = false,
        tags = "@TECH-1010"
)
public class UITestRunner {

}
