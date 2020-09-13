package RunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
		features = "C:\\Users\\91963\\eclipse-workspace\\Project\\WeAd\\src\\main\\java\\Features\\Login.feature", //the path of the feature files
		glue={"stepDefinition"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		
		)


		 class TestRunner {

}
