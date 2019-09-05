Login

Meta:
@login

Narrative:
  In order to use app functionality
  As a user
  I want to be able to login

Scenario: Successful user login
Meta:
@login01
@smoke
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Home page
Examples:
|email                          |password|
|linkedin.tst.yanina@gmail.com  |Test123!|
|linkedin.TST.yanina@gmail.com  |Test123!|

Scenario: Negative login remains on Login page
Meta:
@login02
@smoke
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Login page
Examples:
|email                          |password|
|linkedin.tst.yanina@gmail.com  |        |
|linkedin.TST.yanina@gmail.com  |1       |

