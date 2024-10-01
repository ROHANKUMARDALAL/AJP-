import java.util.*;
 class SumNatural{
  public static void main(String[] args) {
      int number;
      Scanner sc =new Scanner(System.in);
      number=sc.nextInt();
      int sum=0;
      if(number>0)
      {
      for(int i =0; i<=number;i++)
      {
        sum=sum+number;
      }
      System.out.println("the sum is: "+sum);
      }
  }
 }