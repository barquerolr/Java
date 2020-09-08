import java.util.Scanner;
public class Checkerboard
{
  public static void main(String args[])
  {
    int row=0;
    Scanner mark = new Scanner(System.in);
    System.out.println("Input number");
    row=mark.nextInt();
    for (int i = 1; i <= row; i++)
    {
      for (int j = 1; j <= row; j++)
      {
        if (i % 2 == 0)
          System.out.print("*  ");
        else
          System.out.print("  *");
      }
      System.out.println();
    }
  }
}