//Programmed by: Luis Barquero
/* Purpose of this program is to:
 * Give the sum of the even numbers in a while loop from 1 to 50.
 */
public class EvenNumbers
{
  public static void main(String args[])
  {
    int sum = 0; // This will add all the multiples from 1 to 50 that are even.
    for (int count=2;count<=50;count+=2)
    { 
      if (count==1) //This tells the counter that if the number is one, to skip it and not count it in the loop.
        continue; 
      sum+= count; // This will add all the even numbers in the loop, and give the total.
 System.out.println(count);
 System.out.println("Total sum of even numbers is: "+sum);
}
}
}