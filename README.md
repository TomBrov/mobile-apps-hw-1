# **Bank Account Management System**

This project implements a **Bank Account Management System** as part of the Mobile Apps Development HW1 assignment. It supports different account types and provides a bank class to manage them.

## **Features**
### Account Types:
1. **Standard Account**:
    - Allows withdrawals up to a credit limit.
    - Ensures no withdrawal exceeds the balance and credit limit.

2. **Basic Account**:
    - Has a withdrawal limit for each transaction.
    - No credit limit (balance cannot go negative).

3. **Premium Account**:
    - Allows unlimited withdrawals with no restrictions.

### Bank Operations:
- **Open Account**: Add a new account to the bank.
- **Close Account**: Remove an account if the balance is positive.
- **Retrieve Accounts**:
    - Accounts in debt (negative balance).
    - Accounts with a balance above a specified amount.

---

## **Technologies Used**
- **Java** (JDK 11 or higher)

---

## **How to Run**
1. Clone the repository:
   ```bash
   git clone <repository-link>
    ```
2. Compile all Java files:
    ```bash
    javac *.java
     ```
3. Run the test program:
    ```bash
    java Main
    ```

## **Project Structure**
The project contains the following files:
```bash
src/
├── IAccount.java           # Interface for accounts
├── IBank.java              # Interface for bank operations
├── StandardAccount.java    # Standard account implementation
├── BasicAccount.java       # Basic account implementation
├── PremiumAccount.java     # Premium account implementation
├── Bank.java               # Bank class implementation
└── Main.java               # Test program
   ```

## **Program Workflow**
The Main.java file creates instances of StandardAccount, BasicAccount, and PremiumAccount.
These accounts are added to the Bank using OpenAccount.
Deposits and withdrawals are performed to test the behavior of each account type.
Bank methods are used to retrieve and display accounts based on balance conditions.


## **Code Highlights**
1. Polymorphism:
   - The IAccount interface allows the bank to handle different account types uniformly.
2. Encapsulation:
   - Each account class manages its own balance and behavior internally.
3. Error Handling: 
   - Ensures credit limits and withdrawal limits are respected.
   - Prevents invalid operations like withdrawing negative amounts.

## **Output Example**
Example output of the test program:
```bash
Standard Withdraw: 200.0
Basic Withdraw: 50.0
Premium Withdraw: 500.0
Standard Balance: -100.0
Basic Balance: 150.0
Premium Balance: -300.0
```