# OOP Bank Account Assignment

## Student Information

* **Full Name:** Tinevimbo Sagonda
* **Registration Number:** H250362G
* **Department:** Software Engineering
* **Course:** Object-Oriented Programming (OOP)

## Assignment Description

This practical assignment demonstrates Object-Oriented Programming concepts using a simple bank account system.

The program contains two types of accounts:

* **SavingsAccount** – maintains a minimum balance and earns interest at month-end.
* **CurrentAccount** – supports overdrafts up to a specified limit and charges a monthly maintenance fee.

## Files

| File                  | Description                                               |
| --------------------- | --------------------------------------------------------- |
| `Account.java`        | Abstract parent class containing common account behaviour |
| `SavingsAccount.java` | Implements savings account rules                          |
| `CurrentAccount.java` | Implements current account and overdraft rules            |
| `BankDemo.java`       | Demonstrates polymorphism using a list of accounts        |

## OOP Concepts Demonstrated

* Abstraction
* Inheritance
* Encapsulation
* Method overriding
* Polymorphism

## How to Run

Compile the Java files:

```bash
javac *.java
```

Run the program:

```bash
java BankDemo
```

## Expected Demonstration

The program demonstrates:

1. A SavingsAccount withdrawal being rejected when it would fall below the minimum balance.
2. A CurrentAccount going into overdraft within its allowed limit.
3. Different `endOfMonth()` behaviours for SavingsAccount and CurrentAccount.
4. Polymorphism through an `Account` reference.
