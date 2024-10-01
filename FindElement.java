
import java.util.*;
public class FindElement {
  public static void main(String[] args) {
    System.out.println("enter the the size of an array");
    Scanner sc =new Scanner(System.in);
    int sizeofarray= sc.nextInt();
    int Arr[] =new int[sizeofarray];
  
   
    for(int i =0;i<sizeofarray;i++)
    {
      Arr[i]=sc.nextInt();
  }
 
  System.out.println("enter the element to find in an array ");
  int element=sc.nextInt();
  for(int i =0;i<sizeofarray;i++)
  {
   if(element==Arr[i])
   {
    System.out.println("the element is present at :"+i +" element is  "+ element);
    break;
   }
}
  

    }
}
