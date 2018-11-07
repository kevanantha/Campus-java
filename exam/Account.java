public abstract class Account {
  private String name;
  private String accountNo;
  private double balance;
  private static String generateId = "A";

  public Account() {

  }

  public Account(String name) {
    this.name = name;
    this.balance= 0.0;
    //this.accountNo = auto++;
  }

  public Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  //setter
  public void setName(String name) {
    this.name = name;
  }
  public void setAccountNo() {
    this.accountNo = "";
    //this.generateId;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }

  //getter
  public String getName() {
    return this.name;
  }
  public String getAccoutNo() {
    return this.accountNo;
  }
  public double getBalance() {
    return this.balance;
  }

  //method
  public boolean deposit(double income) {
    if (income > 0) {
      setBalance(this.balance + income);
      return true;
    } else {
      return false;
    }
  }

  public abstract boolean withdraw(double outCome);

  public String toString() {
    return this.getName() + this.getAccoutNo() + " with balance $" + this.getBalance();
  }

  public boolean equals(Object obj) {
    Account test = (Account) obj;
    if (this.accountNo.equals(test.accountNo)) {
      return true;
    } else {
      return false;
    }
  }
}
