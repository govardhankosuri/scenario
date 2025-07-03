Feature: i am automating orangeHrm

Background: common re-usable steps 

Given User lunch browser
Then  user enter url - "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"



Scenario: TC02_ADDJOBS creating jobs record

And user enters username as "Admin" and password as "admin123" and click login button
Then go to admin option 
Then go to jobs and click that one
And then go to job titles and 
Then click ADD button and enter the details 
And enter JobTitle as "java234"and enter JobDescription as "java23456"
Then select job specification and browse the file after
Then enter Note as "this course is avalible right now"
Then click Save 
Then logout
Then close the browser