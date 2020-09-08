// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Multiply a number by the same number plus 1, or a*(a+1).
 */
import java.util.Scanner;
public class Numbers
{
  public static void main(String[] args)
  {
    Scanner math = new Scanner(System.in);
    double first=0.0;
    double answer=0.0;
    System.out.println("Place first entry from scanner");
    first=math.nextDouble();
    answer=first*(first+1);
    System.out.println("Here is the multiplication of the entry number*number+1: "+answer);
  }
}
                       

   