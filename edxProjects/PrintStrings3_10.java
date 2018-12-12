
package edxProjects;

public class PrintStrings3_10 {
    public static void main(String[] args) {
        printStrings("abc",5);
    }
    public static void printStrings(String letter, int num){
        for (num = 1; num <= 5; num++) {
            System.out.print(letter);
           // System.out.print(num);
        }
    }
}
