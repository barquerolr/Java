//Programmed by: Luis Barquero
/* Purpose of this program is to:
 * Give the average of three test scores a student scored.
 */
import java.util.Scanner;
public class TestScores
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
    if (score1 >= 0 && score1 <=100) System.out.println("Studen scored: "+score1); // Score1 is always positive.
    else           System.out.println("Invalid Test Scores"); // If negative, it's invalid.
    if (score2 >= 0 && score2 <=100) System.out.println("Student scored: "+score2); // Score2 is not negative.
    else                             System.out.println("Invalid test scores"); // Does not register if negative.
    if (score3 >=0 && score3 <= 100) System.out.println("Student scored: "+score3); // Score3 will always be positive.
    else                             System.out.println("Invalid Test Scores"); // Score should be positive. If not, they are invalid.
    if (average >=0 && average <=100) System.out.println("This is the average of the three test scores: "+average);
    else                              System.out.println("Invalid Test Average Scores"); // The answer is positive.
  }
}