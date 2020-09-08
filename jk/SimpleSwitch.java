import java.util.Scanner;
 public class SimpleSwitch
 {
   public static void main(String args[]) 
   {
     
      Scanner stuff = new Scanner(System.in);
      int day=0;
     System.out.println("Put entry from scanner");
     day = stuff.nextInt();
     switch(day)
     {
         case 1: System.out.println("The day is: Sunday");break;
         case 2: System.out.println("The day is: Monday");break;
         case 3: System.out.println("The day is: Tuesday");break;
         case 4: System.out.println("The day is: Wednesday");break;
         case 5: System.out.println("The day is: Thursday");break;
         case 6: System.out.println("The day is: Friday");break;
         case 7: System.out.println("The day is: Saturday");break;
         default:System.out.println("Invalid Entry");break;
     }
   }    
}         
