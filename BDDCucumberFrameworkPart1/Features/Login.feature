Feature: Test Login Functionality for OrangeHRM

Scenario: Successful Login Functionality
Given user is on home page 
When user enters username and password 
And click on login button
Then message displayed  Login successfully
#
#Scenario: UnSuccessful Login Functionality with invalid credential
#Given user is on home page 
#When user enters username and password 
#But Credentials are wrong
#Then User is not able to login with application
#
#Feature: Add to cart
#Background: User is Logged in
#Scenario: Sreach a product and add the product to user basket
#Given User search for lenova laptop
#When add the first laptop that appears in the search result to the basket
#Then User basket should display count 1 as item
#
#
#Feature: Login Action
#Scenario: Successful login
#* User is in Home Page
#* user is on home page 
#* user enters username and password 
#* click on login button
#* message displayed  Login successfully







