class BankAccount {
  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  // Centralized logic for deposit and withdrawal
  public void updateBalance(double amount, boolean isDeposit) {
    if (isDeposit) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else if (amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Invalid transaction.");
    }
  }
}

public class Encapsulation3 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(1000.00);
    // Maintenance: Any bug in updateBalance can be fixed in one place
    account.updateBalance(500.00, true); // Deposit
    account.updateBalance(300.00, false); // Withdraw
    System.out.println("Final Balance: " + account.getBalance());
  }
}