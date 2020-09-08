import java.util.Scanner;
public class DivisorPattern
{
  public static void main(String[] args)
  { // Print a square that visualizes divisors.
    Scanner number = new Scanner(System.in);
    int no=0;
    System.out.println(" Place Number");
    no=number.nextInt();
    for (int i = 1; i <= no; i++)
    { // Print the ith line.
      for (int j = 1; j <= no; j++)
      { // Print the jth entry in the ith line.
        if (i % 2 == 0)
          System.out.print("*  ");
        else
          System.out.print("  *");
      }
      System.out.println();
    }
  }
}
         
    
    