import java.util.Scanner;

public class RunBank {
    public static void main(String[] args) {
        //Create account objects with an initial balance of $100
        Checking checkingAccount = new Checking("Jayden Cruz", 123456789, 100.0);
        Savings savingsAccount = new Savings("Benito Cruz", 987654321, 100.0);
        CreditCard creditCardAccount = new CreditCard("Bob Bobby", 777777777, -100.0, 2004);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            //Display Account Balances
            System.out.println("Checking balance: $" + checkingAccount.getBalance());
            System.out.println("Savings balance: $" + savingsAccount.getBalance());
            System.out.println("Credit Card balance: $" + creditCardAccount.getBalance());

            //Display the menu
            System.out.println("Benito Financial Plus.\n"
                    + "*****************************************");
            System.out.println("1. " + "Savings Deposit");
            System.out.println("2. " + "Savings Withdrawal");
            System.out.println("3. " + "Checking Deposit");
            System.out.println("4. " + "Write a Check");
            System.out.println("5. " + "Credit Card Payment");
            System.out.println("6. " + "Make a Charge");
            System.out.println("7. " + "Display Savings");
            System.out.println("8. " + "Display Checking");
            System.out.println("9. " + "Display Credit Card");
            System.out.println("10. " + "Press 10 to exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit into Savings: $");
                    double savingsDepositAmount = scanner.nextDouble();
                    savingsAccount.makeDeposit(savingsDepositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw from Savings: $");
                    double savingsWithdrawalAmount = scanner.nextDouble();
                    savingsAccount.doWithdraw(savingsWithdrawalAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to deposit into Checking: $");
                    double checkingDepositAmount = scanner.nextDouble();
                    checkingAccount.makeDeposit(checkingDepositAmount);
                    break;

                case 4:
                    System.out.print("Enter the check number: ");
                    int checkNumber = scanner.nextInt();
                    System.out.print("Enter the amount to write the check for: $");
                    double checkAmount = scanner.nextDouble();
                    checkingAccount.writeCheck(checkNumber, checkAmount);
                    break;

                case 5:
                    System.out.print("Enter the credit card payment amount: $");
                    double paymentAmount = scanner.nextDouble();
                    creditCardAccount.makePayment(paymentAmount);
                    break;

                case 6:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter the charge description: ");
                    String chargeDescription = scanner.nextLine();
                    System.out.print("Enter the charge amount: $");
                    double chargeAmount = scanner.nextDouble();
                    creditCardAccount.debitCharge(chargeDescription, chargeAmount);
                    break;

                case 7:
                    savingsAccount.display();
                    break;

                case 8:
                    checkingAccount.display();
                    break;

                case 9:
                    creditCardAccount.display();
                    break;

                case 10:
                    // Exit the program
                    System.out.println("Exiting the bank program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }


        }
    }
}

