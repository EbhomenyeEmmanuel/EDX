package edxProjects;

import java.util.Scanner;
public class MazeRunner {
    public static void main(String[] args) {
        
        Maze myMap = new Maze();
      //  Scanner input = new Scanner(System.in);
        intro();
        myMap.printMap();
    String direction = userMove();
    legalMove(direction);
       myMap.printMap();
    }
    
    public static void intro(){
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
    }
    
    public static String userMove(){
      Scanner input = new Scanner(System.in);
      String direction;
          while(true){
            System.out.print("Where would you like to move?(R, L, U, D ): ");
        direction = input.next();
        direction = direction.charAt(0) + "";
        direction = direction.toUpperCase();
            if (direction.equals("R") || direction.equals("L") || direction.equals("U") || direction.equals("D")) {
                System.out.println("Direction is allowed");
            break;
        }else{
            System.out.println("Direction is not allowed. Enter a valid direction");
        }
      }     
        return direction;
    }
    // i edited line 158 to public
     public static void legalMove(String direction){
       Maze myMap = new Maze();
           while(true){
               userMove();
        if (direction.equals("R")) {
            if (myMap.canIMoveRight() == true) {
                myMap.MoveRight();
                break;
                    // myMap.printMap();
           }else{
                System.out.println("Sorry, you've hit a wall");  
                System.out.println("Pick a new direction");
               }
           }
        else if (direction.equals("L")) {
            if (myMap.canIMoveLeft() == true) {
                myMap.MoveLeft();
                break;
                        // myMap.printMap();
            }else{
                 System.out.println("Sorry, you've hit a wall"); 
                  System.out.println("Pick a new direction");
                }
            }
        else if (direction.equals("U")) {
             if (myMap.canIMoveUp() == true) {
                        myMap.MoveUp();
                        break;
                        //myMap.printMap();
                }else{
                     System.out.println("Sorry, you've hit a wall");  
                      System.out.println("Pick a new direction");
                    }
            }
               else if (direction.equals("D")) {
                    if (myMap.canIMoveDown() == true) {
                        myMap.MoveDown();
                        break;
                        //myMap.printMap();
                    }else{
                        System.out.println("Sorry, you've hit a wall");  
                         System.out.println("Pick a new direction");
                    }
               }
        }
     }
}
