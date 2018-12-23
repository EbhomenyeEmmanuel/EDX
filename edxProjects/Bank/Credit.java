/*
 * @eebhomenye@yahoo.com
 */
package edxProjects.Bank;

public class Credit {
    private int credit;
    public Credit(int credit){
         this.credit = credit;
    }
    public Credit(){
       this(0);
    }
    public void setCredit(int credit){
        this.credit = credit;
    }
     public int getCredit(){
        return credit;
    }
    public String toString(){
        return String.format("%d", credit);
    }

}
