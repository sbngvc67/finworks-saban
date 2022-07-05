Feature: Finworks app Create Contacts

  Background:
		#@FNW-520
    Given user is logged in the page

  @FNW-521
  Scenario Outline: user should be able to create a new contact
  Finworks app Create Contacts feature
  User Story:
  As a registered user, I should be able to create to my account.

  Accounts are: salesmanager, posmanager, inventorymanager, expensesmanager, manufuser

    When user navigates to Contacts module
    And user enters clicks on Create button
    And user enters name "<name>"
    And user enters street name "<street>"
    And user enters additional street name "<street2>"
    And user enters city name "<city>"
    And user selects state
    And user enters zip "<zip>"
    And user selects country
    And user enters TIN number "<TIN>"
    And user enters job position "<jobPosition>"
    And user enters phone number "<phone>"
    And user enters mobile number "<mobile>"
    And user enters e-mail "<e-mail>"
    And user enters website "<website>"
    And user selects title "<title>"
    And user selects language "<language>"
    And user clicks the edit image button and upload an image
    And user clicks save button
    Then user should see the username "<name>" at the title

    Examples:

      | name        | street  | street2 | city       | zip   | TIN          | jobPosition    | phone        | mobile       | e-mail          | website               | title       | language |
      | Saban Govec | E 114th |         | California | 90001 | US0477472701 | Sales Director | 004970002376 | 017263421166 | managerinfo.com | https://www.verti.de/ | Coordinator | English  |
