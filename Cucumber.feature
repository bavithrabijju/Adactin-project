Feature: checking the hotel booking funtionality of an adactin application

@Login
Scenario Outline: checking the login funtionality
Given user launching the url
When user enter the "<username>" in the username field
And user enter the "<password>" in the password field
Then user click the login button and its navigate to search hotel page

Examples:
|username|password|
|bavithra|ghsd65|
|bijju|hjk67|
|bavithrabijju|Bavi03#|

@Search
Scenario: user searching the hotel functionality
When user selecting the "Los Angeles" in the location field
And user selecting the "Hotel Hervey" hotel
And user selecting the "Deluxe" room type
And user selecting the "2" rooms to stay
And user checking indate "1/12/2022"
And user checking outdate "5/12/2022"
And user selecting "2 - Two" rooms for adult
Then user click the serach button and its navigate to continue the booking page

@Continue
Scenario: user booking a hotel functionality
When user click the radio button
Then user click the Continue button for confirmation of booking page

@Booking
Scenario: user confirm the booking fucntionality
When user type the fname "Bavithra"
And user type the lname "bijju"
And user type the "chennai"
And user type the card number "9878867236712867"
And user select the "VISA" card type
And user select the "August" month of the credit card
And user select the "2022" year of the credit card
And user type the "2867" number of the card
Then user click the booknow button for confirmation the booking