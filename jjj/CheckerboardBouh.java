import java.util.Scanner;
public class CheckerboardBouh
{
  public static void main(String args[])
  {
    Scanner mark = new Scanner(System.in);
    int row=0;
    System.out.println("Input number");
    row=mark.nextInt();
    for (int i = 1; i <= row; i++)
    {
      if (i % 2 == 0)       System.out.print("*  ");
      else                  System.out.print("  *");
    }
    System.out.println();
  }
}