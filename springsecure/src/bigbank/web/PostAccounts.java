 package bigbank.web;
 
 import bigbank.Account;
 import bigbank.BankService;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.util.Assert;
 import org.springframework.web.bind.ServletRequestUtils;
 import org.springframework.web.servlet.ModelAndView;
 import org.springframework.web.servlet.mvc.Controller;
 
 public class PostAccounts
   implements Controller
 {
   private final BankService bankService;
 
   public PostAccounts(BankService bankService)
   {
   Assert.notNull(bankService);
   this.bankService = bankService;
   }
 
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
     throws Exception
   {
   Long id = Long.valueOf(ServletRequestUtils.getRequiredLongParameter(request, "id"));
   Double amount = Double.valueOf(ServletRequestUtils.getRequiredDoubleParameter(request, "amount"));
   Account a = this.bankService.readAccount(id);
   this.bankService.post(a, amount.doubleValue());
 
   return new ModelAndView("redirect:listAccounts.html");
   }
 }
