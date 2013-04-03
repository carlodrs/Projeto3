     package bigbank.web;
     
     import bigbank.BankService;
     import javax.servlet.http.HttpServletRequest;
     import javax.servlet.http.HttpServletResponse;
     import org.springframework.util.Assert;
     import org.springframework.web.servlet.ModelAndView;
     import org.springframework.web.servlet.mvc.Controller;
     
     public class ListAccounts
       implements Controller
     {
       private final BankService bankService;
     
       public ListAccounts(BankService bankService)
       {
       Assert.notNull(bankService);
       this.bankService = bankService;
       }
     
       public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
         throws Exception
       {
       ModelAndView mav = new ModelAndView("listAccounts");
       mav.addObject("accounts", this.bankService.findAccounts());
       return mav;
       }
     }
