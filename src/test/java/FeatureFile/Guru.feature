Feature: Guru99 Application

  Scenario: Validate Registration Functionality
    Given user open guruApplication in "chrome" browser
    When user validate url
    And user validate title

  Scenario: Validate FirstName and LastName Functionality
    When user should enter valid firstname as "Vaishu"
    And user should enter valid LastName as "Patil"
    
    Scenario: Validate Phone and Email functionality
    When user should enter valid Phone as "909090"
    And user should enter valid Email as "aj@gmail.com"
    
    Scenario: Validate Mailing Information Functionality
    When user should enter valid address as "Pune"
    And user should enter valid city as "Pune"
    And user should enter valid state as "MH"
    And user should enter valid Postal Code as "112233"
    And user should enter valid country as "INDIA"
