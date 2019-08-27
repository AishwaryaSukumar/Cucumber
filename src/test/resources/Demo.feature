Feature: To validate Guru Demo Site
 
Scenario:
Given user enter the guru99 demo site url
When user clicking on  the background check option and entering the billing details
|Aishwarya|Sukumar|4aishwaryavijay@gmail.com|Chennai|7708049908|
Then user clicking the submit button

Scenario Outline:
Given user enter the guru99 demo site url
When user clicking on the background check option and entering the billing details
Then user entering "<FirstName>", "<LastName>", "<Email>", "<Address>", "<Phoneno>"
And clicking the submit button

Examples:
|FirstName|LastName|Email|Address|Phoneno|
|Aishwarya|Sukumar|4aishwaryavijay@gmail.com|Chennai|7708049908|
