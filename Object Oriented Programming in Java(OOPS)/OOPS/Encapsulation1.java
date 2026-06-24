class BankAccount {
  // Private variables (data hiding)
  private String accountNumber;
  private double balance;

  // Constructor
  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  // Public getter method
  public String getAccountNumber() {
    return accountNumber;
  }

  // Public getter method
  public double getBalance() {
    return balance;
  }

  // Public setter method for deposit
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Public setter method for withdrawal
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }
}

public class Encapsulation1 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("12345", 1000.00);
    System.out.println("Account Number: " + account.getAccountNumber());
    System.out.println("Initial Balance: " + account.getBalance());
    account.deposit(500.00);
    System.out.println("Updated Balance: " + account.getBalance());
    account.withdraw(200.00);
    System.out.println("Final Balance: " + account.getBalance());
  }
}