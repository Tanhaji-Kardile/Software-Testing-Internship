OWASP-Juice-Shop-Security-Testing(Docker):

## Project Overview

This project focuses on security testing of a vulnerable web application using OWASP Juice Shop running in a Docker environment. The objective is to identify security vulnerabilities such as SQL Injection, Cross-Site Scripting (XSS), and other OWASP Top 10 issues.

---

## Project Objectives

* Perform security testing on a web application
* Identify vulnerabilities like SQL Injection and XSS
* Validate OWASP Top 10 security risks
* Document vulnerabilities with proper evidence
* Suggest mitigation strategies for identified issues

---

## Tools & Technologies

* OWASP Juice Shop
* Docker
* OWASP ZAP (or similar security scanner)
* Manual Testing Techniques
* Postman (optional for API testing)
* Selenium + TestNG (for automation framework)
* Maven

---

## Testing Scope

* SQL Injection Testing
* Cross-Site Scripting (XSS)
* Authentication Testing
* Input Validation Testing
* OWASP Top 10 Vulnerabilities

---

Test scenarios  Covered:

1.Authentication Test Scenarios
2.SQL Injection Test Scenarios
3.XSS Test Scenarios
4.Input Validation Test Scenarios
5.Error Handling Test Scenarios
6.Session Security Test Scenarios
7.Security Validation Test Cases

## Project Structure

```text
MANUAL-03-OWASP-Juice-Shop-Security-Testing(Docker)
│
├── 01_Project_Introduction
├── 02_Review_&_Analyze_Requirements
├── 03_Prepare_Test_Plan
├── 04_Create_Test_Scenarios
├── 05_Create_Test_Cases
├── 06_RTM
├── 07_Test_Environment_Setup
├── 08_Test_Execution
├── 09_Bug_Reporting_&_Tracking
├── 10_Screenshots
├── 11_Build_Deployment
├── 12_Test_Closure_Phase
├── 13_Security_Report
├── 14_Mitigation_Strategies
│
├── 15_Automation_Framework_Structure
│   │
│   ├── src
│   │   │
│   │   ├── main
│   │   │   │
│   │   │   ├── java
│   │   │   │   │
│   │   │   │   ├── base
│   │   │   │   │   ├── BaseTest.java
│   │   │   │   │   └── DriverFactory.java
│   │   │   │   │
│   │   │   │   └── utils
│   │   │   │       ├── ConfigReader.java
│   │   │   │       ├── ExtentReportManager.java
│   │   │   │       └── ScreenshotUtil.java
│   │   │   │
│   │   │   └── resources
│   │   │       └── chromedriver.exe
│   │   │
│   │   └── test
│   │       │
│   │       ├── java
│   │       │   │
│   │       │   ├── listeners
│   │       │   │   └── TestListener.java
│   │       │   │
│   │       │   ├── pages
│   │       │   │   ├── HomePage.java
│   │       │   │   ├── LoginPage.java
│   │       │   │   └── FeedbackPage.java
│   │       │   │
│   │       │   ├── testdata
│   │       │   │   └── TestData.java
│   │       │   │
│   │       │   └── tests
│   │       │       ├── Authentication_Test.java
│   │       │       ├── SQLInjection_Test.java
│   │       │       └── XSS_Test.java
│   │       │
│   │       └── resources
│   │           └── config.properties
│
├── 16_Run_Reports
│
├── pom.xml
└── testng.xml
```

## Deliverables

* Security Test Plan
* Test Cases & Scenarios
* RTM (Requirement Traceability Matrix)
* Bug Reports
* Test Execution Reports
* Security Report
* Mitigation Strategies Document
* Screenshots of vulnerabilities
* Automation framework (if applicable)

---

## Environment Setup

* OWASP Juice Shop runs inside Docker container
* Localhost access via browser
* Security tools configured for scanning and manual testing

---

## Key Findings

* SQL Injection vulnerabilities identified in input fields
* XSS vulnerabilities detected in user input sections
* Improper input validation in certain endpoints
* OWASP Top 10 risk areas analyzed

---

## Mitigation Strategies

* Use parameterized queries
* Implement input validation and sanitization
* Apply Content Security Policy (CSP)
* Use proper authentication and authorization mechanisms
* Regular security scanning using tools like OWASP ZAP

---

## Automation Framework

* Selenium WebDriver
* TestNG Framework
* Maven Project Structure
* Extent Reports for reporting
* TestNG Reports for execution tracking

---
# Conclusion

The OWASP Juice Shop Security Testing project was successfully completed by performing comprehensive security testing activities on the deliberately vulnerable web application deployed using Docker. The project involved requirement analysis, test planning, test case design, vulnerability assessment, defect reporting, and security validation based on OWASP security standards.

Multiple security testing techniques were executed, including Authentication Testing, SQL Injection Testing, Cross-Site Scripting (XSS) Testing, and OWASP Top 10 Vulnerability Assessment. The identified security weaknesses were documented with supporting evidence, screenshots, execution results, and detailed bug reports.

A structured security testing process was followed, including the preparation of Requirement Traceability Matrix (RTM), Test Execution Reports, Security Reports, and Mitigation Strategy documentation. The project also demonstrated the use of automation techniques through a Selenium-TestNG framework for validating security-related test scenarios and generating execution reports.

The findings highlighted potential security risks that could impact application confidentiality, integrity, and availability. Appropriate mitigation strategies and security recommendations were proposed to reduce the identified vulnerabilities and strengthen the application's security posture.

Overall, this project provided practical experience in web application security testing, vulnerability assessment, defect management, security reporting, and test automation. It enhanced understanding of OWASP Top 10 security risks and demonstrated the importance of integrating security testing into the software testing lifecycle to improve application reliability and security.

