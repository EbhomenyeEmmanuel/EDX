/*
 *Write a method that accepts a pair of two dimensional arrays of integers as parameters treats the arrays as 2D matrices and adds them , returning the result . 
*The sum of the matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij. 
*You may assume that the arrays passed as parameters have the same dimensions. 
*/
package edxProjects;
import java.util.ArrayList;
public class matrixAdd {
    public static void main(String[] args) {
        ArrayList<String> myList  = new ArrayList<String>();    
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
    int staticSize = myList.size();
        for (int i = 0; i < staticSize; i++) {
            String str = myList.get(i);
            if (str.equals("B")) {
                 myList.remove(str);
            }
           
          // --staticSize;
        }
        System.out.println(myList);
    }
}
