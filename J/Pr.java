// Programmed by: Luis Barquero
/*The purpose of this program is to: 
 * understand how Java Programming works.
 */
import java.util.Scanner;
public class Pr
{
    public static void main(String[] args)
    {
      Scanner scores = new Scanner(System.in);
      double test = 0.0;
      double test2 = 0.0;
      double test3 = 0.0;
      
      double arrange = 0.0;
      double arrange2 = 0.0;
      double arrange3 = 0.0;
      
      double sum = 0.0;
      double average = 0.0;
      
      System.out.println("Testing");
      System.out.println("Enter the first test scores: ");
      test = scores.nextDouble();
      while(test < 0 || test > 100)
      {
        System.out.println("Invalid Entry. Test score is less than 0 or greater than 100. Enter another score: ");
        test = scores.nextDouble();
      }
      System.out.println("First test score is: " + test);
      
      System.out.println("Enter the second test scores: ");
      test2 = scores.nextDouble();
      while(test2 < 0 || test2 > 100)
      {
        System.out.println("Invalid Entry. Test score is less than 0 or greater than 100. Enter another score: ");
        test2 = scores.nextDouble();
      }
      System.out.println("Second test score is: " + test2);
      
      System.out.println("Enter the third and final test scores: ");
      test3 = scores.nextDouble();
      while(test3 < 0 || test3 > 100)
      {
        System.out.println("Invalid Entry. Test score is less than 0 or greater than 100. Enter another score: ");
        test3 = scores.nextDouble();
      }
        System.out.println("Third test score is: " + test3);
      
      System.out.println("The three test scores are: " + test + ", " + test2 + ", and " + test3); 
      
      if(test > test3)
      {
        arrange = test;
        test = test3;
        test3 = arrange;
      }
      
      if(test > test2)
      {
        arrange2 = test;
        test = test2;
        test2 = arrange2;
      }
      
      if(test2 > test3)
      {
        arrange3 = test2;
        test2 = test3;
        test3 = arrange3;
      }
      
        System.out.println("The three test scores, in order, are: " + test + ", " + test2 + ", and " + test3); 
        sum = test + test2 + test3;
        System.out.println("The total sum of the three test scores is: " + sum);
        average = (sum)/ 3;
        System.out.printf("The total average of the three test scores is: " + String.format("%.4g%n", average));
    }
}
      