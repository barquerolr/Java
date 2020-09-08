import java.util.Scanner;//This line is needed to use the scanner 
 public class SimpleIfElseAndWhile
 {
   public static void main(String args[]) 
   {  Scanner stuff = new Scanner(System.in);//stuff is name of what's coming in from command line
      Double number=0.0;
      int counter=0;
     System.out.println("Put entry from scanner");
          while(counter<5)
     {
         number = stuff.nextDouble();
     if (number>0)
     {
         System.out.println("The number "+number+" is greater than zero!");
     }
     else
     {         System.out.println("The number "+number+" is less than zero!");
     }
     System.out.println("The counter is currently "+counter);
     counter=counter+1;
     }
   }    
 }                
