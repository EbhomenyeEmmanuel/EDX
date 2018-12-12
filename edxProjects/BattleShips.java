package edxProjects;
import java.util.Scanner;
import java.util.Random;
public class BattleShips {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to BattleShips Game***");
        System.out.println("Right now the ship is empty.");
        System.out.println("  0123456789");
        char [][] ocean = new char [10][10];
        for (int row = 0; row < ocean.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < ocean[row].length; col++) {
                //Since the ship is empty , the array is set to the min value of char
                if (ocean[row][col] == Character.MIN_VALUE) {
                    System.out.print(" ");
                }else{
                    System.out.print(ocean[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789");
        //The user should deploy five ships at once
        
         int xCoordinateForTheFirstShip = 0;
         int yCoordinateForTheFirstShip = 0;
          int xCoordinateForTheSecondShip = 0;
           int yCoordinateForTheSecondShip = 0;
            int xCoordinateForTheThirdShip = 0;
             int yCoordinateForTheThirdShip = 0;
             int xCoordinateForTheFourthShip = 0;
             int yCoordinateForTheFourthShip = 0;
             int xCoordinateForTheFifthShip = 0;
             int yCoordinateForTheFifthShip = 0;
             
        //Prompt the user to enter coordinates five times since Five ships are needed 
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter X coordinate for your " + i + ". ship:");
        int x = input.nextInt();
        System.out.print("Enter Y coordinate for your " + i + ". ship:");
        int y = input.nextInt();
             //Check if input is not more than 9
         while (true){
                if ( x > 9 ) {
                    System.out.print("The coordinate of X cannot be greater than 9!!!");
                    System.out.println("Re-enter X coordinate");                    
                    x = input.nextInt();
                }else if (y > 9) {
                    System.out.print("The coordinate of Y cannot be greater than 9!!!");
                    System.out.println("Re-enter Y coordinate");
                    y = input.nextInt();
                }else if( x < 0){
                        System.out.println("The coordinate of X cannot be less than 9!!!");
                         x = input.nextInt();
                }else if ( y < 0){
                    System.out.println("The coordinate of Y cannot be less than 9!!!");
                     y = input.nextInt();
                }
                 else {
                    break;
                }
            }
           //Storing the input of the user as coordinates for different ships as each loop runs
            if (i == 1) {
                  xCoordinateForTheFirstShip = x;
                 yCoordinateForTheFirstShip = y;
            }else if(i == 2){
                //Make sure ship 1 and 2 dont have the same coordinates 
                    while(true){     
                  xCoordinateForTheSecondShip = x;
                  yCoordinateForTheSecondShip = y;                  
                     if ((xCoordinateForTheSecondShip == xCoordinateForTheFirstShip) && (yCoordinateForTheSecondShip == yCoordinateForTheFirstShip)) {
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheSecondShip != xCoordinateForTheFirstShip) && 
                                (yCoordinateForTheSecondShip != yCoordinateForTheFirstShip)){
                            break;
                        }
                    }
            }else if(i ==3){
                //Making sure ships 1, 2, 3 dont have the same coordinates
               while(true){
                     xCoordinateForTheThirdShip = x;
                     yCoordinateForTheThirdShip = y;
                     if ((xCoordinateForTheThirdShip == xCoordinateForTheSecondShip) &&
                             (yCoordinateForTheThirdShip == yCoordinateForTheSecondShip)) {
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheThirdShip == xCoordinateForTheFirstShip) &&
                                (yCoordinateForTheThirdShip == yCoordinateForTheFirstShip)){
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else {
                            break;
                        }
                    }
           }else if(i==4){
               //Making sure ships 1, 2, 3, 4 dont have the same coordinates
                 while(true){
                      xCoordinateForTheFourthShip = x;
                      yCoordinateForTheFourthShip = y;
                     if ((xCoordinateForTheFourthShip == xCoordinateForTheThirdShip) &&
                             (yCoordinateForTheFourthShip == yCoordinateForTheThirdShip)) {
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheFourthShip == xCoordinateForTheSecondShip) &&
                                (yCoordinateForTheFourthShip == yCoordinateForTheSecondShip)){
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheFourthShip == xCoordinateForTheFirstShip) && 
                                (yCoordinateForTheFourthShip == yCoordinateForTheFirstShip)){
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else{
                            break;
                        }
                    }
           }else if( i == 5){
               //Making sure ships 1, 2 , 3, 4, 5 dont have the same coordinates
               while(true){
                       xCoordinateForTheFifthShip = x;
                       yCoordinateForTheFifthShip = y;
                     if ((xCoordinateForTheFifthShip == xCoordinateForTheFourthShip) &&
                             (yCoordinateForTheFifthShip == yCoordinateForTheFourthShip)) {
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheFifthShip == xCoordinateForTheThirdShip) &&
                                (yCoordinateForTheFifthShip == yCoordinateForTheThirdShip)){
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheFifthShip == xCoordinateForTheSecondShip) &&
                                (yCoordinateForTheFifthShip == yCoordinateForTheSecondShip)){
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else if((xCoordinateForTheFifthShip == xCoordinateForTheFirstShip) && 
                                (yCoordinateForTheFifthShip == yCoordinateForTheFirstShip)){
                            System.out.println("Two ships cannot have the same coordinates");
                            System.out.print("Enter X coordinate for your " + i + ". ship:");
                             x = input.nextInt();
                            System.out.print("Enter Y coordinate for your " + i + ". ship:");
                             y = input.nextInt();
                        }else{
                            break;
                        }
                    }
           }
           //Assign the char to the allowed coordinates 
              ocean[x][y] = '@'; 
        }
        
        //DEPLOY COMPUTER SHIP
        System.out.println("Computer is deploying ships");
         int xCoordinateForTheComFirstShip = 0;
         int yCoordinateForTheComFirstShip = 0;
          int xCoordinateForTheComSecondShip = 0;
           int yCoordinateForTheComSecondShip = 0;
            int xCoordinateForTheComThirdShip = 0;
             int yCoordinateForTheComThirdShip = 0;
             int xCoordinateForTheComFourthShip = 0;
             int yCoordinateForTheComFourthShip = 0;
             int xCoordinateForTheComFifthShip = 0;
             int yCoordinateForTheComFifthShip = 0;
            
        for (int i = 1; i <= 5; i++) {
            System.out.println( i + ". ship DEPLOYED");
        int x = rand.nextInt(10) ;
        int y = rand.nextInt(10);
   
           //Storing random nums as coordinates for Computer different ships
            if (i == 1) {
                  xCoordinateForTheComFirstShip = x;
                 yCoordinateForTheComFirstShip = y;
                 /*Make sure the coordinates of the X and Y of the player and comp or different comp ships are not the same . 
                 *If they are the same, randomize the comp ships again 
                         */
                 if ( (xCoordinateForTheComFirstShip == xCoordinateForTheFirstShip) && 
                         (yCoordinateForTheComFirstShip == yCoordinateForTheFirstShip)){
                      x = rand.nextInt(10);
                      y = rand.nextInt(10);
                 }
            }else if(i == 2){
                 /*Make sure the coordinates of the X and Y of the player and comp or different comp ships are not the same . 
                 *If they are randomize the comp ships again 
                         */
                    while(true){     
                  xCoordinateForTheComSecondShip = x;
                  yCoordinateForTheComSecondShip = y;  
                  //Make sure the coordinates of the x
                     if ((xCoordinateForTheComSecondShip == xCoordinateForTheComFirstShip)     &&
                             (yCoordinateForTheComSecondShip == yCoordinateForTheComFirstShip) || 
                             ((xCoordinateForTheComSecondShip == xCoordinateForTheFirstShip)   &&
                             (yCoordinateForTheComSecondShip == yCoordinateForTheFirstShip)) 
                             ) {
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else //if((xCoordinateForTheComSecondShip != xCoordinateForTheComFirstShip) && (yCoordinateForTheComSecondShip != yCoordinateForTheComFirstShip)){
                            break;
                       // }
                    }
                //The coordinates disappeaes after  this if statement executes
                //The coordinates of the different ships are not stored after i++
            }else if(i ==3){
                /*Make sure the coordinates of the X and Y of the player and comp or different comp ships are not the same . 
                 *If they are randomize the comp ships again 
                         */
               while(true){
                     xCoordinateForTheComThirdShip = x;
                     yCoordinateForTheComThirdShip = y;
                     if ((xCoordinateForTheComThirdShip == xCoordinateForTheComSecondShip) &&
                             (yCoordinateForTheComThirdShip == yCoordinateForTheComSecondShip) || 
                             ((xCoordinateForTheComThirdShip == xCoordinateForTheSecondShip) &&
                             (yCoordinateForTheComThirdShip == yCoordinateForTheSecondShip))
                             ) {
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else if((xCoordinateForTheComThirdShip == xCoordinateForTheComFirstShip) && 
                                (yCoordinateForTheComThirdShip == yCoordinateForTheComFirstShip)  ||
                                ((xCoordinateForTheComThirdShip == xCoordinateForTheComFirstShip) && 
                                (yCoordinateForTheComThirdShip == yCoordinateForTheComFirstShip))
                                ){
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else //if((xCoordinateForTheComThirdShip != xCoordinateForTheComSecondShip) && (yCoordinateForTheComThirdShip != yCoordinateForTheComSecondShip)){
                            break;
                       // }
                    }
           }else if(i==4){
                /*Make sure the coordinates of the X and Y of the player and comp or different comp ships are not the same . 
                 *If they are randomize the comp ships again 
                         */
                 while(true){
                      xCoordinateForTheComFourthShip = x;
                      yCoordinateForTheComFourthShip = y;
                     if ((xCoordinateForTheComFourthShip == xCoordinateForTheComThirdShip) &&
                             (yCoordinateForTheComFourthShip == yCoordinateForTheComThirdShip)||
                             ((xCoordinateForTheComFourthShip == xCoordinateForTheThirdShip) &&
                             (yCoordinateForTheComFourthShip == yCoordinateForTheThirdShip))
                             ) {
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else if((xCoordinateForTheComFourthShip == xCoordinateForTheComSecondShip) &&
                                (yCoordinateForTheComFourthShip == yCoordinateForTheComSecondShip) ||
                                ((xCoordinateForTheComFourthShip == xCoordinateForTheSecondShip) &&
                                (yCoordinateForTheComFourthShip == yCoordinateForTheSecondShip))
                                ){
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else if((xCoordinateForTheComFourthShip == xCoordinateForTheComFirstShip) && 
                                (yCoordinateForTheComFourthShip == yCoordinateForTheComFirstShip) || 
                                ((xCoordinateForTheComFourthShip == xCoordinateForTheFirstShip) && 
                                (yCoordinateForTheComFourthShip == yCoordinateForTheFirstShip))
                                ){
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else{
                            break;
                        }
                    }
           }else if( i == 5){
                /*Make sure the coordinates of the X and Y of the player and comp or different comp ships are not the same . 
                 *If they are randomize the comp ships again 
                         */
                  while(true){
                       xCoordinateForTheComFifthShip = x;
                       yCoordinateForTheComFifthShip = y;
                     if ((xCoordinateForTheComFifthShip == xCoordinateForTheComFourthShip) &&
                             (yCoordinateForTheComFifthShip == yCoordinateForTheComFourthShip) || 
                             ((xCoordinateForTheComFifthShip == xCoordinateForTheFourthShip) &&
                             (yCoordinateForTheComFifthShip == yCoordinateForTheFourthShip))
                             ) {
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else if((xCoordinateForTheComFifthShip == xCoordinateForTheComThirdShip) &&
                                (yCoordinateForTheComFifthShip == yCoordinateForTheComThirdShip)||
                                ((xCoordinateForTheComFifthShip == xCoordinateForTheThirdShip) &&
                                (yCoordinateForTheComFifthShip == yCoordinateForTheThirdShip))
                                ){
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else if((xCoordinateForTheComFifthShip == xCoordinateForTheComSecondShip) &&
                                (yCoordinateForTheComFifthShip == yCoordinateForTheComSecondShip) ||
                                ((xCoordinateForTheComFifthShip == xCoordinateForTheSecondShip) &&
                                (yCoordinateForTheComFifthShip == yCoordinateForTheSecondShip))
                                ){
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else if((xCoordinateForTheComFifthShip == xCoordinateForTheComFirstShip) &&
                                (yCoordinateForTheComFifthShip == yCoordinateForTheComFirstShip) ||
                                ((xCoordinateForTheComFifthShip == xCoordinateForTheFirstShip) &&
                                (yCoordinateForTheComFifthShip == yCoordinateForTheFirstShip))
                                ){
                             x = rand.nextInt(10);
                             y = rand.nextInt(10);
                        }else{
                            break;
                        }
                    }
           }
           
              ocean[x][y] = 'x'; 
        }
        
        //Show the map
         System.out.println("  0123456789");
        for (int row = 0; row < ocean.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < ocean[row].length; col++) {
                if (ocean[row][col] == Character.MIN_VALUE) {
                    System.out.print(" ");
                }else{
                    System.out.print(ocean[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789");
        
        System.out.println("YOUR TURN TO SINK SHIPS :)");
         int noOfPlayerShip = 5;
       int noOfComputerShip = 5;
       //The while loop should stop if one the ships is Zero
       while( noOfPlayerShip!= 0 && noOfComputerShip != 0 ) {
            int playerTurnForX;
            int playerTurnForY;
   
        while(true){
            System.out.print("Enter computer's X coordinates: ");
            playerTurnForX = input.nextInt();
            System.out.print("Enter computer's Y coordinates: ");
            playerTurnForY = input.nextInt();
            if(playerTurnForX > 10 || playerTurnForY > 10){
                 System.out.println("Coordinates cannot be greater than 10");
            }else if(playerTurnForX < 0 || playerTurnForY < 0){
                System.out.println("Coordinates cannot be less than 0");
             }else if ( playerTurnForX <= 9 || playerTurnForY <= 9 ){
                break;
                 }
               }
        //Begin the sinking of them ships :)
            if (ocean[playerTurnForX][playerTurnForY] == 'x') {
                System.out.println("Boom! You have sunk the computer's ship");
                ocean[playerTurnForX][playerTurnForY] = '@';
                 ++noOfPlayerShip ;
                 --noOfComputerShip;
            }else if (ocean[playerTurnForX][playerTurnForY] == '@') {
                 System.out.println("Oh no, You have sunk your ship :(");
                 ocean[playerTurnForX][playerTurnForY] = 'x';
                 --noOfPlayerShip;
                 ++noOfComputerShip;
            }else {
                 System.out.println("Sorry, you missed");
            }   
            //Computer turn to guess user coordinates
            System.out.println("COMPUTER'S TURN");
            int comTurnForX = rand.nextInt(10);
            int comTurnForY = rand.nextInt(10);
                System.out.println("Computer chose "  + comTurnForX + " for X");
                System.out.println("Computer chose "  + comTurnForY + " for Y");
           if (ocean[comTurnForX][comTurnForY] == '@') {
                System.out.println("The computer has sunk one of your ships");
                ocean[comTurnForX][comTurnForY] = 'x';
                ++noOfComputerShip;
                --noOfPlayerShip;
            }else if (ocean[comTurnForX][comTurnForY] == 'x') {
                 System.out.println("The computer has sunk one of its ships");
                 ocean[playerTurnForX][playerTurnForY] = '@';
                 --noOfComputerShip;
                 ++noOfPlayerShip;
            }else {
                 System.out.println("Computer missed");
            }   
           System.out.println("The num of computer ships is " +  noOfPlayerShip  );
            System.out.println("The num of computer ships is " + noOfComputerShip );         
          }
       //Show the winner          
       System.out.println("Your ships: " + noOfPlayerShip + "| Computer ships: " + noOfComputerShip);
                if (noOfPlayerShip > noOfComputerShip) {
                    System.out.println("Hooray! You win the battle :)");
                }else{
                    System.out.println("You lost :( ");
                }
           
       //Show map of final battle
            System.out.println("  0123456789");
        for (int row = 0; row < ocean.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < ocean[row].length; col++) {
                if (ocean[row][col] == Character.MIN_VALUE) {
                    System.out.print(" ");
                }else{
                    System.out.print(ocean[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789");
        
    }
}
