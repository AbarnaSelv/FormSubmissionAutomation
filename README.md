# 🚀 Selenium Java Automation Framework

## 📌 Overview
This project is a **Selenium Automation Testing Framework** built using:
- **Java 17**
- **Selenium 4**
- **TestNG**
- **Page Object Model (POM with PageFactory)**
- **Maven** for build and dependency management

The framework is lightweight, modular, and designed for **scalability**, ensuring easy maintenance and faster test development.

---

## 🏗️ Project Structure

- src/main/java/com/ab/form/pages  
  - FormPage.java → represents the web form page with elements and actions (Page Object Model)

- src/test/java/com/ab/form/tests  
  - BaseTest.java → handles WebDriver setup, browser configuration, and teardown  
  - FormPageTest.java → includes actual test cases that validate form functionality

- pom.xml → Maven configuration file to manage dependencies like Selenium, TestNG, and WebDriverManager

- testng.xml → TestNG suite configuration file for running tests, supports parallel execution and cross-browser testing

---

## 🌟 Key Features
✔ **Page Object Model (POM)** – Improves code reusability and readability  
✔ **Cross Browser Testing** – Supports running tests on **Chrome and Firefox**  
✔ **Scalable Design** – Easy to extend with more test cases and utilities  
✔ **Maven Integration** – Simplifies dependency management and build lifecycle  

---

## ⚡ How It Works
- Test cases are written in **TestNG** and linked with **Page Objects**  
- Cross-browser execution is controlled via **parameters in `testng.xml`**  
- Modular structure allows **clean separation of test logic and UI locators**  

---

## 🔧 Future Enhancements
- Add **Extent Reports / Allure Reports** for better test reporting  
- Implement **CI/CD pipeline integration (GitHub Actions / Jenkins)**  
- Add **Data-Driven Testing** with Excel / JSON / Database  

---

## ✅ Summary
This framework provides a **solid foundation for Selenium automation** with support for **POM, and cross-browser testing**.  
It is designed for **scalability, maintainability, and professional use in real-world automation projects**.

---

## 🎥 Demo Video  
▶️ [Click here to watch the execution video](https://drive.google.com/file/d/1gK4JxAqTca5vPzf1ngIgHqOFdBZgHTGr/view?usp=sharing)  

---

## 📸 Screenshots  
Execution screenshots are included inside the repository under the `Project_Demo/` folder.  

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


