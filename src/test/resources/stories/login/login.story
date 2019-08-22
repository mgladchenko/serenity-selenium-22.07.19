Login

Meta:
@tag login

Narrative:
  In order to use app functionality
  As a user
  I want to be able to login

Scenario: Successful user login
Meta:
@tag login01
Given I open Landing page
When I click on 'Sign In' button
Then I should be on Login page
When I sign In as "user" , "password"
Then I should be on Home page
