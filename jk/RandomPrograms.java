public class RandomPrograms
 {
   public static void main(String args[]) 
   {
     int number=1;
     int length=6;
     int rolls=0;
     double [] r= new double[length];
     number=1+(int)(Math.random()*6);//generate between 1 and 6(single die)
     rolls=1+(int)(Math.random()*6);//generate between 1 and 6(single die)
     System.out.println(number);
     System.out.println(rolls);
       }    
 }

