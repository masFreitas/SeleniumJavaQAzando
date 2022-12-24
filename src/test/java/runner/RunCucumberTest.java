package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {}, //use to configure reports
        features = "src/test/resources/features", //directory where feature are
        tags = {"~@ignore"}, //use to run tagged BBDs
        glue = {"steps"} //directory where steps are
)
public class RunCucumberTest {
}
