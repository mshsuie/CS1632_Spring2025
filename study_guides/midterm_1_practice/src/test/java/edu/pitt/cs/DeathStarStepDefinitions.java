package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class DeathStarStepDefinitions {
	private DeathStar deathStar;
	private Planet planet;
	private String ret;

	@Given("a DeathStar")
	public void aDeathStar() {
		deathStar = new DeathStar();
	}

	@Given("a Planet with {int} hit points")
	public void aPlanetWithHitPoints(Integer int1) {
		planet = new Planet(int1);
	}

	@When("I shoot the planet with the deathStar")
	public void iShootThePlanetWithTheDeathStar() {
		ret = deathStar.shoot(planet);
	}

	@Then("the returned message is {string}")
	public void theReturnedMessageIs(String expectedMessage) {
		assertEquals(expectedMessage, ret);
	}

	@Then("the planet had {int} hit points remaining")
	public void thePlanetHadHitPointsRemaining(Integer int1) {
		assertEquals((int) int1, planet.getHitPoints());
	}
}
