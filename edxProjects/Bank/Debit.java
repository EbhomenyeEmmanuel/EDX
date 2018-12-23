package edxProjects.Bank;
/*
 *
 * @eebhomenye@yahoo.com
 */
public class Debit {
    private int debit ;
    public Debit(int debit){
        this.debit = debit;
    }
    public Debit(){
        this(0);
    }
    public void setDebit(int debit){
        this.debit = debit;
    }
     public int getDebit(){
        return debit;
    }
    public String toString(){
        return String.format("%d", debit);
    }
}
