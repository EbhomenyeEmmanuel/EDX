
package edxProjects;
import java.util.Random;
public class workArea {
    
    public static void main (String args []){
        Random random = new Random();
      
        int a = 0;
        while (a == 0){
            
         int x = random.nextInt(101);
        char y = (char)x;
        System.out.println("Number is " + x);
        System.out.println("Character is " + y);
        if (x ==100){
            break;
        }
    }
    }
            
}