Feature: Google search
Scenario: Launch java tutorial
Given I launch google page
When I search Java Tutorial
Then should display java result page
Then Close the browser