//Programmed by: Luis Barquero
/* Purpose of this program is to:
 * Show the days of a certain month using arrays.
 */
import java.util.Scanner;
public class MonthArray
{
  public static void main(String args[])
  {
    Scanner year = new Scanner(System.in);
    int m = 0;
    System.out.println("Enter number");
    m = year.nextInt();
    String[] months = 
    {"", "January", "February", "March", "April", "May", "June", "July", 
        "August", "September", "October", "November", "December"
    };
      while (m <= 8)
      {
      if (m == 2)          System.out.println("The month of February has 28 days");
      else if (m == 8)     System.out.println("The month of August has 31 days");
      else if (m % 2 == 0)      System.out.println("The month of "+months[m] + " has 30 days");
      else if (m % 2 != 2)      System.out.println("The month of "+months[m] + " has 31 days");
      System.out.println("New Entry or -1 to exit loop");
      m = year.nextInt();
    }
    {
    while (m <= 12)
    {
      if (m % 2 == 0)     System.out.println("The month of "+months[m] + " has 31 days");
      else if (m % 2 != 0)      System.out.println("The month of "+months[m] + " has 30 days");
      System.out.println("New Entry or -1 to exit loop");
      m = year.nextInt();
    }
    System.out.println(months[m]);
    }
  }
}