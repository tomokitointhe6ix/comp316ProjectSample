package TestProject1A;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	private Car car;
	@Given("^The car tank contains (\\d+) liters of fuel.$")
	public void leftAmount(int arg1) throws Throwable {
        car = new Car(arg1);
	}

	@When("^The driver refueled (\\d+) liters$")
	public void refuleAmount(int arg1) throws Throwable {
        car.addFuel(arg1);
	}

	@Then("^The tank contains (\\d+) liters of fuel$")
	public void totalAmount(int arg1) throws Throwable {
        int actualFuelLevel = car.getFuelLevel();
        assertThat(actualFuelLevel, is(arg1));
	}
}