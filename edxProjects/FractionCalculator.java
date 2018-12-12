    
package edxProjects;
import java.util.Scanner;
public class FractionCalculator {
    public static void main(String[] args) {
        Fraction myFrac = new Fraction();
     String a = intro();
     getOperation(a);
     System.out.println("Please enter a fraction (a/b) or integer ");
        Scanner input = new Scanner(System.in);        
        String num = input.next();
      validFraction(num);
        System.out.println(validFraction(num));
    }
    public static String intro(){
        Scanner input = new Scanner(System.in);
        System.out.printf("This program is a fraction calculator \n "
                + "It will add, subtract, multiply and divide fractions until you type Q to quit. \n"
                + "Please enter your fraction in the form a/b, where a and b are integers. ");
         System.out.println("Please enter an operation(+, -, *, = or Q to quit ) "); 
         String a = input.next();
        return a;
    }
  public static String getOperation(String a){
      Scanner input = new Scanner(System.in);
      while(true){
          if (a.equals("*") || a.equals("/") || a.equals("+") || a.equals("-")|| a.equals("=")) {
              break; 
          }else if (a.equals("Q") || a.equals("q")){
              System.out.println("Exiting...");
              System.exit(0);
          }
           else{
              System.out.println("Invalid input (+, -, *, / , =, q or Q to quit )"); 
          }
           a  = input.next();
      }
      return a;
  }
    public static Boolean validFraction(String z) {
        String d = "ABCDEFGHIJKLMNOPQRSTUWXYZ";        
        int num,denom;
         Fraction myFrac;
         //If the input is a string return false
         if (d.contains(z.charAt(0) +"")) {
             return false;
        }
      /*Check if there is '/' 
         *If there isnt , that means the input must be a number
         *If there is , separate 
        num and denominator by subtrings
         */
        else if(!(z.charAt(0) + "").equals("/") && !(d.contains(z)) ){
            for (int i = 0; i < z.length(); i++) {
                if (!(z.charAt(i) + "").equals("/")) {
                    //End of loop... change the String that is "/" free to integer
                    //Else create subtrings to separate...
                    if (i == z.length()) {
                      num = Integer.parseInt(z);
                     myFrac = new Fraction(num);
                     //return true;
                    }                   
                }else{
                    String a = z.substring(0,i);
                    num = Integer.parseInt(a);
                    String b = z.substring(++i);
                    denom = Integer.parseInt(b);
                     myFrac = new Fraction(num, denom);
                    break;
                }
            }
            return true;
        }
        else {
            return false;
        }
                
    }
}
