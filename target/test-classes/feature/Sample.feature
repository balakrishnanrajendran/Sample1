Feature: Login Page Validation using multiple datas

	@TagScenarioOutline
  Scenario Outline: Validate the Login Page
    Given Login to the Application
    When Enter the username "<username>"
    And Enter the password "<password>"
    And Click the loginbutton
    Then Validate the Home Page

    Examples: 
      | username | password   |
      | Aiite1   | Aiite12345 |
      | Aiite2   | Aiite12367 |
      | Aiite3   | Aiite12367 |
