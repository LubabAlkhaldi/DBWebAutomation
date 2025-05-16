# 🗄️🌐 Database Testing with Selenium and MySQL

This project demonstrates how to perform basic database operations using Java and JDBC, and how to use Selenium WebDriver to interact with a web form by filling it with data retrieved from a MySQL database. 🧑‍💻📝

---

## 🚀 Project Overview

- 🔌 Connects to a MySQL database (`classicmodels`) using JDBC  
- 📥 Performs SQL operations: `INSERT`, `UPDATE`, and `SELECT` on the `customers` table  
- 🌐 Uses Selenium WebDriver (ChromeDriver) to open a registration page and auto-fill form fields  
- 🧪 Structures the test cases using **TestNG** with defined priorities

---

## ✨ Features

- 🆕 Insert a new customer record into the database  
- 📝 Read customer data and use it to fill an online registration form

---

## 🛠️ Technologies Used

- **Java** ☕  
- **MySQL** 🐬  
- **Selenium WebDriver (ChromeDriver)** 🌐  
- **TestNG** ✅  
- **JDBC** 📦

---

## 📋 Prerequisites

Before you begin, make sure you have the following installed and set up:

- Java JDK  
- MySQL Server with the `classicmodels` database  
- Google Chrome browser  
- ChromeDriver executable (version matching your Chrome browser)  
- TestNG library added to your project dependencies

---

## 📝 Notes

- Ensure the `customers` table exists in your `classicmodels` database with the expected columns  
- The target form URL: [https://smartbuy-me.com/account/register](https://smartbuy-me.com/account/register)  
- The submit button action is **commented out** to prevent actual account creation — you can uncomment it if needed for live testing
