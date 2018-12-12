
package edxProjects;

import java.util.Scanner;
public class TripPlanner1 {
public static void main (String args []){ 
 Scanner input = new Scanner(System.in); 
        /*
        TripPlanner trip = new TripPlanner();
       trip.intro();
       trip.budget();
       trip.time();
       trip.distance();
    }
    public void intro(){
 
    }
    */
         System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name ? ");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name );
        System.out.println("Where are you travelling to? ");
        String cityName = input.nextLine();
        System.out.println("Great! " + cityName + " sounds like a  great trip.");
        /*
    }
     public void budget(){
        */
         System.out.println("How many days are you going to spend travelling? ");
         int numOfDaysTravelling = input.nextInt();
          System.out.println("How Much money , in USD, are you planning to spend on your trip? ");
          double cashToSpendDuringVacationInUSD = input.nextInt();
        System.out.println("What is the three letter curency symbol for your travel destination :");
        String threeLetterCitySymbol = input.next();
       
         System.out.print("How many " + threeLetterCitySymbol + " are they in 1 USD? ");
         double priceOfCurrencyInOneUSD = input.nextDouble();
        /*
    }
    public void time(){
*/
         //Prompt the user to enter time diff btwn home and destination
                System.out.println(" What is the time differnce, in hours, between your home and your destination? ");
               int timeDifference = input.nextInt();
               
              // Calculate the time in your travel destination
              
              int timeInDestinationInAm =  timeDifference;
              System.out.printf("%s%d%s", "That means that when it is midnight at home it will be ",(timeInDestinationInAm % 24), ":00 in your travel destination");
             
              //Calculate the time at home by adding 12 hours to time of destination
              int timeInDestinationInPm = (timeInDestinationInAm % 24 )+ 12;
              System.out.printf("%s%d%s", " and when it is noon at home it will be ", timeInDestinationInPm, ":00");
              
               System.out.println();
               
               
        //Calculate the hours in the holiday days
           //Calculate the mins in the holiday days
         
         int hoursInThatDay = numOfDaysTravelling * 24;
         int minsInThatDay = numOfDaysTravelling * 24 * 60;
         System.out.println("If you are travelling for " + numOfDaysTravelling+ " days that is the same as " + hoursInThatDay +  " hours or " + minsInThatDay + " minutes");
        //Calculate the cash to be spent during the holiday in USD
         double cashToBeSpentInUSD = cashToSpendDuringVacationInUSD / numOfDaysTravelling ;
         
          System.out.printf("%s%4.1f%s%5.2f%s", "If you are going to spend $", cashToSpendDuringVacationInUSD , " USD that means per day you can spend up to $", cashToBeSpentInUSD,  "USD" );
          System.out.println();
          
          double totalBudgetInYourCurrency = cashToSpendDuringVacationInUSD * priceOfCurrencyInOneUSD;
          double cashToBeSpentPerDayInYourCurrency = cashToBeSpentInUSD * priceOfCurrencyInOneUSD; 
          System.out.print("Your total budget in " + threeLetterCitySymbol + " is " + totalBudgetInYourCurrency + " "+ threeLetterCitySymbol + " which per day is " );
                System.out.printf("%4.2f%s%s", cashToBeSpentPerDayInYourCurrency, " ", threeLetterCitySymbol);
                
                System.out.println();
/*
    }
    public void distance(){
         */
              //Prompt the user to enter the distance of the destination in km 
              System.out.println("What is the square area of your destination country in km? ");
              int squareAreaInKm = input.nextInt();
              //Calculate the distance of the destination in miles 
              
              System.out.print("In miles that is ");
              double distanceInMiles = squareAreaInKm * 0.386;
              System.out.printf("%1.2f", distanceInMiles);
              System.out.println();
}
    }