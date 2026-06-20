package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions
(
  features="src/test/java/features",
  glue="stepdefinitions",
  plugin={"pretty","html:target/cucumber-report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests
  {
  }
