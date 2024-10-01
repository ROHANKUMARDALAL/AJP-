
import java.util.*;
public class SumofArr {
  public static void main(String[] args) {
    
    System.out.println("enter the the size of an array");
    Scanner sc =new Scanner(System.in);
    int sizeofarray= sc.nextInt();
    int Arr[] =new int[sizeofarray];
    int sum=0;
    for(int i =0;i<sizeofarray;i++)
    {
      Arr[i]=sc.nextInt();
      sum=sum+Arr[i];
    }
    
    System.out.println("the sum of an elements of an given array : "+ sum);
  }
}
