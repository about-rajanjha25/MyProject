package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Rajan\\workspace\\OrangeHRM\\src\\main\\java\\features"}
                ,glue= {"stepDefinition"}, plugin= {"pretty"}, monochrome = true)

public class TestRunner {

	
	
}
