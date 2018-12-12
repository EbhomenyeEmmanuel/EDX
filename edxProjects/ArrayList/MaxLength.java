
package edxProjects.ArrayList;

import java.util.ArrayList;

public class MaxLength {
    public static void main(String[] args) {
         maxLength();
    }
    public static void maxLength() {
        ArrayList<String> str = new ArrayList<String>();
         str.add("A");
          str.add("AB");
           str.add("ABC");
            str.add("ABCD");
             str.add("ABCDE");
             str.add("ABCDE");
        int lengthOfLongestString = 0;
        for (int i = 1; i < str.size(); i++) {
            if (str.get(lengthOfLongestString).length() < str.get(i).length()) {
                lengthOfLongestString = i;
            }
        }
        System.out.println("The longest stirng in the list is " + str.get(lengthOfLongestString));
       // return lengthOfLongestString;
    }
}
