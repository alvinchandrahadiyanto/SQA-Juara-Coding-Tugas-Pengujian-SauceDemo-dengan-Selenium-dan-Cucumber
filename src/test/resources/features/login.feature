Feature: Login

  Scenario: Successful login
    Given I am on the login page
    When I enter username "standard_user"
    And I enter password "locked_out_user"
    Then I succesfully login and get "Swag Labs"