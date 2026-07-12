// Parent Class
class BankAccount {

    public String name;
    public double balance;

    // Constructor to initialize account holder name and balance
    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    // Deposit amount into account
    void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    // Display current account balance
    void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }

    // Withdraw amount if sufficient balance is available
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// Child Class (Inheritance)
class SavingAccount extends BankAccount {

    // Calls the constructor of the parent class
    SavingAccount(String n, double b) {
        super(n, b);
    }

    // Adds fixed interest to the account balance
    void addInterest() {
        balance += 100;
        System.out.println("Interest Added!");
        System.out.println("New Balance: " + balance);
    }
}

// Main Class
public class BankManagementSystem {

    public static void main(String[] args) {

        // Creating an object of SavingAccount
        SavingAccount account = new SavingAccount("Rahul", 1000.0);

        // Deposit money
        account.deposit(3000);

        // Check available balance
        account.checkBalance();

        // Withdraw money
        account.withdraw(600);

        // Add interest
        account.addInterest();
    }
}
