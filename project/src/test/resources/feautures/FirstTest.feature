  Feature: testing login page
  Scenario Outline: verifying login page
  Given login page is testing
  When enters username as "<username>" And password as "<password>"
  Then login should be successful
   Examples:
    |username|password|
    |surendra|surendra|
    |   pavan     |  pavan      |