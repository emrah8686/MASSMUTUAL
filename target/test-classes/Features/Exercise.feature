Feature: Exercise Value Validation

Background:
Given User get that url "http://dummy.restapiexample.com/api/v1/employees"
When User see screen as successfully open

#  Need to verify the right count of values appear on the screen
@screenValue @validation
Scenario: verify the right count of values on screen 
Then user should see there are five values

#  Need to verify the values on the screen are greater than 0
@screenValue_0 @validation
Scenario: verify the right count of values greater than O
Then user should see values are more than 0

#  Need to verify the total balance is correct based on the values listed on the screen
#  Need to verify the total balance matches the sum of the values
@total_Balance @validation
Scenario: verify the totalBalance equal to sum of values 
Then user should see total balance equal to sum of values 


#  Need to verify the values are formatted as currencies
@currencies_Validation @validation
Scenario: verify the currencies of values 
Then user should see all value is in correct currencies

#  Create a mockup of what the results would look like assuming all steps passed 
@end_2_end_testing
Scenario: Verify result when all step passed as expected 
Then User should send correct value to each element on page 
And user should see total balance equal to sum of values