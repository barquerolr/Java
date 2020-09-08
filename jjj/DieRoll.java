//Programmed by: Luis Barquero
/* Purpose of this program is to:
 * Simulate the rolling of a die 1000 times that also shows the frequency of the side of the dice.
 */
public class DieRoll
 {
   public static void main(String args[]) 
   {
     int chance = 6;
     int number = 0;
     int sum = 0;
     double total = 0.0;
     
     double [] r= new double[chance];
     for(int i = 0; i < 1000; i++)
     {
       number =(1+(int)(Math.random()*6));
     System.out.println(number);
     r[number-1]=r[number-1]+1;
     }
     System.out.println("Side 1 was rolled: "+r[0]);
     System.out.println("Side 2 was rolled: "+r[1]);
     System.out.println("Side 3 was rolled: "+r[2]);
     System.out.println("Side 4 was rolled: "+r[3]);
     System.out.println("Side 5 was rolled: "+r[4]);
     System.out.println("Side 6 was rolled: "+r[5]);
   }
}