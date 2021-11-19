Feature: Google search
Scenario: Search Cypress
Given I launch google page
When I search Cypress Tutorial
Then should display Cypress result page
Then Close the browser