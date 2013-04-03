package bigbank;

public abstract interface BankDao
{
  public abstract Account readAccount(Long paramLong);

  public abstract void createOrUpdateAccount(Account paramAccount);

  public abstract Account[] findAccounts();
}

