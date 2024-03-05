Feature: Test Login Functionality for OrangeHRM

Scenario: Successful Login Functionality
Given user is on home page 
When user enters username and password 
And click on login button
Then message displayed  Login successfully


Scenario: successful logout
When user Logout from the application
Then user redirect on my home page







