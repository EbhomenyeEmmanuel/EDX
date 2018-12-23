package edxProjects.Bank;
/*
 *
 * @eebhomenye@yahoo.com
 */
public class Transaction {
    public static void main(String[] args) {
        Startup s = new Startup();
        s.setBalance(1000);
        System.out.println(s);
        //Set credit
        Credit c = new Credit();
        c.setCredit(100);
        //Set debit
        Debit d = new Debit();
        d.setDebit(50);
        
        //Return balance
        BankingAccount bank = new BankingAccount(s);
        
        System.out.println(bank);
    }
}
