public class Checking extends Account {

    private int[] last10checks = new int[10];

    public Checking() {

    }

    //Constructor for creating a Checking object with initial values
    public Checking(String name, int taxID, double balance) {
        super(name, taxID, balance);
    }

    //Method to write a check from the checking account
    public void writeCheck(int checknum, double amount) {
        if (numwithdraws < 10) {
            last10checks[numwithdraws] = checknum;
            last10withdraws[numwithdraws] = amount;
            numwithdraws++;
        }
        balance -= amount;
    }

    //Overriden method to display checking account details including checks
    public void display() {
        super.display();
        System.out.println("Last 10 Checks");
        for (int i = 0; i < numwithdraws; i++) {
            System.out.println("Check #" + last10checks[i] + ": $" + last10withdraws[i]);
        }


    }

}
