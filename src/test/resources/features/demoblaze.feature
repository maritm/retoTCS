#autor: Marilyn Tenorio Melenje
Feature: page demoblaze
  as a user, I want to authentication, register form, register user and add product

  Background:
    Given that Marilyn wants to enter the page


  @tag
  Scenario: register user
    When the user enters the data
      | userName       | password   |
      | marilyntenorio | mari123456 |
    Then should see the successful registration message



  @tag
  Scenario: authentication user
    When the user enters the data for auth
      | userName       | password   |
      | marilyntenorio | mari123456 |
    Then should see the authenticated user

  @tag
  Scenario: add product
    When the user selects the product from the Laptops section
      | userName       | password   |
      | marilyntenorio | mari123456 |
    Then should check the MacBook Pro product in the cart


  @tag
  Scenario: register form
    When the user enters the data for form
      | contactEmail             | contactName     | message                |
      | marilyntenorio@gmail.com | Marilyn Tenorio | Validation of the form |
    Then should see the message Thanks for the message!!

