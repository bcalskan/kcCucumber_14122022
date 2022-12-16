package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= "stepDefinitions",
        tags = "@config",
        dryRun = false

        /*
        dryRun = true --> zeigt nur fehlende Schritte im Code.
        dryRund = false --> einfach ausgeführt
         */
)
public class Runner {

}
