import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=square_of_num(n);
      System.out.println(x);
	} 
  public static int square_of_num(int n)
  {
    int square=n*n;
    return square;
  }
}