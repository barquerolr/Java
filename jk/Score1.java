import java.util.Scanner;
public class Score1
{
  public static void main(String[] args)
  {
    Scanner scores = new Scanner(System.in);
    double first=0.0;
    double second=0.0;
    double third=0.0;
    double answer=0.0;
    System.out.println("First score");
    first=scores.nextDouble();
    System.out.println("Second Score");
    second=scores.nextDouble();
    System.out.println("Third Score");
    third=scores.nextDouble();
    answer=(first+second+third)/3;
    if (first >= 0 && first <=100) System.out.println(+first);
    else           System.out.println("Invalid");
    if (second >= 0 && second <=100) System.out.println(+second);
    else                             System.out.println("Invalid");
    if (third >=0 && third <= 100) System.out.println(+third);
    else                           System.out.println("Invalid");
    if (answer >=0 && answer <=100) System.out.println("This is the average of the three test scores: "+answer);
    else                            System.out.println("Invalid");
  }
}
