import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=sum_of_num(n);
      System.out.println(x);
      
	}
  public static int sum_of_num(int n)
  {
    int sum=0;
    for(int i=0;i<=n;i++)
    { 
      sum=sum+i;
    }
    return sum;
    
  }
  
}