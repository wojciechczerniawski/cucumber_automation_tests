Scenario: Creating private user account in CodersGuru app
  Given I have an open webbrowser
  When I open website https://men-men-s-01.codersguru.pl/
  And I click on create account button on the main page
  And I click on the option private on the registration page
  And I put in the field E-mail an e-mail address
  And I put in the field name user name 
  And I put in the field last name user lastname
  And I put in the field password user password
  And I put in the field repeat password exact same password
  And I put in the field city user city
  And I put in the field postal code user postal code
  And I put in the field street user street
  And I put in the field local number user local number
  And I check the box Familiar with regulations
  And I click on the button Register
  Then I have created a new private user account and I check after name if logged user is the same as by the account creation