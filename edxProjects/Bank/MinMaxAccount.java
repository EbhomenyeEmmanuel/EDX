package edxProjects.Bank;
/*
 *
 * @eebhomenye@yahoo.com
 */
public class MinMaxAccount extends BankingAccount {
    public MinMaxAccount(Startup s){
        super(s);
    }public int getMax(){
        return super.credit + s.getBalance();
    }
    public int getMin(){
        return super.debit + s.getBalance();
    }
    public String toString(){
        return String.format("Min:%d,Max:%d", getMin(), getMax());
    }
}
