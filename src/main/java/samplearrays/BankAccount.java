package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    double[] transactions = new double[1000];
    int transactionCount = 0;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions

    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            currentBalance += amount;
            transactions[transactionCount] = amount;
            transactionCount++;
            System.out.println("Deposited " + amount + " from " + name + ", new balance: " + currentBalance);
        } else {
            System.out.println("Unsuccessful deposit: amount must be positive");
        }
    }

    public void withdraw(double amount){
        if (amount > 0) {
            if (amount <= currentBalance) {
                currentBalance -= amount;
                transactions[transactionCount] = -amount;
                transactionCount++;
                System.out.println("Withdrawn " + amount + " from " + name + ", new balance: " + currentBalance);
            } else {
                System.out.println("Unsuccessful withdrawal: Balance insufficient");
            }
        } else {
            System.out.println("Unsuccessful withdrawal: amount must be positive");
        }

    }

    public void displayTransactions(){
        System.out.println("Transaction History : --------------------");
        for (int i = 0; i < transactionCount; i++){
            double transaction = transactions[i];
            if (transaction > 0){
                System.out.println("Deposit: " + transaction);
            } else {
                System.out.println("Withdrawal: " + transaction);
            }
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance: " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
