import java.util.Scanner;
public class COuntNo {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int rem, sum=0;
    System.out.println("enter any number");
    int number= sc.nextInt();
    
    while(number!=0){
      rem=number%10;
      number=number/10;
      sum=rem+sum;
    }
    System.out.println("the digits sum of the given number is "+sum);
  }
}
