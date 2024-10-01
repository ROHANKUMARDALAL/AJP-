
import java.util.Scanner;

public class SeparateEvenArray {
  public static void main(String[] args) {
    int Arr[]= new int [10];
    Scanner sc =new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      Arr[i]=sc.nextInt();
    }
  int EvenArr[]= new int [10];
  int n=0;
  for(int i =0;i<10;i++)
{
  if(Arr[i]%2==0)
  {
    EvenArr[n]=Arr[i];
    
    System.out.print(" "+EvenArr[n]);
    n++;
  }
}
  }
}
