import java.util.Scanner;
public class PrintRecursion// prints statement user entered number of times
{
  public static void main(String[] args)//main program
  { 
   Scanner numtime = new Scanner(System.in);
   System.out.println("How many times do you want to print?");
   int num = numtime.nextInt();
   printnum( num);//method or function call printnum
  
  }//end of main
  
   public static void printnum(int n)//method or function header or signature to print statement
  {
     if(n>0)//base
     {
       System.out.println("This is a test!");
         printnum(n-1);   //reduction step
     }
         else
           return;//nothing is returned - base
   
}//end of method printnum
}//end of program

