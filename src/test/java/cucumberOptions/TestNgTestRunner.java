package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Features",
glue="stepDefinition")
public class TestNgTestRunner extends AbstractTestNGCucumberTests{

}
