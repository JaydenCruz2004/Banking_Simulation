public class CreditCard extends Account {

    private int cardnumber;
    private String[] last10charges = new String[10];

    public CreditCard() {

    }

    //Constructor for creating a CreditCard object with these initial values
    public CreditCard(String name, int taxID, double balance, int cardNumber) {
        super(name, taxID, balance);
        this.cardnumber = cardnumber;
    }

    //Method to debit a charge from the credit card
    public void debitCharge(String name, double amount) {
        if (numwithdraws < 10) {
            last10charges[numwithdraws] = name;
            last10withdraws[numwithdraws] = amount;
            numwithdraws++;
        }
        balance -= amount;
    }

    // Method to make a payment to the credit card
    public void makePayment(double amount) {
        if (numdeposits < 10) {
            last10deposits[numdeposits] = amount;
            numdeposits++;
        }
        balance += amount;

    }

    //Overridden method to display credit card details including charges
    public void display() {
        super.display();
        System.out.println("Last 10 Charges:");
        for (int i = 0; i < numwithdraws; i++) {
            System.out.println("Charge #" + (i + 1) + ":" + last10charges[i] + ": $" + last10withdraws[i]);

        }
    }

}
