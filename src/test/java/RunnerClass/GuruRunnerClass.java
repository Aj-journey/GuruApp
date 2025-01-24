package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
 
		features="src\\test\\java\\FeatureFile",
		glue= "StepDefination",
		monochrome= true,
	   dryRun=false
		
		
		)
public class GuruRunnerClass extends AbstractTestNGCucumberTests {

}
