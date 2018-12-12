
package edxProjects;

public class parameterMysteryWho3_7 {
    public static void main(String[] args) {
         String whom = "her";
         String who = "him";
         String it = "who";
         String he = "it";
         String she = "whom";
          
         sentence(he, she , it);
       //  he she it
    }
 
    public static void sentence(String she,String who, String whom){
        System.out.println(who + " and " + whom + " like " + she);
    }
      //he ==she = whom
    //she ==who = him
    //it == whom = her
}
