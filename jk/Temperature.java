// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Convert the temperature given using mutliple methods.
 */
import java.util.Scanner; //Used to allow user to enter temperature.
import java.text.DecimalFormat; //Used to formate numbers to two decimal places.
public class Temperature
{
 public static void main(String[] args)
  {
    DecimalFormat temperature = new DecimalFormat("0.00"); // Formats the decimals to two decimal places.
    double decision = getdecision(); //Method used to find out if temperature is in Celsius or Farenheit.
    double temperatures = calculation(decision); // Method to acquire temperature if decicion was 1, or Celsius.
    double temperatures2 = calculation2(decision); //Method used to acquire temperature if decision was 2, or Farenheit.
    double conversion = convertToFarenheit(temperatures); //Method used to convert from Celsius to Farenheit.
    double display = showconvert(conversion); //Method used to display the answer when converting to Farenheit.
    double conversion2 = convertToCelsius(temperatures2); //Method used to covnert Farenheit to Celsius.
    double display2 = showconvert2(conversion2); //Method used to display the answer when converting to Celsius.
    if (decision == 1)            System.out.println("Your temperature is: "+temperatures); //Shows temperature if decision was 1.
    if (decision == 1)            System.out.println("The temperature in Farenheit is: "+temperature.format(display)); //Shows temperature in Farenheit.
    if (decision == 2)            System.out.println("Your temperature is: "+temperatures2);//Shows temperature if decision was 2.
    if (decision == 2)            System.out.println("Your temperature in Celsius is: "+temperature.format(display2));//Shows temperature in Celsius.
  }//end of main
  
  
  public static double getdecision() //Method used to get decision if temperature is in Celsius or Farenheit.
  {
    Scanner temperature = new Scanner(System.in);
    System.out.println("Enter 1 if calculation is in Celsius, 2 for Farenheit");
    double decision = temperature.nextDouble();
    return decision; //Returns the decision found in getdecision method.
  }
  
 
  public static double calculation(double decision) //Method used to acquire temperature if decision was 1.
  {
    if (decision == 1)        System.out.println("Enter your temperature");
    else return decision;
    Scanner temperature = new Scanner(System.in);
    double temp = temperature.nextDouble();
    return temp; //Returns the temperature found in the method.
  }

  
  public static double calculation2(double decision) //Method used to get temperature if decision was 2.
 {
   if (decision == 2)        System.out.println("Enter your temperature");
   else return decision;
   Scanner temperature = new Scanner(System.in);
   double temp2 = temperature.nextDouble();
   return temp2; //Returns temperature found in method.
 }

  
  public static double convertToFarenheit(double temperatures) //Method used to convert from Celsius to Farenheit.
 {
   double converting = (temperatures * 1.8) + 32;
   return converting; //Returns value found in method.
 }

  
  public static double showconvert(double conversion) //Method used to display the conversion.
 {
   return conversion; //Returns the conversion found in method.
 }
 
  
  public static double convertToCelsius(double temperatures) // //MEthod used to convert from Farenheit to Celsius.
 {
   double converting2 = (temperatures - 32) * 5/9;
   return converting2; //Returns value found in method.
 }
  
  public static double showconvert2(double conversion2) ////Method used to display the conversion.
  {
    return conversion2; ////Returns the conversion found in method
  }
}