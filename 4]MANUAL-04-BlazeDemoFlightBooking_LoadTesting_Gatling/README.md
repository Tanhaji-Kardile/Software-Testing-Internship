BlazeDemoFlightBooking_LoadTesting_Gatling

## Project Overview

This project focuses on performance and load testing of the BlazeDemo Flight Booking application using Gatling. The objective is to evaluate system behavior, response times, throughput, and stability under simulated user loads.

---

## Project Objective

* Analyze application performance under load
* Measure response times and throughput
* Identify performance bottlenecks
* Evaluate system stability during heavy traffic
* Generate detailed performance reports

---

## Application Under Test (AUT)

**Application:** BlazeDemo Flight Booking Application

**Testing Type:** Performance Testing / Load Testing

**Tool Used:** Gatling

---

## Tools and Technologies

* Gatling
* Maven
* Java
* BlazeDemo
* GitHub

---

## Test Environment

* Operating System: Windows
* Java JDK
* Maven
* Gatling Framework
* Web Browser

---

## Test Approach

The load testing process included:

1. Environment setup
2. Test scenario preparation
3. User load configuration
4. Test execution
5. Performance monitoring
6. Result analysis
7. Bottleneck identification
8. Report generation

---

## Test Scenarios
Scenario 1 – Search Flights
Scenario 2 – Choose Flight
Scenario 3 – Complete Booking
 
---

## Load Profile

The application was tested with multiple virtual users to simulate realistic traffic conditions and evaluate performance under varying workloads.

---

## Performance Metrics Analyzed

* Average Response Time
* Minimum Response Time
* Maximum Response Time
* Throughput
* Requests Per Second
* Success Rate
* Error Rate

---

## Test Execution

Performance tests were executed using Gatling simulation scripts and Maven commands.

Example:

```bash
mvn gatling:test
```

---

## Results and Analysis

The test execution provided detailed insights into:

* Application responsiveness
* System stability
* Resource utilization
* Performance bottlenecks
* Scalability behavior

---

## Deliverables

* Gatling Simulation Scripts
* Test Scenarios
* Load Profile
* Performance Analysis Report
* Bottleneck Analysis
* Gatling HTML Reports
* Screenshots
* Test Closure Report

---

## Project Structure

```text
MANUAL-04-BlazeDemoFlightBooking_LoadTesting_Gatling
│
├── 01_Project_Introduction
│
├── 02_Test_Objective
│
├── 03_Application_Under_Test_AUT
│
├── 04_Test_Environment
│
├── 05_Test_Approach
│
├── 06_Test_Scenarios
│
├── 07_Load_Profile
│
├── 08_Test_Data
│
├── 09_Test_Execution
│
├── 10_Test_Results_Summary
│
├── 11_Performance_Analysis
│
├── 12_Bottlenecks_Observed
│
├── 13_Test_Scenario_Execution_Report
│
├── 14_Test_Closure_Report
│
├── 15_Screenshots
│   
├── 16_Automation_Framework
│   │
│   ├── src
│   │   └── test
│   │       ├── java
│   │       │   ├── com
│   │       │   │   └── gatling
│   │       │   │       ├── tests
│   │       │   │       │   ├── BlazeDemoLoadTest.java
│   │       │   │       │   ├── SearchFlightSimulation.java
│   │       │   │       │   ├── ChooseFlightSimulation.java
│   │       │   │       │   ├── CompleteBookingSimulation.java
│   │       │   │       │   ├── GatlingRunner.java
│   │       │   │       │   └── GenerateExtentReport.java
│   │       │   │       │
│   │       │   │       └── utils
│   │       │   │           └── ExtentManager.java
│   │       │
│   │       └── resources
│   │           └── gatling.conf
│
├── 17_Run_Report
│
└── pom.xml
```

---

## Conclusion

The BlazeDemo Flight Booking Load Testing project was successfully completed by evaluating the performance, scalability, and stability of the BlazeDemo web application under varying user loads using Gatling.

The project involved requirement analysis, test planning, load profile design, test data preparation, execution of performance test scenarios, result analysis, and documentation of findings. Multiple user journeys such as flight search, flight selection, and booking completion were simulated to measure application behavior under concurrent user traffic.

A Gatling-based automation framework was developed to execute load tests efficiently and generate detailed execution reports. Performance metrics including response time, throughput, requests per second, error percentage, and system behavior under load were analyzed to identify potential bottlenecks and performance issues.

The test execution results provided valuable insights into the application's capacity, responsiveness, and reliability. Performance bottlenecks and areas for improvement were documented along with recommendations to enhance system performance and user experience.

Overall, this project demonstrated practical experience in performance testing, workload modeling, result analysis, reporting, and automation using Gatling. It also reinforced the importance of performance testing in ensuring that web applications can handle expected user traffic while maintaining acceptable response times and system stability.

