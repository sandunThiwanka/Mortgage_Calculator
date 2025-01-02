# Mortgage Calculator Project

## Overview

This project is a simple **Mortgage Calculator** application written in **Java**. It allows users to calculate their mortgage payments and view a detailed payment schedule based on the loan amount, annual interest rate, and loan term provided by the user.

The application provides a user-friendly and interactive interface, using custom input methods to ensure accurate data entry.

---

## Features

- **Interactive Input:**  
  Users are prompted to input values such as the loan principal, annual interest rate, and loan duration in an easy-to-use manner.

- **Mortgage Calculation:**  
  Computes the monthly mortgage payment using the provided values.

- **Payment Schedule:**  
  Prints a detailed breakdown of payments over the course of the loan, helping users understand how much they are paying toward interest and the loan principal.

- **Validation:**  
  Ensures user inputs fall within a realistic range (e.g., loan between $1,000 and $1,000,000, interest rate between 0.1% and 100%, etc.).

---

## How It Works

1. **Inputs:**  
   The user provides:
   - **Loan Principal**: The total amount borrowed.
   - **Annual Interest Rate**: The yearly interest rate on the loan.
   - **Loan Term**: The number of years for repayment.

2. **Mortgage Calculation:**  
   Calculates the monthly mortgage payment using the **loan principal**, **interest rate**, and **duration**.

3. **Payment Schedule:**  
   A schedule is generated showing how monthly payments are divided into interest and principal for the entire duration of the loan.

---

## Usage

### Run the Application
To run the program:
1. Ensure you have **Java SDK (version 23..)** installed on your machine.
2. Build and execute the `Main` class to start the program.

### Input the Following Data When Prompted:
- Principal (Loan Amount): Between **$1,000** and **$1,000,000**.
- Annual Interest Rate: Between **0.1%** and **100%**.
- Loan Duration: Between **1 and 30 years**.

### Example Output:
- Monthly Mortgage Payment: `$X,XXX.XX`
- Payment Schedule:
  - Month 1: `$X,XXX.XX` (Principal: `$XXX.XX`, Interest: `$XXX.XX`)
  - Month 2: `$X,XXX.XX` (Principal: `$XXX.XX`, Interest: `$XXX.XX`)
  - ... and so on for the duration of the loan.

---

## Classes and Responsibilities

- **`Main` Class**:  
  Orchestrates user input and ties together the other classes.
  
- **`Console` Class**:  
  Handles user input, providing a clean and reusable way to read specific types of data from the console.
  
- **`MortgageCalculator` Class**:  
  Contains the logic for calculating the mortgage payment and payment schedule.
  
- **`MortgageReport` Class**:  
  Formats and displays the results of the mortgage calculation for the user.

---

## Build and Compile

To build and compile the project:
1. Open the project in **IntelliJ IDEA** (ensure the Java SDK version is set to **23..**).
2. Compile the `Main` class and resolve any project dependencies if needed.
3. Run the program to start the interactive console application.

---

## Requirements

- **Java SDK**: Version 23..
- **IntelliJ IDEA** (or any preferred IDE)
- Basic understanding of terminal/console input and output.

---

## Future Enhancements

- Add a **Graphical User Interface (GUI)** for better usability.
- Support for additional loan types (e.g., adjustable-rate mortgages).
- Integration with external data sources for real-time interest rates.
- Localization support for different languages and currencies.

---

## License

This project is open-source and available under the **MIT License**. Feel free to contribute or modify the code as needed.

---

## Contact

For any questions or suggestions, please feel free to reach out:

- Email: **[sandunthiwanka904@gmail.com]**
- GitHub: **[[repository-link](https://github.com/sandunThiwanka/Mortgage_Calculator)]**

Happy Coding! 😊
