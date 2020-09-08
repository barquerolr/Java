import java.util.Scanner;//this line is needed for the scanner
import java.text.DecimalFormat;//this line is needed to format the decimal places
public class CustDiscount232
{
  public static void main(String[] args)
  {
    Scanner stuff = new Scanner(System.in);
    DecimalFormat t = new DecimalFormat("#0.00");//formats to 2 decimal places
    DecimalFormat d = new DecimalFormat("#0.000");//formats to 3 decimal places
    String customer[] = new String[6];//creates a 6 element array for the customer names
    double discount[] = new double[6];//creates a 6 element array for the discounts
    double price = 0;
    for(int i=0;i<6;i++)//starts at  0 and will increase by increments of 1 as long as its less than 6
    {
      System.out.print("Please enter the customer name: ");
      customer[i]= (String)stuff.next();//scanner method used for a string array
      System.out.print("Enter the customer discount: ");
      discount[i] = stuff.nextDouble();
    }
    System.out.println("Enter your product price");
    price = stuff.nextDouble();
    for(int i=0;i<6;i++)
    {
      if(i==0) System.out.println("Name\tDiscount\tDiscounted Price");//labels the arrays
      else
      {
        double adjusted= price-(price*discount[i]);
        System.out.println(customer[i]+"\t"+d.format(discount[i])+"\t"+t.format(adjusted));//outputs the name, discount, and adjusted price 
      }
    }
  }
}
