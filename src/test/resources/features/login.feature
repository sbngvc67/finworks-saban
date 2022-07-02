Feature: Finworks app login feature

  Background:
		#@FNW-511
    Given user is on the login page


  @FNW-509 @FNW-507
  Scenario Outline: user should be able to login with valid credentials.

  User Story:
  As a registered user, I should be able to login to my account so that I can use the modules.

  Accounts are: librarian, student, admin

    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should see the username at top right-hand corner of the page as "<username>"

    Examples:

      | email                      | password        | username            |
      | salesmanager15@info.com    | salesmanager    | SalesManager15      |
      | posmanager10@info.com      | posmanager      | POSManager10        |
      | imm10@info.com             | inventorymanager | InventoryManager10  |
      | expensesmanager10@info.com | expensesmanager | ExpensesManager10   |
      | manuf_user10@info.com      | manufuser       | ManufacturingUser10 |