// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Calculate the gross pay using multiple methos.
 */
import java.util.Scanner;
public class BinaryMultiples34
{
  public static void main(String args[])
  {
    Scanner binary = new Scanner(System.in);
    int number = 0;
    System.out.println("Enter a number to check if it's a binary multiple");
    number = binary.nextInt();
    int number1=number;
    int check = checking(number, number1);
    if (check == 1)  System.out.println(number + " is Binary because "+number1+ " says so");
    if (check == 0)  System.out.println(number + " is not binary.");
  }
  
  public static int checking(int number, int number1)
  {
    number1 = 2;
    int chk = 0;
    if (number1 == number)
      return number1 * checking(number, number1 - 1);
   
    else
    return 0;
  }
}