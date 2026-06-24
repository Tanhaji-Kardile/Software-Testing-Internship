OrangeHRM-Login-Navigation-Testing

Project Overview:

This project is an automated web UI testing framework developed using **Selenium WebDriver, Java, TestNG, and Page Object Model (POM). 
The framework automates functional test scenarios for the OrangeHRM Demo Application and validates the login and forgot password functionalities,Naviagation
module,Appy Leave module and UI Validation

 Application Under Test:

OrangeHRM Demo Site: https://opensource-demo.orangehrmlive.com/

Technology Stack:

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager

Test Scenarios Covered:
1. Login Module Test Scenarios
2. Forgot Password Module
3. Navigation Module
4. Apply Leave Module
5.UI Validation

Project Structure:

MANUAL-01-OrangeHRM-Login-Navigation-Testing
│
├── 01_Project_Introduction
├── 02_Requirement_Analysis
├── 03_Test_Plan
├── 04_Test_Scenarios
├── 05_Test_Cases
├── 06_RTM
├── 07_Test_Environment_Setup
├── 08_Test_Execution_Report
├── 09_Bug_Reports
├── 10_Screenshots
├── 11_Build_Deployment
├── 12_Test_Closure_Report
│
├── 13_Automation_Framework
│   │
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   ├── pages
│   │   │   │   │   ├── DashboardPage.java
│   │   │   │   │   ├── ForgotPasswordPage.java
│   │   │   │   │   ├── LeavePage.java
│   │   │   │   │   └── LoginPage.java
│   │   │   │
│   │   │   └── utils
│   │   │       ├── ConfigReader.java
│   │   │       ├── ExcelReader.java
│   │   │       ├── ScreenshotUtils.java
│   │   │       └── WaitUtils.java
│   │   │
│   │   └── resources
│   │       └── chromedriver.exe
│   │
│   └── test
│       ├── java
│       │   ├── base
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── forgotpassword
│       │   │   └── ForgotPasswordTest.java
│       │   │
│       │   ├── leave
│       │   │   └── ApplyLeaveTest.java
│       │   │
│       │   ├── login
│       │   │   └── LoginTest.java
│       │   │
│       │   ├── navigation
│       │   │   └── NavigationTest.java
│       │   │
│       │   ├── ui
│       │   │   └── UIValidationTest.java
│       │   │
│       │   └── utils
│       │       └── ExtentReportManager.java
│       │
│       └── resources
│           ├── config.properties
│           └── testdata.xlsx
│
├── 14_Run_Reports
│
├── .gitignore
├── README.md
├── pom.xml
└── testng.xml

# Conclusion:

The OrangeHRM Login and Navigation Testing project was successfully completed by performing comprehensive manual testing and automation testing activities. The application requirements were analyzed, test scenarios and test cases were designed, and test execution was carried out to validate the functionality of the Login, Forgot Password, Leave Management, Dashboard, and Navigation modules.

Manual testing helped identify and document defects, verify business requirements, and ensure proper application behavior. Requirement Traceability Matrix (RTM), Bug Reports, Test Execution Reports, and Test Closure Reports were prepared to maintain complete test documentation.

An automation framework was developed using Selenium WebDriver, Java, TestNG, Maven, and the Page Object Model (POM) design pattern. Automated test scripts improved test execution efficiency, reusability, maintainability, and reporting capabilities through TestNG and Extent Reports.

The project demonstrates practical experience in requirement analysis, test planning, test case design, defect reporting, automation framework development, and test execution. Overall, the OrangeHRM application achieved the expected functionality for the tested modules, and the testing process contributed to improving application quality, reliability, and user experience.



