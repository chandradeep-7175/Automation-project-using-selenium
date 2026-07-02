@tag
  Feature: we check the flow of cucumber

Background:
  Given I landed to home page;

  Scenario: Postive test case for login
    Given we are in login page

    Scenario Outline: Postive test case with data
      Given name of the user <name> and <address>
      Examples:
        | name | address |
        | KK   | Kanpur  |

