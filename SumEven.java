class SumEeven{
  public static void main(String[] args) {
    int sum=0,i=1;

    while(i<=20)
    {
      if(i%2==0)
      {
        sum=sum+i;
      }
      i++;
    }
    System.out.println("the sum of first 20 even numbers " +sum);
  }

}