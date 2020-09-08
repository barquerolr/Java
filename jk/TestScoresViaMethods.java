import java.util.Scanner;//This line is needed to use the scanner
import java.text.DecimalFormat;//This line is needed to formal the decimal place
public class TestScoresViaMethods
{
  public static void main(String[] args)
  {
    DecimalFormat d = new DecimalFormat("0.00");
    double scores1=getTestScores();
    double scores2=getTestScores();
    double scores3=getTestScores();
    double sum=scores1+scores2+scores3;
    double average=calcAverage(sum);
    double avg=displayAverage(average);
    System.out.println("Your 3 test scores are: "+scores1+" "+scores2+" "+scores3);
    System.out.println("Your test average is: "+d.format(avg));
  }
  public static double getTestScores()
  {
    System.out.println("Please enter your test scores");
    Scanner stuff = new Scanner(System.in);
    double score1= stuff.nextDouble();
    return score1;
}
  public static double getTestScores2()
  {
    System.out.println("Please enter your test scores");
    Scanner stuff = new Scanner(System.in);
    double score2= stuff.nextDouble();
    return score2;
}
  public static double getTestScores3()
  {
    System.out.println("Please enter your test scores");
    Scanner stuff = new Scanner(System.in);
    double score3= stuff.nextDouble();
    return score3;
}
  public static double calcAverage(double sum)
  {
    double avg=(sum)/3;
    return avg;
}
  public static double displayAverage(double average)
  {
    return average;
  }
}