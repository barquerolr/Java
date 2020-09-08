import java.util.Scanner;
public class MedicalConferencert
{
  public static void main(String args[])
  {
    Scanner cost = new Scanner(System.in);
    double registration=0.0;
    double total=0.0;
    System.out.println("Place number of registration");
    registration = cost.nextDouble();
    if (registration < 5)        System.out.println("The charge is: "+total);
    total=registration * 125;
  }
}