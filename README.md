# SELENIUM-CUCUMBERBDD-ECOMMERCESITE-AUTOMATION
PROJECT OVERVIEW

This project is a test automation framework developed for an e-commerce web application using Selenium WebDriver, TestNG, and Cucumber.
The framework automates end-to-end user workflows including login, product selection, cart management, checkout process, and payment functionality.
The framework is designed using the Page Object Model approach to improve maintainability and scalability.


STRUCTURE 

Akshidhaa Balaji <akshidhaabalaji@gmail.com>
7:10 PM (0 minutes ago)
to me

## 📂 Project Structure

```text
selenium-ecommerce-automation
│
├── src
│ └── test
│ └── java
│ ├── pages
│ │ ├── LoginPage.java
│ │ ├── ProductPage.java
│ │ ├── CartPage.java
│ │ └── CheckoutPage.java
│ ├── stepdefinitions
│ │ ├── LoginSteps.java
│ │ ├── ProductSteps.java
│ │ ├── CartSteps.java
│ │ ├── CheckoutSteps.java
│ │ └── PaymentSteps.java
│ ├── runner
│ │ └── TestRunner.java
│ └── hooks
│ └── Hooks.java
│
├── features
│ ├── login.feature
│ ├── product.feature
│ ├── cart.feature
│ ├── checkout.feature
│ └── payment.feature
│
├── target
│ └── cucumber-report.html
│
├── pom.xml
└── README.md


<img width="1122" height="1402" alt="image" src="https://github.com/user-attachments/assets/7491fb0b-efad-4f7e-b589-26191e31c582" />

FEATURES

Login automation
Product listing verification
Add to cart functionality
Cart validation and item removal
Checkout process automation
Payment flow automation for card and GPay
Behavior Driven Development implementation using Cucumber
Reusable Page Object Model structure

Technology Stack

Java 
Selenium WebDriver for browser automation
TestNG for test execution and assertions
Cucumber for behavior driven development
Maven for dependency management
Eclipse IDE  as development environment

Execution Steps

Clone the repository
Open the project in Eclipse
Run the TestRunner.java file as a TestNG test


Reports
After execution, the Cucumber HTML report is generated in the following location
target/cucumber-report.html . This report can be opened in a browser and exported to PDF using the print option
