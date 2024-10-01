import java.util.*;

class OddEven{
  public static void main(String[] args) {
      int number;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the last number");
      number=sc.nextInt();
      System.out.println("the even number between 1 to " +number);
       for(int i=1;i<=number;i++)
       {
        if(i%2==0){
          System.out.print(i);
        }
       }
 System.out.println("the odd number between 1 to " +number);
       for(int i=1;i<=number;i++)
       {
        if(i%2!=0){
          System.out.print(i);
        }
       }
      
  }
}