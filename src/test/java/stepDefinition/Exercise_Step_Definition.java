package stepDefinition;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ExercisePage;
import utulitis.Driver;
import utulitis.Helper;

public class Exercise_Step_Definition {
	Driver driver = new Driver();
	ExercisePage exercise = new ExercisePage();
	//Helper helper = new Helper();
	
	@Given("User get that url {string}")
	public void user_get_that_url(String string) {
	  Driver.getDriver().get(string);
	  Helper.waitFor(4);
		
	}

	@When("User see screen as successfully open")
	public void user_see_screen_as_successfully_open() {
		assertEquals( exercise.value1Label.isDisplayed(), "true");
		assertEquals( exercise.value2Label.isDisplayed(), "true");
		assertEquals( exercise.value3Label.isDisplayed(), "true");
		assertEquals( exercise.value4Label.isDisplayed(), "true");
		assertEquals( exercise.value5Label.isDisplayed(), "true");
		
	}

	@Then("user should see there are five values")
	public void user_should_see_there_are_five_values() {
		assertEquals( exercise.value1Label.isDisplayed(), "true");
		assertEquals( exercise.value2Label.isDisplayed(), "true");
		assertEquals( exercise.value3Label.isDisplayed(), "true");
		assertEquals( exercise.value4Label.isDisplayed(), "true");
		assertEquals( exercise.value5Label.isDisplayed(), "true");
		
		
	}
	
	@Then("user should see values are more than {int}")
	public void user_should_see_values_are_more_than(Integer int1) {
		boolean value1 = Helper.elementBiggerThanNumber(exercise.value1TextBox, int1);
		boolean value2 = Helper.elementBiggerThanNumber(exercise.value2TextBox, int1);
		boolean value3 = Helper.elementBiggerThanNumber(exercise.value3TextBox, int1);
		boolean value4 = Helper.elementBiggerThanNumber(exercise.value4TextBox, int1);
		boolean value5 = Helper.elementBiggerThanNumber(exercise.value5TextBox, int1);
	    
	    assertEquals( value1, true);
		assertEquals( value2, true);
		assertEquals( value3, true);
		assertEquals( value4, true);
		assertEquals( value5, true);
	}
	
	@Then("user should see total balance equal to sum of values")
	public void user_should_see_total_balance_equal_to_sum_of_values() {
			
		int value1 = Helper.WebElementToInt(exercise.value1TextBox);
	    int value2 = Helper.WebElementToInt(exercise.value2TextBox);
	    int value3 = Helper.WebElementToInt(exercise.value3TextBox);
	    int value4 = Helper.WebElementToInt(exercise.value4TextBox);
	    int value5 = Helper.WebElementToInt(exercise.value5TextBox);
	    long totalBalance = Helper.WebElementToLong(exercise.totalBalanceTextBox);
	    long total = (value1+value2+value3+value4+value5);
	    assertEquals( totalBalance, total);
	    
	}
	
	@Then("user should see all value is in correct currencies")
	public void user_should_see_all_value_is_in_correct_currencies() {
		boolean value1 =Helper.isCurrence(exercise.value1TextBox);
		boolean value2 =Helper.isCurrence(exercise.value2TextBox);
		boolean value3 =Helper.isCurrence(exercise.value3TextBox);
		boolean value4 =Helper.isCurrence(exercise.value4TextBox);
		boolean value5 =Helper.isCurrence(exercise.value5TextBox);
		assertEquals( value1, true);
		assertEquals( value2, true);
		assertEquals( value3, true);
		assertEquals( value4, true);
		assertEquals( value5, true);
	}
	
	@Then("User should send correct value to each element on page")
	public void user_should_send_correct_value_to_each_element_on_page() {
	   ExercisePage.sendValue(exercise.value1TextBox, "$12.00");
	   ExercisePage.sendValue(exercise.value2TextBox, "$312.00");
	   ExercisePage.sendValue(exercise.value3TextBox, "$4,412.00");
	   ExercisePage.sendValue(exercise.value4TextBox, "$512.00");
	   ExercisePage.sendValue(exercise.value5TextBox, "$139.00");
	   Helper.hover(exercise.totalBalanceTextBox);
	   double total = 5387.00;
	  boolean sumofValue = Helper.isEqual(exercise.totalBalanceTextBox, total);
	  assertEquals( sumofValue, true);
	}
	
}
