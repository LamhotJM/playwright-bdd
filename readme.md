# My Playwright-BDD Framework

A scalable, CI/CD-friendly Playwright + Cucumber test framework in Java.  
Designed to give you end-to-end (UI & API) coverage with minimal boilerplate.

## 🚀 Features
- **E2E + API Testing**: Use Playwright for UI and plain HTTP calls for API.
- **Page Object Model**: Clean separation of page logic and test steps.
- **Environment-Based Configs**: Switch targets via Maven profiles or system properties.
- **JUnit 5 Suite Runner**: Leverage `@Suite` & `@SelectClasspathResource` for Cucumber integration.
- **HTML & “Pretty” Reports**: Automatic generation under `target/`.
- **CI/CD-Ready**: Works out-of-the-box with GitHub Actions, Jenkins, Azure DevOps, etc.

## ⚙️ Prerequisites
- Java 11+
- Maven 3.6+
- Node.js (required by Playwright CLI)

## 🛠️ Setup & Installation
1. **Clone the repo**
   ```bash
   git clone https://github.com/LamhotJM/playwright-bdd.git
   cd my-playwright-bdd
