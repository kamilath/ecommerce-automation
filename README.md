# E-Commerce Automation

Selenium automation framework built using Java, TestNG, Maven, and Page Object Model.

## Tech Stack

* Java 17
* Selenium WebDriver
* TestNG
* Maven
* Git & GitHub
* GitHub Actions
* Extent Reports

## Features

* Page Object Model
* Reusable BasePage
* Explicit waits
* Cross-browser testing
* Parallel execution support
* Retry failed tests
* Failure screenshots
* Extent HTML reports
* Environment configuration
* CI/CD using GitHub Actions

## Test Scenario

The project automates the following e-commerce flow:

1. Open the application
2. Login
3. Add a product to the cart
4. Open the cart
5. Verify the product is present

## Run Tests

```bash
mvn clean test
```

## Reports

After execution:

```text
target/extent-report.html
```

Screenshots for failed tests are stored in:

```text
target/screenshots/
```

## CI/CD

Tests are automatically executed using GitHub Actions whenever changes are pushed to the `main` branch.
