import java.util.Scanner;
import java.text.DecimalFormat;
public class Temperature267
{
  public static void main(String[] args)
  {
    DecimalFormat temperature = new DecimalFormat("0.00"); // Formats the decimals to two decimal places.
    double decision = getdecision();
    double temperatures = calculation(decision);
    double temperatures2 = calculation2(decision);
    double conversion = convertToFarenheit(temperatures);
    double display = showconvert(conversion);
    double conversion2 = convertToCelsius(temperatures2);
    double display2 = showconvert2(conversion2);
    if (decision == 1)            System.out.println("Your temperature is: "+temperatures);
    if (decision == 1)            System.out.println("The temperature in Farenheit is: "+temperature.format(display));
    if (decision == 2)            System.out.println("Your temperature is: "+temperatures2);
    if (decision == 2)            System.out.println("Your temperature in Celsius is: "+temperature.format(display2));
  }//end of main
  
  
  public static double getdecision()
  {
    Scanner temperature = new Scanner(System.in);
    System.out.println("Enter 1 if calculation is in Celsius, 2 for Farenheit");
    double decision = temperature.nextDouble();
    return decision;
  }
  
 
  public static double calculation(double decision)
  {
    if (decision == 1)        System.out.println("Enter your temperature");
    else return decision;
    Scanner temperature = new Scanner(System.in);
    double temp = temperature.nextDouble();
    return temp;
  }

  
  public static double calculation2(double decision)
 {
   if (decision == 2)        System.out.println("Enter your temperature");
   else return decision;
   Scanner temperature = new Scanner(System.in);
   double temp2 = temperature.nextDouble();
   return temp2;
 }

  
  public static double convertToFarenheit(double temperatures)
 {
   double converting = (temperatures * 1.8) + 32;
   return converting;
 }

  
  public static double showconvert(double conversion)
 {
   return conversion;
 }
 
  
  public static double convertToCelsius(double temperatures)
 {
   double converting2 = (temperatures - 32) * 5/9;
   return converting2;
 }
  
  public static double showconvert2(double conversion2)
  {
    return conversion2;
  }
}