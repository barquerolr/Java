//Programmed by: Luis Barquero
/* Purpose of this program is to:
 * Use parallel arrays to give the remaining data based on the product ID.
 */
import java.util.Scanner;
public class ProductArrays
{
  public static void main(String args[])
  {
    Scanner identify = new Scanner(System.in);
    int d = 0;
    System.out.println("Enter product ID");
    d = identify.nextInt();
    while (d != -1)
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
    System.out.println(d);
    if (d == 21)   System.out.println("The product ID is "+d + ", the price is $"+price[0] + ", and the quantity is "+quantity[0]);
    else if (d == 32) System.out.println("The product ID is "+d + ", the price is $"+price[1] + ", and the quantity is "+quantity[1]);
    else if (d == 44) System.out.println("The product ID is "+d + ", the price is $"+price[2] + ", and the quantity is "+quantity[2]);
    else if (d == 57) System.out.println("The product ID is "+d + ", the price is $"+price[3] + ", and the quantity is "+quantity[3]);
    else if (d == 63) System.out.println("The product ID is "+d + ", the price is $"+price[4] + ", and the quantity is "+quantity[4]);
    else if (d == 78) System.out.println("The product ID is "+d + ", the price is $"+price[5] + ", and the quantity is "+quantity[5]);
    else              System.out.println("Invalid Entry");
    System.out.println("New Entry, or -1 to exit.");
    d = identify.nextInt();
    }
  }
}