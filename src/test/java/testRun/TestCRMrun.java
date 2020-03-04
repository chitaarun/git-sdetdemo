package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\sunda\\my-workspace\\cucumber\\Features\\FreeCRM.feature",
		glue="stepdefinition"
		)

public class TestCRMrun {

}
