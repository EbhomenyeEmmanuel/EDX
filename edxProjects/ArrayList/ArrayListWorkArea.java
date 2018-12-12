
package edxProjects.ArrayList;
import java.util.ArrayList;
public class ArrayListWorkArea {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("EMMA");
      str.add("NUEL ");
      str.add(" ");
      str.add("IS ");
      str.add("A ");
      str.add("BOY");
        System.out.println("Str contains " + str.size());
        System.out.println("The index of str is " + str.lastIndexOf("BOY"));
        System.out.println("Str contains " + str.remove(2) + str);
    }
}
