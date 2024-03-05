Feature: Test Login Functionality for OrangeHRM

Scenario Outline: Successful Login Functionality
Given user is on home page 
When user enters "<username>" and "<password>"
And click on login button


Examples:
|   username    |   password   |
| Amruta		|  Amruta1234|
| Admin | admin123 |
| admin | admin1234|










