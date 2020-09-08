import java.util.Scanner;
public class Med
{
  public static void main(String args[])
  {
    Scanner nuh = new Scanner(System.in);
    System.out.println("Place number of registration");
    double regist = 0.0;
    double total = 0.0;
    regist = nuh.nextDouble();
    while (regist > 0)
    {
      if (regist < 5)        System.out.println("yes");
      else                         System.out.println("No");
      System.out.println("Cost: "+total);
      regist = nuh.nextDouble();
      total= regist * 125;                                           
    }
  }
}