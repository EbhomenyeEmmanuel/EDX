package edxProjects;
public class NestedNumbersExercise2_12 {
     public static void main (String args []){
        for (int i = 1; i <= 7; i++){
            for(int j = 0 ; j<i ;j++){
            //When i is 1 , this prints   "  i " when j = 0
            //When i is 2, this prints    " i i " when j = 0,1
           // When i is 3, this prints   "i i i " when j = 0,1,2
                System.out.print(i);
            }
            System.out.println();     
        }      
    }
}
