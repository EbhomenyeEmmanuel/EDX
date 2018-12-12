package edxProjects;
public class Gcd {
  public static void main(String[] args) {
int z = gcd(210, 315);
System.out.print("The gcd is " + z);
 
  }
public static int gcd(int num, int denom){
 int a = num;
 int b = denom;

 while (a != 0 || b != 0){ 
   int rem = a % b;
   a = b;
   b = rem;
  if (a == 0){
     break;
   }else if(b == 0){
     break;
      }
    
    } 
    if (a == 0){
     return b;
   }else if(b == 0){
     return a;
      }else{
        return 0;
      }
 }

}