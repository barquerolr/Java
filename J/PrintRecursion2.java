import java.util.Scanner;
public class PrintRecursion2// prints statement user entered number of times
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
     if(n<1)//base
     
       return;//nothing is returned - base
            
      else
         {
           System.out.println("This is another test!");
         printnum(n-1);   //reduction step
         }
}//end of method printnum
}//end of program

