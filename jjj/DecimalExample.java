import java.text.DecimalFormat;//java package needed for DecimalFormat to work
 public class DecimalExample
 {
   public static void main(String args[]) 
   {
     double first=1.2259;
     double second=3.7557;
     double answer=0.00;
     answer=first*second;
     System.out.println("Here is the answer with no formatting:    "+ answer);
     DecimalFormat twodigits = new DecimalFormat("0.00");//twodigits is name given to a particular type of format
     DecimalFormat threedigits = new DecimalFormat("0.000");//threedigits is name given to a particular type of format
     DecimalFormat twobefaft = new DecimalFormat("00.00");//twobefaft is name given to a particular type of format
     System.out.println("Here is the answer with two digits:    " + twodigits.format(answer));
     System.out.println("Here is the answer with three digits:    " + threedigits.format(answer));
     System.out.println("Here is the answer with two befaft:    " + twobefaft.format(answer));
                                     
   }    
 }
