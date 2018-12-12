/*
  Write a method that retuns whether a String is a vowel 
( a single letter string containing a, e, i, o or u case insensitively )
 */
package edxProjects;
import java.util.Scanner;
public class isVowel5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      Boolean z = Vowel("e");
        System.out.println(z);
    }
    public static Boolean Vowel(String vowel){
       vowel = vowel.toUpperCase();
        String [] vowelString = {
            "A", "E", "I", "O", "U" 
    };
        Boolean vowelValue;
        if (vowel.contains(vowelString[0]) ||
                vowel.contains(vowelString[1])||
                vowel.contains(vowelString[2])||
                vowel.contains(vowelString[3])|| 
                vowel.contains(vowelString[4])){
            vowelValue = true;
        } else {
            vowelValue = false;
        }
       
    return vowelValue;
    }
}
