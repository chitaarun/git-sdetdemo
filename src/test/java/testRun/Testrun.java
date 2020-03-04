/**
 * 
 */
package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author sunda
 *mukesh video selenium cucumber
 */


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
                   glue="stepdefinition")
public class Testrun {

}
