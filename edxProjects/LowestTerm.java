
package edxProjects;

public class LowestTerm {
    public static void main(String[] args) {
        lowest(210,315);
    }
    public static void lowest(int num, int denom){
  int z =  Gcd.gcd(num, denom);
    num /= z;
    denom /= z;
        System.out.printf("%s%d/%d", "Simplest form " , num, denom); 
    }
    
}
