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
