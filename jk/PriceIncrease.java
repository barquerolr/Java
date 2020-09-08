// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Practice passing arrays, and perform operations.
 */
import java.text.DecimalFormat;
public class PriceIncrease // example of passing to methods
{
  public static void main(String[] args)//main program
  {
    double prices[][]=//array that will be passed
    {
      {22.33,  68.30,  36.99,  58.75,   63.67},
      {12.25,  87.13,  65.47,  33.90,   18.42},
      {46.85,  41.38,  74.48,  24.21,   67.10}
    };
    System.out.println("The original prices are: ");
    for (int i = 0; i < 3; i=i+1)
    {
      for (int j = 0; j <5; j=j+1)
      {
        System.out.print(prices[i][j]+ "  ");
        }
         System.out.println( "" );
    }
        System.out.println();
        System.out.println("The new prices with a 4% increase are: ");
        priceincrease(prices);
  }
  
  
  public static void priceincrease(double price[][])
  {
   DecimalFormat twodecimalplaces = new DecimalFormat("0.00"); // Formats the decimals to two decimal places.
    for (int i = 0; i < 3; i=i+1)
    {
      for (int j = 0; j <5; j=j+1)
      { 
        price[i][j]=price[i][j] + (price[i][j] * 0.04);
        System.out.print("  "+twodecimalplaces.format(price[i][j]));
      }
      System.out.println( "" );
    }
  }
}