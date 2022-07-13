Feature: Finworks app login feature


  Background:
		#@FNW-511
    Given user is on the login page


  @wip @FNW-509 @FNW-507
  Scenario Outline: user should be able to login with valid credentials.

  User Story:
  As a registered user, I should be able to login to my account so that I can use the modules.

  Accounts are: salesmanager, posmanager, inventorymanager, expensesmanager, manufuser

    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should see the username at top right-hand corner of the page as "<username>"

    Examples:

      | email                      | password         | username            |
      | salesmanager15@info.com    | salesmanager     | SalesManager15      |
      | posmanager10@info.com      | posmanager       | POSManager10        |
      | imm10@info.com             | inventorymanager | InventoryManager10  |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10   |
      | manuf_user10@info.com      | manufuser        | ManufacturingUser10 |

  @wip @FNW-517
  Scenario Outline: user shouldn't be able to login with invalid credentials.
  User Story:
  As a registered user, I should be able to login to my account so that I can use the modules.

  Accounts are: salesmanager, posmanager, inventorymanager, expensesmanager, manufuser

    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should see the warning message "<warningMessage>"

    Examples:

      | email                    | password         | warningMessage              |
      |                          |                  | Please fill out this field. |
      |                          | posmager         | Please fill out this field. |
      |                          | invenTorymanager | Please fill out this field. |
      |                          | expensesmanager  | Please fill out this field. |
      | manf_user@info.com       |                  | Please fill out this field. |
      | expenseSmanager@info.com |                  | Please fill out this field. |
      | salesmanager15@info.com  |                  | Please fill out this field. |

  @wip @FNW-518
  Scenario Outline: user shouldn't be able to login with invalid credentials.
  User Story:
  As a registered user, I should be able to login to my account so that I can use the modules.

  Accounts are: salesmanager, posmanager, inventorymanager, expensesmanager, manufuser

    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should see the error message "Wrong login/password"

    Examples:

      | email                   | password         | errorMessage         |
      | salsmanager@info.com    | 1234             | Wrong login/password |
      | posanager@info.com      | poSmanager       | Wrong login/password |
      | im@info.com             | inventorymanager | Wrong login/password |
      | manuf_uSer@info.com     | manfuser         | Wrong login/password |
      | saleSmanager@info.com   | salesmanager     | Wrong login/password |
      | poSmanager@info.com     | posmanager       | Wrong login/password |
      | salesmanager15@info.com | expensesmanager  | Wrong login/password |
      | salesmanager15@info.com | saleSmanager     | Wrong login/password |
