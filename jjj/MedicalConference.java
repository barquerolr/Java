import java.util.Scanner;
public class MedicalConference
{
  public static void main(String args[])
  {
    Scanner cost = new Scanner(System.in);
    double registration=0.0;
    double total=0.0;
    double total2=0.0;
    double total3=0.0;
    double total4=0.0;
    double average=0.0;
    int sum=0;
    double sum1=0.0;
    System.out.println("Enter number of registrants");
    registration = cost.nextDouble();
    while (registration > 0)
    {
      if (registration < 5)        System.out.println("The charge is: "+total);
      total=registration * 125;
      System.out.println("People: "+sum);
      sum+=registration;
      if (registration >= 5 && registration <= 11)      System.out.println("The charge is: "+total2);
      total2=registration * 105;
      if (registration >= 12)         System.out.println("The charge is: "+total3);
      total3=registration * 80;
      System.out.println("New entry or -1 to exit");
      registration = cost.nextDouble();
      sum+=registration;
      System.out.println("Total cost is: "+total4);
      total4= (total +total2+total3)/2  ;
    System.out.println("Total average is: "+average);
    average=total4/sum;
    }
  }
}