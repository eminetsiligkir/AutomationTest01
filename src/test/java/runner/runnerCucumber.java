package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;


@CucumberOptions(
        glue = {"stepDefinitions","util"},
        features = {"src/test/java/Features"},
        tags = "@TextBox")
//dryRun = false

public class runnerCucumber extends AbstractTestNGCucumberTests{
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() { return super.scenarios();}
}
