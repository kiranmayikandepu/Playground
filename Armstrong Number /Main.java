import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner s = new Scanner(System.in);
          int n = s.nextInt();
           int temp=n;
            int sum=0,a=0;
	  
    
      while(n>0)
     {
      a=n%10;
      sum=sum+a*a*a;
      n=n/10;
     }
      if(temp==sum)
        System.out.print("Armstrong Number");
      else
          System.out.print("Not a Armstrong Number");
	}
}