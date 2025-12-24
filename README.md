# Selenium Java Automation Framework

## Overview

This project is a **Selenium Automation Testing Framework** built using modern and widely used automation tools.  
It is designed to be **lightweight**, **modular**, and **easy to scale**, making it suitable for both learning and real-world automation use cases.

### Tech Stack Used
- **Java 17**
- **Selenium 4**
- **TestNG**
- **Page Object Model (POM with PageFactory)**
- **Maven** for build and dependency management

The framework follows clean design principles to ensure better **readability**, **maintainability**, and **faster test development**.

---

## Project Structure

- **src/main/java/com/ab/form/pages**
  - `FormPage.java`  
    Represents the web form page and contains all UI elements and actions using the Page Object Model.

- **src/test/java/com/ab/form/tests**
  - `BaseTest.java`  
    Handles WebDriver setup, browser configuration, and teardown.
  - `FormPageTest.java`  
    Contains test cases that validate the form functionality.

- **pom.xml**  
  Maven configuration file used to manage dependencies such as Selenium, TestNG, and WebDriverManager.

- **testng.xml**  
  TestNG suite configuration file used to run tests.  
  Supports **parallel execution** and **cross-browser testing**.

---

## Key Features

- **Page Object Model (POM)**  
  Improves code reusability, readability, and maintenance.

- **Cross Browser Testing**  
  Supports execution on **Chrome** and **Firefox** using TestNG parameters.

- **Scalable Design**  
  Easy to extend by adding more test cases, pages, and utilities.

- **Maven Integration**  
  Simplifies dependency management and build lifecycle.

---

## How It Works

- Test cases are written using **TestNG**.
- UI interactions are handled through **Page Object classes**.
- Cross-browser execution is controlled using **parameters in `testng.xml`**.
- Test logic and UI locators are kept separate for clean and maintainable code.

---

## Future Enhancements

- Add **Extent Reports or Allure Reports** for better reporting.
- Integrate with **CI/CD pipelines** like GitHub Actions or Jenkins.
- Implement **Data-Driven Testing** using Excel, JSON, or database sources.

---

## Summary

This framework provides a **solid foundation for Selenium automation testing** with support for **POM and cross-browser execution**.  
It is structured to meet **professional automation standards** and can be easily enhanced for larger test suites and enterprise-level projects.

---

## Execution Video

Execution video of the test run is available here:
[[Click here to watch the execution video]](https://drive.google.com/file/d/1gK4JxAqTca5vPzf1ngIgHqOFdBZgHTGr/view?usp=sharing)

---

## Execution Screenshots

Execution screenshots are available inside the repository under the **Project_Demo/** folder.

---

## How to Run

### 1. Using TestNG Suite (IDE)
- Right-click on `testng.xml` in your IDE
- Select **Run As → TestNG Suite**

### 2. Using Maven
```bash
git clone https://github.com/AbarnaSelv/SeleniumLoginAutomation.git
cd SeleniumLoginAutomation
mvn clean install
mvn test


