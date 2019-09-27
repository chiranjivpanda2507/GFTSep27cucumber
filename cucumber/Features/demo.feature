Feature: product purchase
@data-driven
Scenario: Credentials
Given credentials are
|user1|
|user2|
|user3|
|user4|
|user5|
|user6|


@Registration
Scenario: Registration
Given App is up
When the crdentials are "lalitha" and "password123"
Then Login 



@FunctionalTest
  Scenario Outline: microwave purchase
    Given John purchase microwave for <price> rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of <price> doll

Examples:
   |price|
   |100|
   |200|
   |300|
   
  @RegressionTest 
    Scenario: microwave purchase
    Given John purchase microwave for 400 rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of 400 doll
   
   @RegressionTest @Smoke
    Scenario: microwave purchase
    Given John purchase microwave for 500 rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of 400 doll
   
   @FunctionalTest @Smoke
    Scenario: microwave purchase
    Given John purchase microwave for 600 rs
    And he has receipt
    When John returns the faulty microwave
    Then he got refund of 400 doll
   