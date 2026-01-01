package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features ="src/test/resources/features",
	glue= {"steps", "hooks"},
	tags="@smoke or @sanity",
	plugin = {
			"pretty",
			"html:reports/cucumber.html",
			"json:reports/cucumber.json"
			
	},
	monochrome=true //format of report
)

public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
