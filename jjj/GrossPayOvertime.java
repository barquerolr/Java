// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Calculate the gross pay by calling the GrossPay program.
 */
import java.text.DecimalFormat; //Used to format the values to two decimal places.
public class GrossPayOvertime
{
    public static void main(String[] args)
    {
        DecimalFormat twodecimalplaces = new DecimalFormat("0.00"); // Formats the decimals to two decimal places.
        double hours = GrossPay.getHoursWorked(); //This calls the getHoursWorked method from GrossPay.
        System.out.println("The hours worked is:   "+hours);
        double pay = GrossPay.getPayRate();  // This calls the getPayRate method from GrossPay.
        System.out.println("The payrate is: $"+pay);
        double lessthan=GrossPay.calcGross(hours, pay); // This calls the caclGross method from GrossPay to calculate the gross.
        double total= calcNewGross(hours, pay); //If the hours are over 40, this calls the calcNewGross method within this program.
        if (hours < 40)     System.out.println("The total gross is: $"+twodecimalplaces.format(lessthan));
        if (hours > 40)             System.out.println("The total gross is: $"+twodecimalplaces.format(total)); 
    }


    public static double calcNewGross(double hours, double pay)
    {
      double total2 = 0.0;
      double total3 = 0.0;
      double total4 = 0.0;
      double total5 = 0.0;
      double total6 = 0.0;
      total2 = 40 * pay; //This is the first 40 hours multiplied by the payrate.
      total3 = hours - 40; //This subtracts the first 40 hours from the hours input for later calculation.
      total4 = pay * 1.5; //This multiplies the original payrate by 1.5.
      total5 = total4 * total3; // This multiplies the new payrate times the hours remaining to give the overtime gross.
      total6 = total2 + total5; // This adds the new gross and the first 40 hours to give the new gross.
      return total6;
    }

}
