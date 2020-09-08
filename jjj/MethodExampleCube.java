import java.util.Scanner;
public class MethodExampleCube // returns the cube of a number
{
  public static void main(String[] args)//main program
  {
    int num=input();//method of function call to get input
    int timesthree = triple(num);//method or function call to cube number
    System.out.print("The number "+num+" cubed is: ");
    output(timesthree);//method or function call to output result
  }//end of main
  
  public static int input()  //method or function header or signature to get input
  {
  System.out.println("Enter the number you want to cube:");
  Scanner stuff = new Scanner(System.in);
  int first = stuff.nextInt();
  return first;//return of integer
  }//end of input method

  public static int triple(int orignum)//method or function header or signature to cube number
  {
    int answer=orignum*orignum*orignum;
    return answer;//return of cube
  }//end of cubing method


  public static void output(int xthree)  //method or function header or signature to ouput result
  {
    System.out.println(xthree);
  }//end of output method
}//end of program
