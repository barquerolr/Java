import java.util.Scanner;
public class ProductArrays27
{
  public static void main(String args[])
  {
    Scanner identify = new Scanner(System.in);
    int d = 0;
    System.out.println("Enter array number (between 0 and 5)");
    d = identify.nextInt();
    while (d >= 0)
    {
    Integer [] product = 
    {21, 32, 44, 57, 63, 78
    }; //This is the product ID number of the product.
    Double [] price = 
    {75.99, 67.81, 109.88, 567.89, 55.87, 1056.97
    }; //This is the price of the product.
    Integer [] quantity = 
    {5, 16, 72, 89, 10, 57
    }; //This is the quantity of the product.
    {
      if (d == 21)   System.out.println("The product ID is: "+d);
                  System.out.println("The price of the product is:$" +price[0]);
                  System.out.println("The quantity of the product is: "+quantity[0]);
    System.out.println("Enter another array number number (between 0 and 5)");
    d = identify.nextInt();
    }
    {
      if (d == 32)   System.out.println("The product ID is: "+d);
                     System.out.println("The price of the product is:$" +price[1]);
                     System.out.println("The quantity of the product is: "+quantity[1]);
    System.out.println("Enter another array number number (between 0 and 5)");
    d = identify.nextInt();
    }
    {
      if (d == 44)   System.out.println("The product ID is: "+d);
                  System.out.println("The price of the product is:$" +price[2]);
                  System.out.println("The quantity of the product is: "+quantity[2]);
    System.out.println("Enter another array number number (between 0 and 5)");
    d = identify.nextInt();
    }
    }
  }
}