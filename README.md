# Database Testing with Selenium and MySQL 🗄️🌐

This project demonstrates how to perform basic database operations (Insert, Update, Read) on a MySQL database and use Selenium WebDriver to interact with a web page, filling form fields with data fetched from the database 🧑‍💻📝.

## Project Overview 🚀

- Connects to a MySQL database (`classicmodels`) using JDBC.
- Performs Insert, Update, and Select queries on the `customers` table.
- Uses Selenium WebDriver (ChromeDriver) to open a registration page and automatically fill form fields with data retrieved from the database.
- TestNG is used for structuring the tests with priorities.

## Features ✨

- Insert a new customer record into the database 🆕
- Update the customer's credit limit 💳
- Read the customer's details and use them to fill an online registration form 📝

## Technologies Used 🛠️

- Java ☕
- MySQL 🐬
- Selenium WebDriver (ChromeDriver) 🌐
- TestNG ✅

## Prerequisites 📋

- Java JDK installed
- MySQL Server running with the `classicmodels` database available
- Chrome browser installed
- ChromeDriver executable compatible with your Chrome version
- TestNG library added to the project dependencies

## Setup Instructions ⚙️

1. Clone this repository.
2. Update the MySQL connection URL, username, and password in the `DatabaseTesting` class if necessary.
3. Make sure the MySQL server is running and accessible.
4. Ensure that ChromeDriver is set up properly.
5. Run the tests using TestNG from your IDE or command line.

## Notes 📝

- The database table `customers` should exist in the `classicmodels` database with appropriate columns.
- The web page URL `https://smartbuy-me.com/account/register` is used to test form filling.
- The submit button click is commented out to avoid actual registration during tests. You can uncomment if needed.
