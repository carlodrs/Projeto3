package bigbank;

public class Account
{
    private long id = -1L;
  private String holder;
  private double balance;
  private double overdraft = 100.0D;

  public Account(String holder) {
      this.holder = holder;
  }

  public long getId() {
      return this.id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public String getHolder() {
      return this.holder;
  }

  public void setHolder(String holder) {
      this.holder = holder;
  }

  public double getBalance() {
      return this.balance;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }

  public double getOverdraft() {
      return this.overdraft;
  }

  public void setOverdraft(double overdraft) {
      this.overdraft = overdraft;
  }

  public String toString() {
      return "Account[id=" + this.id + ",balance=" + this.balance + ",holder=" + this.holder + ", overdraft=" + this.overdraft + "]";
  }
}

