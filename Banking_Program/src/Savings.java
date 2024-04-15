public class Savings extends Account {


    public Savings() {

    }

    //Constructor for creating a Savings object with these inital values
    public Savings(String name, int tacID, double balance) {
        super(name, tacID, balance);
    }

    //Method to perform a withdrawal from the savings account
    public void doWithdraw(double amount) {
        if (numwithdraws < 10) {
            last10withdraws[numwithdraws] = amount;
            numwithdraws++;
        }
        balance -= amount;
    }

    //Overridden method to display savings account details including withdrawals
    public void display() {
        super.display();
        System.out.println("Last 10 Withdraws");
        for (int i = 0; i < numwithdraws; i++) {
            System.out.println("Withdraw #" + (i + 1) + ": $" + last10withdraws[i]);


        }
    }
}


