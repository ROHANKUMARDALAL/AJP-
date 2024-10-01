
import java.util.*;
public class CountEnevnOdd {
 


  public static void main(String[] args) {
    
    System.out.println("enter the the size of an array");
    Scanner sc =new Scanner(System.in);
    int sizeofarray= sc.nextInt();
    int Arr[] =new int[sizeofarray];
    int EvenCount=0,OddCount=0;
    for(int i =0;i<sizeofarray;i++)
    {
      Arr[i]=sc.nextInt();
      if(Arr[i]%2==0)
      {
        EvenCount++;
      }
      else{
        OddCount++;
      }

    }
    System.out.println("the count of even elements in the array are: "+EvenCount);
    
    System.out.println("the count of odd elements in the array are: "+OddCount);
  }
}
 

