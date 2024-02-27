package automationpractice.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/automationpractice/cucumber",glue="automationpractice.StepDefinition",monochrome=true,plugin= {"html:target/automationpracticeCucumberReport.html"})
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {

}
