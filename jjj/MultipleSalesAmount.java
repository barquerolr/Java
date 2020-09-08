import java.util.Scanner;
public class MultipleSalesAmount
{
  public static void main(String args[])
  {
    Scanner sales = new Scanner(System.in);
    double region1 = 0.0;
    double region2 = 0.0;
    double sale1 = 0.0;
    double sale2 = 0.0;
    double sale3 = 0.0;
    double sale4 = 0.0;
    double sale5 = 0.0;
    double sale6 = 0.0;
    double sale7 = 0.0;
    double sale8 = 0.0;
    double sale9 = 0.0;
    double sale10 = 0.0;
    double sales11 = 0.0;
    double sales12=0.0;
    double total=0.0;
    int sum=0;
    while (region1 >= 0)
    {
      System.out.println("Place the first sales amount for region 1");
      sale1 = sales.nextDouble();
      System.out.println("Sale is: "+sale1);
      System.out.println("Place the second sales amount for region 1");
      sale2 = sales.nextDouble();
      System.out.println("Sale is: "+sale2);
      System.out.println("Place the third sales amount for region 1");
      sale3 = sales.nextDouble();
      System.out.println("Sale is: "+sale3);
      System.out.println("Total sale is: "+total);
      total=sale1+sale2+sale3;
      System.out.println("Place the first sales amount for region 2");
      sale4 = sales.nextDouble();
      System.out.println("Sale is: "+sale4);
      System.out.println("Place the second sales amount for region 2");
      sale5 = sales.nextDouble();
      System.out.println("Sale is: "+sale5);
      System.out.println("Place the third sales amount for region 2");
      sale6 = sales.nextDouble();
      System.out.println("Sale is: "+sale6);
      System.out.println("Total sale is: "+total);
      total=sale1+sale2+sale3;
      }
  }
}