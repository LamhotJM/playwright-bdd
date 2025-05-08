A scalable, CI/CD-friendly Playwright + Cucumber test framework in Java.Designed to give you end-to-end (UI & API) coverage with minimal boilerplate.

🚀 Features

E2E + API Testing: Use Playwright for UI tests and plain HTTP calls for API tests.

Page Object Model: Clean separation of page logic and test steps.

Environment-Based Configs: Switch targets via Maven profiles or system properties.

JUnit 5 Suite Runner: Leverage @Suite & @SelectClasspathResource for Cucumber integration.

HTML & “Pretty” Reports: Automatic generation under target/.

CI/CD-Ready: Works out-of-the-box with GitHub Actions, Jenkins, Azure DevOps, etc.

⚙️ Prerequisites

Java 11+

Maven 3.6+

Node.js (required by Playwright CLI)

🛠️ Setup & Installation

Clone the repo

git clone https://github.com/your-org/my-playwright-bdd.git
cd my-playwright-bdd

Install Playwright browsers

mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"

Build & run tests

mvn clean test

📂 Project Structure

src/
├── main/java          # Optional helpers & utilities
└── test/
├── java/
│   ├── com.example.framework.pages      # Page objects
│   ├── com.example.framework.steps      # Cucumber step definitions
│   └── TestRunner.java                  # JUnit 5 Suite entry point
└── resources/
└── features/                        # Cucumber .feature files
target/
└── cucumber-html-report.html               # Generated report

🤝 Contributing

Fork the repo

Create a feature branch (git checkout -b feature/your-feature)

Commit your changes & push

Open a Pull Request

📜 License

This project is released under the MIT License. See LICENSE for details.