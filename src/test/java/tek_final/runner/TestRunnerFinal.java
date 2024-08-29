package tek_final.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Directory for Feature file
        glue = "tek_final.steps", //Package for all the steps
        dryRun = false,//set to true to scan feature for unimplemented steps
        //tags = "@UserStory8",
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "html:target/cucumber-report/report.html",
                "pretty",
        }
)

public class TestRunnerFinal {

}



