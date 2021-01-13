# Autor: Eva Andrades Alarcon

  @stories
  Feature: Create Account
    As a guest, I want to create a new account on the UTest website
    @scenario1
    Scenario: Create a new account
      Given than Eva is a guest she wants to create a new account on the UTest website
      When she create the new account on the website
        | strFirstName    | strLastName   |        strEmail       | strBirthDay | strBirthMonth  | strBirthYear|  strCity  | strState | strPostalCode | strCountry | strYourComputer | strVersion | strLanguage | strYourMobileDevice  | strModel | strOperatingSystem |  strCreateYourUTestPassword | strConfirmPassword |
        |  Eva            |  Andrades     | evaandrade21@hotmail.es |     13      |    October     |     1997    |  Montería | Córdoba  |     23000     | Colombia   |   Linux         | Debian     | English     |  Huawei              | P30 lite | Android 10         |        @Eva.10.13.9710            |  @Eva.10.13.9710         |
      Then she creates the account successfully and can see the welcome message
      | strConfirmationMessage |
      | Welcome to the world's largest community of freelance software testers! |
