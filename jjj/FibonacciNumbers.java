import java.util.Scanner;
// display the Fibonacci Numbers - begins with 0 and 1 and and has the property that each
//subsequent Fibonacci number is the sum of the previous two Fibonacci Numbers - Spirals in Nature
//0 and 1,1,2,3,5,8,13,21,34,55,etc.

public class FibonacciNumbers
{
  public static void main(String[] args)//main program
  { 
   Scanner numtime = new Scanner(System.in);
   System.out.println("From the beginning, which Fibonacci value to you want?");
   int num = numtime.nextInt();//input from user
   int fibreturn = fibonacci( num);//method or function call fibonacci
    System.out.println("The Fibonacci value is:  "+fibreturn);
  }//end of main
  
   public static int fibonacci(int n)//method or function header or signature to calculate the fibonacci value
  {
     if(n==0||n==1)//base - remember the first fibonacci are 0 plus 1, the second is also 0 plus 1
         return n;
      else
         return fibonacci(n-1)+fibonacci(n-2);   
   
}//end of method fibonacci

}//end of program

