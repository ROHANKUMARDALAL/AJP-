import java.util.*;

public class Average {

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int sub1, sub2, sub3;
    System.out.println("enter the marks of Python subject : ");
    sub1=sc.nextInt();
    System.out.println("enter the marks of DSA subject : ");
    sub2=sc.nextInt();
    System.out.println("enter the marks of Java subject : ");
    sub3=sc.nextInt();
     int average = (sub1+sub2+sub3)/3;

     if(average>90){
      System.err.println("A grade");
     }
     else if(average>70 && average<70)
     {
      System.out.println("B grade");
     }

     else if(average>70 && average<90)
     {
       System.out.println("B grade");
     }
     else if(average>50 && average<70)
     {
        System.out.println("c grade");
     }

     else if(average>40 && average<50)
     {
        System.out.println("D grade");
     }
     else if(average<40)
     {
        System.out.println("Fail ");
     }
  }
}
