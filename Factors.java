import java.util.*;

public class Factors {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
  System.out.println("enter any number");
  int number = sc.nextInt();
  
  for (int i = 1; i <= number; i++) {
    if (number % i == 0) {
        System.out.print(" "+ i);
    }
}
  }
  

}
