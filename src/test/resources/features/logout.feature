Feature: Logging out

  Background:
		#@FNW-520
    Given user is on the login page


  @FNW-519
  Scenario Template: user should be able to logout and end session.
  Logging out
    When user enters email "<email>" and "<password>" and click the login button
    When User clicks on "<username>"
    And User clicks on log out selection
    Then User end the session and sees the title as "Login | Best solution for startups"

    Examples:
      | email                      | password         | username            |
      | salesmanager15@info.com    | salesmanager     | SalesManager15      |
      | posmanager10@info.com      | posmanager       | POSManager10        |
      | imm10@info.com             | inventorymanager | InventoryManager10  |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10   |
      | manuf_user10@info.com      | manufuser        | ManufacturingUser10 |
