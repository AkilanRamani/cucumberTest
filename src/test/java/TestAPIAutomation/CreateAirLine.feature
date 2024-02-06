Scenario: Create an airline with json payload from external source
    Given url "https://reqres.in/api/users/2"
    When method get
    Then status 200