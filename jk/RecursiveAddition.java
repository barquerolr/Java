// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Recurvisely add all the numbers leading from 1 to the number.
 */
import java.util.Scanner;
public class RecursiveAddition
{
  public static void main(String args[])
  {
    Scanner addition = new Scanner(System.in);
    int number = 0;
    System.out.println("Enter the recursive number");
    number = addition.nextInt();
    int adding = add(number);
    System.out.println("The recursion for " + number + " is: "+adding);
  }
  
  public static int add(int number)
  {
    
    if(number == 1)
       return 1;
     
    
     else   
    
       return number + add(number-1); //This will add all the numbers starting from the input to 1.
    
  }
}
    