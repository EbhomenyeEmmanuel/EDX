package edxProjects;
import java.util.*;
public class OddsAndEvensProjects {
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        
        //This part picks odds or even 
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        
        System.out.print("What is your name? ");
        String userName = input.nextLine();
         System.out.print("Hi " + userName+ " which do you choose? (O)dds or (E)vens? ");       
   String b = input.next();
  char userSelection = b.charAt(0);
  
  while (userSelection != 'E' && userSelection != 'O' ){
          System.out.println("INVALID INPUT! \nCHOSE EITHER \'E\' OR \'O\'");
          System.out.print("Hi " + userName+ " which do you choose? (O)dds or (E)vens? ");
       b = input.next();
       userSelection = b.charAt(0);
      }
  if (userSelection == 'O'){
      System.out.println("YOU have picked odds! The computer will be evens");
      } else //(userSelection == 'E')
  {
      System.out.println("You have picked evens! The computer will be odds");
   }
    
        System.out.println("----------------------------------------------------");
          
        //This part plays the game 
        System.out.print("How many \"fingers\" do you put out? ");
        int numOfFingers = input.nextInt();
        
        Random rand = new Random();
        int compNumOfFingers = 1 + rand.nextInt(5);
        System.out.println("The computer plays " + compNumOfFingers + " fingers");
        
        System.out.println("----------------------------------------------------");
         int sum = numOfFingers + compNumOfFingers ;
         
         boolean even = sum % 2 == 0;
         System.out.println(compNumOfFingers + " + " + numOfFingers + " = " + (compNumOfFingers + numOfFingers));
         if (even){
             System.out.println(sum + " is ...even");
         }else 
             System.out.println(sum + " is ...odd");
         
         System.out.println("----------------------------------------------------");
         //This part calculates who wins
         
         if (even){
             if (numOfFingers % 2 == 0 && compNumOfFingers % 2 != 0){
                 System.out.println("That means " + userName + " wins! :) ");
             }else if(numOfFingers % 2 != 0 && compNumOfFingers % 2 == 0){
                  System.out.println("That means computer wins! :( ");
             }
             else{
                     System.out.println("It is a draw! :) ");
                     }
         }//if sum == odd
         else{
             if (numOfFingers % 2 != 0 && compNumOfFingers % 2 == 0){
              System.out.println("That means " + userName + " wins! :) ");
             }else if(numOfFingers % 2 == 0 && compNumOfFingers % 2 != 0){
                   System.out.println("That means computer wins! :( ");
             }else{
                   System.out.println("It is a draw! :) ");
             }
         }
    }
}
