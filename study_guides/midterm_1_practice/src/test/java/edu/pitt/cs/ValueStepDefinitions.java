package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	// TODO: Fill in!
	private Value value;

	@Given("a Value")
	public void aValue() {
		// Write code here that turns the phrase above into concrete actions
		value = new Value();
	}

	@When("I call incVal {int} time(s)")
	public void iCallIncValTimes(Integer num) {
		// Write code here that turns the phrase above into concrete actions
		for (int i=0; i<num; i++){
			value.incVal();
		}
	}
	@Then("getVal returns {int}")
	public void getValReturns(Integer result) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals((int) result, value.getVal());
	}
}
