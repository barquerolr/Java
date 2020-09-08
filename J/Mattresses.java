// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Show the total number of mattresses at the of the month
 */
import java.util.Scanner;
public class Mattresses
{
  public static void main(String[] args)
  {
    Scanner Mat = new Scanner(System.in);
    double first=0.0; // This is the number of mattresses in stock at the beginning of the month.
    double second=0.0; // This is the number of mattresses purchased by the store in the beginning of the month.
    double third=0.0; // This is number of mattresses sold during the month. 
    double answer=0.0; // This is the total of the mattresses, or mattresses in stock minus number sold plus number purchased.
    System.out.println("Place the number of mattresses in stock at the beginning of the month");
    first = Mat.nextDouble();
    System.out.println("Place the number of mattresses purchased by the store");
    second = Mat.nextDouble();
    System.out.println("Place the number of mattresses sold during the month");
    third = Mat.nextDouble();
    answer=first-third+second;
    System.out.println("Here is the total number of mattresses at the end of the month: "+answer);
  }
}