// Bank Account Class
class BankAccount {

    // Private data member (Encapsulation)
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Balance set to 0.");
        }
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Transaction Failed! Insufficient balance or invalid amount.");
        }
    }

    // Getter method (Read-only access)
    public double getBalance() {
        return balance;
    }
}

// Main Class
public class BankAccountEncapsulation {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(2000);

        myAccount.deposit(500);
        myAccount.withdraw(400);

        System.out.println("Current Balance : " + myAccount.getBalance());

        // Insufficient balance test
        myAccount.withdraw(4000);

        // Direct access is not allowed because balance is private.
        // myAccount.balance = 50000;
    }
}
