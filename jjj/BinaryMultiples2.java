import java.util.Scanner;
public class BinaryMultiples2
{
  public static void main(String args[])
  {
    Scanner binary = new Scanner(System.in);
    int number = 0;
    System.out.println("Enter a number to check if it's a binary multiple");
    number = binary.nextInt();
    int number1=number;
    int check = checking(number, number1);
    if (check == 1)   System.out.println(number + " is Binary because "+check+ " says so");
    else if (check == 0)  System.out.println(number + " is not binary.");
  }
  
  public static int checking(int number, int number1)
  {
    number1 = 2;
    int chk = 0;
    
    if (number > 1)
      return number1 * 2;
      
      
    else
      return number1;
  }
}