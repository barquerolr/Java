// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Create a customer discount program using arrays.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class CustomerDiscount
{
  public static void main(String []args)
  {
    Scanner customers = new Scanner(System.in);
    String [] name = new String[6];
    double [] discount = new double[6];
    DecimalFormat twodecimalplaces = new DecimalFormat("0.00");
    double price = 0.0;
    DecimalFormat threedecimalplaces = new DecimalFormat("0.00");
    double total = 0;
    for (int i = 0; i < 6; i=i+1)
    {
      System.out.println("Enter customer discount");
      discount[i] = customers.nextDouble();
      System.out.print("Enter the customer name");
      name[i] = (String)customers.next();
    }
    
      System.out.print("Enter the product price");
      price = customers.nextDouble();
      for(int i=0;i<6;i++) 
      {  
        if (i > 0)        System.out.println("Customer");
        if (i > 0)        System.out.println("Discount");
        if (i > 0)        System.out.println("Total");
        else
        {
      total = price - (discount[i] * price);
      System.out.println(threedecimalplaces.format(discount[i])+ name[i]+twodecimalplaces.format(total));
        }
      }
  }
}