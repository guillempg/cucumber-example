package com.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ExampleSteps {

	private Example gameExample;
	private String gameResult;
	@Given("^I am officiating a FizzBuzz game$")
	public void I_am_officiating_a_FizzBuzz_game() {
		gameExample = new Example();
	}
	@When("^the number (\\d+) is played$")
	public void the_number_is_played(int playedNumber) {
		gameResult = gameExample.checkPlay(playedNumber);
	}
	@Then("^I should be told the correct answer is \"([^\"]*)\"$")
	public void I_should_be_told_the_correct_answer_is(String expectedResult) {
		assertEquals(expectedResult, gameResult);
	}
}
