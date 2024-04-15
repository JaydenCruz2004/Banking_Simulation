/* Name: Jayden Cruz
# Date: 9/26/2023
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
    program.
# Description: This Java project implements a simple banking application that demonstrates the use of inheritance in
object-oriented programming. The application features three types of accounts:
Checking, Savings, and Credit Card, all derived from a common base class called Account.
# Input: The user types commands such as
1. To make a deposit into the Savings account:
2. To make a withdrawal from the Savings account:
3. To make a deposit into the Checking account:
4. To write a check from the Checking account
5. To make a credit card payment:
6. To make a credit card charge:
7. To display the Savings account details:
8.To display the Checking account details:
9. To display the Credit Card account details:
10. To exit the program
# Output:The program will display the rolling balance of each of the
classes. */
public class Account {

    //common attriubues
    protected String name;
    protected int taxID;
    protected double balance;

    protected double[] last10withdraws = new double[10];
    protected double[] last10deposits = new double[10];

    protected int numdeposits;
    protected int numwithdraws;

    //Default constructor for Account class
    public Account() {

    }

    // Constructor for creating an Account object with initial values
    public Account(String name, int taxID, double balance) {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;

    }


    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for taxID
    public void setTaxID(int taxID) {
        this.taxID = taxID;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for taxID
    public int getTaxID() {
        return taxID;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    //Method to make a deposit into the account
    public void makeDeposit(double amount) {
        if (numdeposits < 10) {
            last10deposits[numdeposits] = amount;
            numdeposits++;
        }
        balance += amount;
    }

    //Method to display account details including deposits and withdrawals
    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Tax ID: " + taxID);
        System.out.println("Balance: $" + balance);


    }


}