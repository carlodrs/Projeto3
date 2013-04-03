 package bigbank;
 
 import org.springframework.beans.factory.InitializingBean;
 import org.springframework.util.Assert;
 
 public class SeedData
   implements InitializingBean
 {
   private BankDao bankDao;
 
   public void afterPropertiesSet()
     throws Exception
   {
       Assert.notNull(this.bankDao);
       this.bankDao.createOrUpdateAccount(new Account("rod"));
       this.bankDao.createOrUpdateAccount(new Account("dianne"));
       this.bankDao.createOrUpdateAccount(new Account("scott"));
       this.bankDao.createOrUpdateAccount(new Account("peter"));
   }
 
   public void setBankDao(BankDao bankDao) {
       this.bankDao = bankDao;
   }
 }
