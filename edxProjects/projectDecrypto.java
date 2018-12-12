
package edxProjects;

public class projectDecrypto {
    public static void main(String[] args) {
        ungroupify();
        uncipher();
        unobify();
    }
    final static String COMPARE_WITH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void ungroupify(){
        
         String GroupifiedText = "PCFNNPCBO PCVPCFMxx";
      StringBuilder sb = new StringBuilder();
   char[] charArray = GroupifiedText.toCharArray();     
   String unGroupifiedWord = "";  
 for (int i = 0; i<charArray.length; i++) {    
  if (COMPARE_WITH.contains(charArray[i] + "")) {       
unGroupifiedWord = unGroupifiedWord + charArray[i];
    } 
   }
        System.out.println("Ungroupify text is " + unGroupifiedWord);
 
    }
    
     public static void uncipher(){
       int shift = 1;
       String plainText = "PCFNNPCBOPCVPCFM";
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
            result +=  key[(j - start) %26];
      } 
         System.out.println("Unciphered Text is " + result); 
}
     
     public static void unobify(){
         String obifiedText = "OBEMMOBANOBUOBEL";
       final String OBIFY = "OB";
       String [] vowelArray = {
           "A", "E", "I", "O", "U", "Y"
       };
         for (int i = 0; i < vowelArray.length; i++) {
             if (obifiedText.contains("OB" + vowelArray[i])) {
                 obifiedText = obifiedText.replace( ("OB" + vowelArray[i]), vowelArray[i]);
             }
         }
         System.out.println("Unobified Text is " + obifiedText);
}         
     
     
     
     
     
     
     public static void unnormalize(){
        
    }
}
