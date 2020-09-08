import java.text.DecimalFormat;
import java.util.Scanner;
public class FinancialServiceCompany
{
  public static void main(String args[])
  {
    Scanner finance = new Scanner(System.in);
    DecimalFormat twodecimalplaces = new DecimalFormat("0.00"); 
    double monthly = 0.0; // Monthly amount.
    System.out.println("Enter the monthly amount");
    monthly = finance.nextDouble();
    double rate = 1.0125; // Rate.
    double amount = 300000.00; // Amount goal;
    double total = calc(monthly, rate);
    double investment = 0.0;
    double continuous = 0.0;
    investment = monthly * rate;
    continuous = (investment + monthly) * rate;
    double months = 0.0;
    System.out.println("The investment is: "+investment);
    System.out.println("The continuous rate is: "+twodecimalplaces.format(continuous));
  }
  
  public static double calc(double monthly, double rate)
  {
    if (monthly >= 1)
      return monthly + calc((monthly * rate) + (monthly +1));
    
    else 
      return 0; 
  }
}