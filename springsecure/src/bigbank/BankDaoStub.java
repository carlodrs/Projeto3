 package bigbank;
 
 import java.util.HashMap;
import java.util.Map;
 
 public class BankDaoStub
   implements BankDao
 {
   private long id;
   private final Map<Long, Account> accounts;
 
   public BankDaoStub()
   {
       this.id = 0L;
       this.accounts = new HashMap<Long, Account>(); 
   }
 
   public void createOrUpdateAccount(Account account) {
      if (account.getId() == -1L) {
         this.id += 1L;
         account.setId(this.id);
     }
       this.accounts.put(new Long(account.getId()), account);
       System.out.println("SAVE: " + account);
   }
 
   public Account[] findAccounts() {
       Account[] accounts = (Account[])this.accounts.values().toArray(new Account[0]);
       System.out.println("Returning " + accounts.length + " account(s):");
       for (Account account : accounts) {
         System.out.println(" > " + account);
     }
       return accounts;
   }
 
   public Account readAccount(Long id) {
       return ((Account)this.accounts.get(id));
   }
 }

 