@test
Feature: Login scenarios
#  Background:
#    Given click on Login options
# Scenario Outline: Login with Invalid username and valid password
#   When User clicks on hamburger icon
#   And User click on login link
#   When User enters the username as "<username>"
#   And User enters the password as "<password>"
#   And User click on login button
#   Then Login should fail with an error "<err>"
#   Examples:
#     |username | password | err|
#     |invalidUsername| 10203040 | Username and password do not match any user in this service |
#
#  Scenario Outline: Login with valid username and Invalid password
#    When User enters the username as "<username>"
#    And User enters the password as "<password>"
#    And User click on login button
#    Then Login should fail with an error "<err>"
#    Examples:
#      |username | password | err|
#      |bob@example.com| 10203050| Username and password do not match any user in this service |

  Scenario Outline: Login with valid username and password
    When User clicks on hamburger icon
    And User click on login link
    When User enters the username as "<username>"
    And User enters the password as "<password>"
    And User click on login button
    Then User should see Product page with title "<title>"
    Examples:
      |username | password | title|
      |bob@example.com| 10203040| PRODUCTS |