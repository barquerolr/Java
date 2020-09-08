import java.util.Scanner;
public class Factorial// returns the factorial of a number
{
  public static void main(String[] args)//main program
  { 
  Scanner stuff = new Scanner(System.in);
  System.out.println("Which number factorial do you want?");
  int num = stuff.nextInt();
  int factorial = fact(num);//method or function call fact
  System.out.println("The factorial of "+num+ " is: "+ factorial);//display of completed factorial
  }//end of main
  
   public static int fact(int number)//method or function header or signature to find factorial
  {
     if(number<=1)//base
       return 1;
     
     //recursive step
     else               
       return number * fact(number-1);        
    
     
  }//end of method fact


}//end of program

