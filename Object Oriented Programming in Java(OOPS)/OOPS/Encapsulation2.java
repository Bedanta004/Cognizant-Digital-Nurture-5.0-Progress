class BankAccount {
  private String accountNumber; // Data is hidden
  private double balance; // Data is hidden
  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  // Public getter for balance (read-only access)
  public double getBalance() {
    return balance;
  }

  // Public method for deposit (controlled access)
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Public method for withdrawal (controlled access)
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }
}

public class Encapsulation2 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("12345", 1000.00);

    // Accessing balance only through public methods
    account.deposit(500.00);
    account.withdraw(300.00);

    // Unauthorized access prevented: No direct modification
    System.out.println("Account Balance: " + account.getBalance());
  }
}