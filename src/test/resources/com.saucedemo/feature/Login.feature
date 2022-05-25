Feature: Start home page swag labs and logout

  Scenario: User can access to home page and log out successful
    Given User open browser on swag lab page
    And User validate credentials in login form
      | username      | password     |
      | standard_user | secret_sauce |
    When User access to home page successful
    Then User log out and close browser