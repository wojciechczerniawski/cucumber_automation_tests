Scenario: Booking flight

Given an open browser with www.phptravels.net
When user clicks on Flights tab
And user selects Round Trip
And user types "<cityForm>" in Form input
And user types "<cityTo>" in To input
And user types "<depart_date>" in Depart input
And user types "<return_date>" in Return input
And user clicks search button
And user clicks on buy button
And user types "<email>" in obligatory input
And user types "<password>" in password input
And user types "<name>" in name input
And user types "<surname>" in surname input
And user types "<email>" in email input
And user types "<phone>" in phone input
And user types "<birthday>" in birthday input
And user types "<passport>" in passport input
And user types "<expiration_date>" in expiration date input
And user types "<card_type>" in card type dropdown
And user types "<card_number>" in card number input 
And user selects "<expiry_month>" in expiry month dropdown
And user selects "<expiry_year>" in expiry year dropdown
And user types "<cvv>" in cvv input
And user selects checkbox
And user clicks on submit button
Then user goes to invoice page
And closing browser

Examples:
| cityForm | cityTo   | depart_date | return_date | email              | password | name | surname | phone     | birthday   | passport | expiration_date | card_type | card_number      | expiry_month | expiry_year | cvv |
| Warsaw   | New York | 2019-12-24  | 2019-12-31  | jankow.a@onet.pl   | pass123  | Jan  | Kowal   | 987654321 | 1990-01-01 | 345      | 2022-01-02      | Visa      | 9876543265903218 | June         | 2022        | 322 |