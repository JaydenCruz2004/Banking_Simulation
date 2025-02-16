# Banking Simulation

## Description
This Java project implements a simple banking application that demonstrates **inheritance** in object-oriented programming. The application features three types of accounts:

- **Checking Account**
- **Savings Account**
- **Credit Card Account**

Each of these accounts is derived from a common base class called `Account`. The program allows users to interact with their accounts through text-based commands, performing various transactions such as deposits, withdrawals, check writing, and credit card payments.

---

## Features
✔️ Deposit and withdraw money from **Checking** and **Savings** accounts  
✔️ Write checks from the **Checking** account  
✔️ Make payments and charges on a **Credit Card** account  
✔️ Display account details for all account types  
✔️ Keep track of **rolling balances** for each account  
✔️ Exit the program when finished  

---

## File Structure

```
.
├── src
│   ├── Account.java       # Base class for all account types
│   ├── Checking.java      # Represents a checking account
│   ├── CreditCard.java    # Represents a credit card account
│   ├── Savings.java       # Represents a savings account
│   ├── RunBank.java       # Main class to run the banking simulation
└── README.md             # Project documentation
```

## How to Use
The user interacts with the program by entering commands:

| **Command**                                      | **Action** |
|--------------------------------------------------|-----------|
| `deposit savings <amount>`                      | Deposits money into the savings account |
| `withdraw savings <amount>`                     | Withdraws money from the savings account |
| `deposit checking <amount>`                     | Deposits money into the checking account |
| `write check <amount>`                          | Writes a check from the checking account |
| `pay credit <amount>`                           | Makes a credit card payment |
| `charge credit <amount>`                        | Makes a charge on the credit card |
| `display savings`                                | Shows details of the savings account |
| `display checking`                               | Shows details of the checking account |
| `display credit`                                 | Shows details of the credit card account |
| `exit`                                          | Exits the program |

---

## Output
The program will display a **rolling balance** for each account after every transaction, ensuring that users always have an up-to-date view of their financial status.

---

## Future Improvements
🔹 Implement file storage to save and load account balances\
🔹 Add a Graphical User Interface (GUI) for better usability\
🔹 Enhance security features like password protection\
🔹 Introduce interest calculations for savings accounts\

## Author
**Developed** by Jayden Cruz
