// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Calculate the gross pay using multiple methods.
 */
import java.util.Scanner; //Used to allow the user to input values.
import java.text.DecimalFormat; //Used to format the values to two decimal places.
public class GrossPay 
{
  public static void main(String[] args)
  {
    DecimalFormat twodecimalplaces = new DecimalFormat("0.00"); // Formats the decimals to two decimal places.
    double hoursworked = getHoursWorked(); //Method used to acquire the hours worked.
    double payrate=getPayRate(); //Method used to find the payrate, or amount paid per hour.
    double mult = hoursworked * payrate; //Method used to set the value of mult, in order to use it for calculations.
    double amount = calcGross(hoursworked, payrate); // Method used to calculate the gross, which is the hours worked times the payrate.
    double total = displayAmount(amount); //Method used to display the calculated gross.
    System.out.println("The hours worked are: "+hoursworked); //Displays the hours worked.
    System.out.println("The payrate is: $"+payrate); //Displays pay rate.
    System.out.println("The total gross is: $"+twodecimalplaces.format(amount)); //Displays total gross.
  }//end of main
  
  public static double getHoursWorked() //Method used to calculate hours.
  {
    System.out.println("Enter the amount of hours worked");
    Scanner money = new Scanner(System.in);
    double hours = money.nextDouble();
    return hours; //Returns value acquired for hours in the getHoursWorked method,
  }
  
  public static double getPayRate() //Method used to acquire pay rate.
  {
    System.out.println("Enter the amount of pay rate");
    Scanner money = new Scanner(System.in);
    double pay = money.nextDouble();
    return pay; //Returns value acquired for pay in the getPayRate method.
  }
  
  public static double calcGross(double hoursworked, double payrate) //Method used to calculate the total gross.
  {
    double gross = 0.0;
    gross = hoursworked * payrate;
    return gross; //Returns the value acquired for answer in the calcGross method.
  }
  
  public static double displayAmount(double amount) //Method used to allow the display of amount, or calculated gross.
  {
    return amount; //Returns the value found in amount in the calcGross(double mult) method.
  }
}
    
  
  