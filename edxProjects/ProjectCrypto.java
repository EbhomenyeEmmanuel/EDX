package edxProjects;
import  java.util.Scanner;
public class ProjectCrypto {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Input your string to be encrypted :");
          String stringToBeEncrypted = input.nextLine();
          //" This is some \"really\" great. (Text)!?"
String normalizedText = normalizeText(stringToBeEncrypted);
          System.out.println("Normalized Text is " + normalizedText);
 
 String obifiedText = obify(normalizedText);
          System.out.println("ObifiedText is " + obifiedText);
          
 String cipherText = shiftAlphabet(obifiedText, 1);
          System.out.println("CipherText is " + cipherText);
          
          //The last else if statement in the infinite for loop was added to make the code work if the groupifyValue is > than cipherText
          String groupifyText = groupify(cipherText, 9);
          System.out.println("GroupifiedText is " + groupifyText);
  }
final static String COMPARE_WITH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

 public static String normalizeText(String text) { 
 String newTextInUpperCase = text.toUpperCase();
    char[] charArray = newTextInUpperCase.toCharArray();     
   String newText = "";  
 for (int i = 0; i<charArray.length; i++) {    
  if (COMPARE_WITH.contains(charArray[i] + "")) {       
newText = newText + charArray[i];
  } 
   }
   return newText.toUpperCase(); 
  }
  public static String obify( String normalizedText){
      String vowelString = "AEIOUY";
      String obifiedText = "";
      for (int i = 0; i < normalizedText.length(); i++) {
          if (vowelString.contains(normalizedText.charAt(i) + "")) {
              obifiedText = obifiedText + "OB" + normalizedText.charAt(i);
          }else{
              obifiedText += normalizedText.charAt(i);
          }
      }
      return obifiedText;
    }
  public static String shiftAlphabet(String plainText, int shift) {
      plainText = plainText.toUpperCase();
      char [] key = {
          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
      };    
        int start = 0;
        if (shift< 0) {
          start = (shift % 26 ) + 26;
      }else{
            start = (shift % 26);
        }
        
        String result = "";
        for (int i = 0; i < plainText.length(); i++) {
            int j = 0;
            /*The for loop below is to find the index of the first string .
            *After finding it , it would then be shifted by the value you inputted :)
            *Here when the inner/ nested loops stops, j has a new value ( it is no longer zero )
            *The new value of j is the value of the index in the string
            */
            //Find the index of the first character of the string
          char ch = plainText.charAt(i);
          int nElems = key.length;
            for ( ; j < nElems; j++) {
                //This if statement finds the position of the character in the array
                if (key[j] == ch) {
                    break;
                }
            }
            //This concatenates the shifted string because 
            //key[(start + j) %26] is the newest version of the inputted string 
            result +=  key[(start + j) %26];
      } 
        return result;
  }
  public static String groupify(String word, int groupifyValue)throws IllegalArgumentException {
      if (groupifyValue <= 0 ){
          throw new IllegalArgumentException("Groupify Value must be greater than Zero");
          
      }
      String GroupifiedText = "";
      StringBuilder sb = new StringBuilder();
      //Use this 'counter' variable to know when to put Spaces
      int counter = 1;
      if ((word.length() % groupifyValue ) == 0) {
          for (int i = 0; i < word.length(); i++) {
              if ((counter % groupifyValue) == 0) {
                  sb.append(word.charAt(i) + " ");                 
              }else{
                  sb.append(word.charAt(i));
              }
              ++counter;
          }
      }else{
          for (int i = 0; i < word.length(); i++) {
              if ((counter % groupifyValue) == 0) {
                  sb.append(word.charAt(i) + " ");                 
              }else{
                  sb.append(word.charAt(i));
              }
              ++counter;
           } 
          for ( ; ; ) {
              if ((word.length() % groupifyValue) == 0) {
                  break;
              }else if((word.length() % groupifyValue) !=0){
                  //append sb till it is ready to be grouped
                  //When it is ready this block of statement would fail giving room for the if statement
                  sb.append("x");
                  word += " ";
              }
              else if( word.length() < groupifyValue){
                  while(word.length() < groupifyValue){
                      sb.append("x");
                  }
              }
          }
              
          }
       GroupifiedText = sb.toString();
      return GroupifiedText;
  }
}
