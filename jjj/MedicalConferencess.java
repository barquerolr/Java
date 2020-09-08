import java.util.Scanner;
public class MedicalConferencess
{
  public static void main(String args[])
  {
    Scanner cost = new Scanner(System.in);
    double registration=0.0;
    double total=0.0;
    double total2=0.0;
    double total3=0.0;
    double total4=0;
    double average=0.0;
    int sum=0;
    System.out.println("Place number of registration");
    registration = cost.nextDouble();
    while (registration > 0)
    {
      if (registration < 5)        System.out.println("The charge is: "+total);
      total=registration * 125;
      registration = cost.nextDouble();
      if (registration >= 5 && registration <= 11)      System.out.println("The charge is: "+total2);
      registration = cost.nextDouble();
      total2=registration * 105;
      if (registration >= 12)         System.out.println("The charge is: "+total3);
      registration = cost.nextDouble();
      total3=registration * 80;
      System.out.println("Total people: "+sum);
      System.out.println("Total charge: "+total4);
      System.out.println("Average is: "+average);
      sum+=registration;
      total4=total+total2+total3;
      average=total4/sum;
      System.out.println("New entry");
      registration = cost.nextDouble();
    }
  }
}
