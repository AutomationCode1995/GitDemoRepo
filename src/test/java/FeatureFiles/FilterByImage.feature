Feature: Filter Functionality

Scenario: Validate car brand filter functionality

Given the user is on the homepage

When the user applies the "TATA" filter under the Cars category

Then only TATA car results should be displayed