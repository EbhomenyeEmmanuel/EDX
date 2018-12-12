package edxProjects;

public class CaeserCypher {
    public static void main(String[] args) {
        String z = cipher("BC", 1);
        System.out.println("The encrypted key is " + z);
    }
    public static String cipher(String plainText, int shift){
        String cipherText = "";
      int start = 0;
        if (shift< 0) {
          start = (shift % 26 ) + 26;
      }else{
            start = (shift % 26);
        }
        for(int x = 0; x < plainText.length(); x++){
            char ch = plainText.charAt(x);
            int chToInt = (int)ch;
            shift = shift + chToInt;
            char charCipherText = (char)shift;
            cipherText += charCipherText;
        }
    
        return cipherText;
                
    }
}
