OrangeHRM-Login-Navigation-Testing

Project Overview

This project is an automated web UI testing framework developed using **Selenium WebDriver, Java, TestNG, and Page Object Model (POM). 
The framework automates functional test scenarios for the OrangeHRM Demo Application and validates the login and forgot password functionalities.

 Application Under Test

OrangeHRM Demo Site: https://opensource-demo.orangehrmlive.com/

Technology Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager

Test Scenarios Covered
1. Login Module Testing

Positive Test Case

* Login with valid username and valid password

#### Negative Test Cases

* Login with valid username and invalid password
* Login with invalid username and invalid password
* Login with username only
* Login with password only
* Login without entering username and password

 2. Forgot Password Module Testing

Positive Test Cases

* Forgot Password with valid username
* Forgot Password with valid username multiple times

 Negative Test Cases

* Forgot Password with invalid username
* Forgot Password with empty username

 Functional Test Case

* Cancel Forgot Password operation

## Framework Features

* Page Object Model (POM) Design Pattern
* Reusable Page Classes
* TestNG Test Execution
* Maintainable and Scalable Framework Structure
* Clear Separation of Test Data and Test Logic

Project Structure

src/main/java

* pages

  * HomePage.java
  * DashBoardPage.java
  * ForgotPasswordPage.java

src/test/java

* tests

  * LoginTest.java
  * ForgotPasswordTest.java


