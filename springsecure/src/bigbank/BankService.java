package bigbank;

import org.springframework.security.access.prepost.PreAuthorize;

public abstract interface BankService
{
  public abstract Account readAccount(Long paramLong);

  public abstract Account[] findAccounts();

  @PreAuthorize("hasRole('supervisor') or hasRole('teller') and (#account.balance + #amount >= -#account.overdraft)")
  public abstract Account post(Account paramAccount, double paramDouble);
}