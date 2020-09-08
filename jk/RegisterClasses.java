//Programmed by: Luis Barquero
/* Purpose of this program is to:
 * Show the class fees a company owes.
 */
import java.util.Scanner;
public class RegisterClasses
{
  public static void main(String[] args)
  {
    Scanner classes = new Scanner(System.in);
    double person=0.0; // This is the number of company employees attending classes.
    double fee=0.0; // The fee is $65 per person attending fees.
    System.out.println("Type number of company members attending the class");
    person=classes.nextInt();
    fee=person*65; // This will multiply the rate or fee($65) times the number of people attending to give the total cost.
    if (person >= 1 && person <= 25) System.out.println("Total company fee is: "+fee); // This sets the maximum to 25 and minumum to 1 persons.
    else                             System.out.println("Invalid number of persons"); // If less then 1 person or more than 25, it's invalid.
  }
}
      