Feature: I am automating orangeHRM application

Background: common re-usable steps

Given user launch browser
Then user enters URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01_AddSKILLS - creating skills record

And user enters username as "Admin" and password as "admin123" and click login btn
Then go to skills page 
Then enters skillname as "java89" and skill description as "java89 description" and click save btn
Then logout
Then close the browser