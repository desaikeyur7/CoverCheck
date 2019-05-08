package CoverCheckTest;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@Smoke,@Regression",monochrome = true, plugin = {"pretty", "html:target/reports"})


public class RunTest {
}

