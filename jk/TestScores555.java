import java.util.Scanner;
public class TestScores555
{
  public static void main(String[] args)
  {
    Scanner grades = new Scanner(System.in);
    double score1=0.0; // This is the first test score.
    double score2=0.0; // This is the second the second test score.
    double score3=0.0; // This is the third test score. 
    double average=0.0; // This is the average of the three test scores(score1+score2+score3)/3.
    System.out.println("First test score");
    score1=grades.nextDouble();
    System.out.println("Second test score");
    score2=grades.nextDouble();
    System.out.println("Third test score");
    score3=grades.nextDouble();
    average=(score1+score2+score3)/3;
    while (score1 <= 100 && score1 <= 100)
    {
      System.out.println("Studen scored: "+score1);
    }
    while (score2 >= 0 && score2 <= 100)
    {
      System.out.println("Student scored: "+score2);
    }
    while (score3 >= 0 && score3 <= 100)
    {
      System.out.println("Student scored: "+score3); 
    }
    while(average >= 0 && score1 <= 100)
    {System.out.println("This is the average of the three test scores: "+average);
    }
  }
}