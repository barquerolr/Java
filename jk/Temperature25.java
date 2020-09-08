import java.util.Scanner;//This line is needed to use the scanner
public class Temperature25
{
  public static void main(String[] args)//main method
  {
    int t= getTemperature();
    int f = convertToCelcius(t);
    int c = convertToFahrenheit(t);
    System.out.println(t+" degrees fahrenheit converts to "+f+" degrees celsiuis");
    System.out.println(t+" degrees celsius converts to "+c+" degrees fahrenheit");
  }
  public static int getTemperature()
  {
  System.out.println("Please enter your temperature");
  Scanner stuff = new Scanner(System.in);
  int t=stuff.nextInt();
  return t;
}
public static int convertToCelcius(int t)
{
  Scanner stuff = new Scanner(System.in);
  int f=((t-32)*5)/9;
  return f;
}
public static int convertToFahrenheit(int t)
{
  Scanner stuff = new Scanner(System.in);
  int c=((t*9)/5)+32;
  return c;
}
  
}