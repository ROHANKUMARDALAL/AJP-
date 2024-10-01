
import java.util.*;
public class ShowEvenOdd {
  

 


  public static void main(String[] args) {
    
    System.out.println("enter the the size of an array");
    Scanner sc =new Scanner(System.in);
    int sizeofarray= sc.nextInt();
    int Arr[] =new int[sizeofarray];
    int EvenNo=0,OddNo=0;
    for(int i =0;i<sizeofarray;i++)
    {
      Arr[i]=sc.nextInt();
      if(Arr[i]%2==0)
      {
       Arr[EvenNo]=Arr[i];
       EvenNo++;
      }
      else{
        Arr[OddNo]=Arr[i];
        OddNo++;
      }
    }
    System.out.println("the even No`s: " +EvenNo);
    for(int i=0;i<EvenNo;i++)
    {
System.out.println(Arr[i]);
    }
  
  }
}
 



