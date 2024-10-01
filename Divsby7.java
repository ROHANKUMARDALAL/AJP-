import java.util.*;
public class Divsby7 {
  public static void main(String[] args) {
      int number;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter any number : ");
      number =sc.nextInt();
      if(number%7==0)
      {
        System.out.println(number + " is divisible by 7");
      }
  }
}
