package edxProjects.Bank;
/*
 *
 * @eebhomenye@yahoo.com
 */
public class BankingAccount extends Startup{
     Startup s;
      static int debit;
      static int credit;
     
     public BankingAccount(Startup s){
         super(s.getBalance());        
    }
    public void credit(Credit c){
        BankingAccount.credit = c.getCredit();
         System.out.println("Credit is " + c.getCredit());
    }
    public void debit(Debit d){
         this.debit = d.getDebit();
        System.out.println("Debit is " + d.getDebit());       
    }
    @Override
    public int getBalance(){
        return (super.getBalance() + c.getCredit()) - d.getDebit();
    }    
    @Override
    public String toString(){
        /*Due to has-A relationship of the parent class ,
        *the is - A relationship btwn the child and the parent class should allow the child class access its objects .
        *The parents class objects are Credit and Debit
                */
        System.out.println("c.getCredit()) "  + c.getCredit());
        System.out.println(" d.getDebit()) " + d.getDebit() );
        return  String.format("Account Balance :%d", getBalance());
    }
   }