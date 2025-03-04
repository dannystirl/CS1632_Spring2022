import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {

	Value v = new Value(); 

	@Given("a Value")
	public void aValue() {
		v = new Value(); 
	}

	@When("I call incVal {int} times")
	public void incValue(int times) {
		for(int i=0; i<times; i++){
			v.incVal();
		}
	}

	@Then("getVal returns {int}")
	public void retValue(int times) {
		assertEquals(times, v.getVal()); 
	}
}
