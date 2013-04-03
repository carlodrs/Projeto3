package bigbank;
     
import org.springframework.util.Assert;
     
public class BankServiceImpl
       implements BankService
 {
   private final BankDao bankDao;
 
   public BankServiceImpl(BankDao bankDao)
   {
    Assert.notNull(bankDao);
  this.bankDao = bankDao;
   }
 
   public Account[] findAccounts() {
  return this.bankDao.findAccounts();
   }
 
   public Account post(Account account, double amount) {
  Assert.notNull(account);
 
  Account a = this.bankDao.readAccount(Long.valueOf(account.getId()));
  if (a == null) {
    throw new IllegalArgumentException("Couldn't find requested account");
     }
 
  a.setBalance(a.getBalance() + amount);
   this.bankDao.createOrUpdateAccount(a);
   return a;
   }
 
   public Account readAccount(Long id) {
   return this.bankDao.readAccount(id);
   }
 }
