

package edxProjects;
import java.util.Scanner;
public class FractionCalculator {
    //Initialize object fields so that all methods can use them
  static Fraction myFrac0;
  //This would hold the first fraction object
   static Fraction myFrac1; 
   //This would hold the second fraction object
    static Fraction myFrac2;
    public static void main(String[] args) { 
      String returnedValueOfGetOperationMethod = getOperation();
      String num1 = "";
      String num2 = "";
       Boolean returnedValueOfvalidFractionMethod ;
       //Create a loop that store user input twice
        for (int i = 0; i < 2; i++) {
             System.out.println("Please enter a fraction (a/b) or integer ");
        Scanner input = new Scanner(System.in);  
            if (i == 0) {
                num1 = input.next();
                 returnedValueOfvalidFractionMethod =  validFraction(num1);
                 //Store the default value of the fraction object into the first fraction object
                 myFrac1 = myFrac0;
            }else{
                num2 = input.next();
               returnedValueOfvalidFractionMethod  =  validFraction(num2);
                //Store the default value of the fraction object into the first fraction object
                 myFrac2 = myFrac0;
            }
            
        getFraction(returnedValueOfvalidFractionMethod );
        }
           performOperation(returnedValueOfGetOperationMethod, num1, num2);
    }
  public static String getOperation(){
        Scanner input = new Scanner(System.in);
        System.out.printf("This program is a fraction calculator \n "
                + "It will add, subtract, multiply and divide fractions until you type Q to quit. \n"
                + "Please enter your fraction in the form a/b, where a and b are integers. ");
         System.out.println("Please enter an operation(+, -, *, = or Q to quit ) "); 
         String a = input.next();
         //Create a loop that makes sure user inputs a valid mathematical operator         
         while(true){
          if (a.equals("*") || a.equals("/") || a.equals("+") || a.equals("-")|| a.equals("=")) {
              break; 
          }else if (a.equals("Q") || a.equals("q")){
              System.out.println("Exiting...");
              System.exit(0);
          }
           else{
              System.out.println("Invalid input (+, -, *, / , =, q or Q to quit )");             
              a = "";
          }
          a = input.next();  
      }
        return a;
  }
  //Check for valid fraction 
    public static Boolean validFraction(String z) {               
        //Initialize the default object
           int num ,denom;
       Boolean value = false;       
        //Check if input matches a digit
        //"[0-9]+" means one or more digits
        if (z.matches("[0-9]+")) {
            num = Integer.parseInt(z);
            //Initialize the default object
               myFrac0 = new Fraction(num);
            value = true;
        }//Check if input matches a Fraction format a/b , where a and b are ints
        else if ( z.matches("\\d{0,}\\/\\d{0,}")  ) {         
            //If true , Separate num and denominator by subtrings         
                for (int i = 1; i < z.length(); i++) {
                    if ((z.charAt(i) + "").equals("/")) {
                  String a = z.substring(0,i);
                    num = Integer.parseInt(a);
                  String b = z.substring(++i);
                    denom = Integer.parseInt(b);
                    //Store the num and denom into the Fraction object
                     myFrac0 = new Fraction(num, denom);
                        if (denom == 0) {
                            value = false;
                            System.out.println("Denominator cannot be Zero");
                            break;
                        }else {
                            value =true;
                        }                   
                    }
                }                   
        }
         else {
            value = false;
        } 
        return value;     
        }
    //Prompt an input of a valid fraction 
    public static void getFraction(Boolean x){        
        while(true){
             if (x == false ) {
                 System.out.println("Fraction is not valid!!!");
                 System.out.println("Please enter a fraction (a/b) or integer ");
                 Scanner input = new Scanner(System.in);
                 String str = input.next();
            validFraction(str);
            x = validFraction(str);
         }else{
                 System.out.println("Fraction is valid!!!");
                 break;
             }             
        }
    }
    //Begin Calculation
    public static void performOperation(String x, String num1, String num2) {         
        if (x.equals("+") ) {
            //Add the Fractions 
           Fraction addedValue =  myFrac1.add(myFrac2 );
            System.out.println(myFrac1 + " + " + myFrac2 + " = " + addedValue);
        }else if(x.equals("-") ){
            //Subtract the Fractions 
           Fraction addedValue =  myFrac1.add(myFrac2);
            System.out.println(myFrac1 + " - " + myFrac2 + " = " + addedValue);
        }else if(x.equals("*") ){
            //Multiply the Fractions 
           Fraction addedValue =  myFrac1.add(myFrac2);
            System.out.println(myFrac1 + " * " + myFrac2 + " = " + addedValue);
        }else if(x.equals("/") ){
            //Divide the Fractions 
           Fraction addedValue =  myFrac1.add(myFrac2);
            System.out.println(myFrac1 + " / " + myFrac2 + " = " + addedValue);
        }else if(x.equals("=") ){
            //Check if the Fractions are equal
            System.out.println("MyFrac1 = " + myFrac1);
        System.out.println("MyFrac2 = " + myFrac2);
             myFrac1.toLowestTerm();
             myFrac2.toLowestTerm();
          Boolean valueOfTestedBoolean =  myFrac1.equals(myFrac2);
            System.out.println("(" + myFrac1 + " = " + myFrac2 + ")" +  " = " + valueOfTestedBoolean);
        }
        //It doesn't allow negative fractions
    }
}
