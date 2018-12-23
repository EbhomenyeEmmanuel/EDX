package edxProjects.Bank;

/*
 *
 * @eebhomenye@yahoo.com
 */
//Beginning of the account
public class Startup {
    private int initialBalance ;
    Credit c;
    Debit d;
    
     public Startup(int initialBalance){
         this.initialBalance = initialBalance;
     }
     public Startup(){
         this(0);
     }
     public void setBalance(int initialBalance){
         this.initialBalance = initialBalance;
     }
     public int getBalance(){
        return initialBalance ;
     }
     public String toString(){
         return String.format("Initial Balance: %d", getBalance() );
     }
}
