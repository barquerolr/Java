// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Complete the exponentiation process using recursion.
 */
import java.util.Scanner;
public class BaseExponent
{
  public static void main(String args[])
  {
    Scanner exponential = new Scanner(System.in);
    int base = 0;
    System.out.println("Enter the base number.");
    base = exponential.nextInt();
    int exponent = 0;
    System.out.println("Enter the exponent");
    exponent = exponential.nextInt();
    int xp = powermath(base, exponent);
    System.out.println("The number after exponentiation is: "+xp);
  }
  
  public static int powermath(int base, int exponent)
  {
   if (exponent == 0)
      return 1;
    
    if (exponent == 1)
      return base;
    
    else
      return base * powermath(base, exponent-1); //This will recursively multiply the base by the exponent.
    
    
    
  }
}