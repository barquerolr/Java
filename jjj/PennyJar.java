//Programmed by: Luis Barquero
/* Purpose of this program is to:\
 * Show how many dollars, quarters, dimes, nickels, and pennies Joe has.
 */
import java.util.Scanner;
public class PennyJar
{
  public static void main(String[] args)
  {
    Scanner money = new Scanner(System.in);
    int amount=0; // This is the amount Joe has.
    int dollars=0; //This is how many dollars Joe has.
    int quarters=0; //This is how many quarters Joe has.
    int dimes=0; //This is how many dimes Joe has.
    int nickels=0; // This is how many nickels Joe has.
    int pennies=0; //This is how many pennies Joe has.
    System.out.println("Place the amount of Joe has");
    amount=money.nextInt();
    dollars=amount/100;//This gives you the amount of dollars Joe has (amount of pennies/100).
    quarters=(amount%100)/25;//After dividing by 100, this gives you the decimals and divides it by 25 to show how many quarters Joe will have.
    dimes=((amount%100)-(quarters*25))/10;//This multiplies quarters by 25, and subtracts to the intial remainder, and divides the amount by 10 to give dimes.
    nickels=((amount%100)-(quarters*25)-(dimes*10))/5;//This substracts initial remainder by quarters times 25 and dimes by 10, and divides by 5 giving nickels.
    pennies=((amount%100)-(quarters*25)-(dimes*10) -(nickels*5))/1;//This subtracts remainder by quarters, dimes, nickels, and then divides by 1 giving pennies.
    System.out.println("This is how many dollars Joe has: "+dollars);
    System.out.println("This is how many quarters Joe has: "+quarters);
    System.out.println("This is how many dimes Joe has: "+dimes); 
    System.out.println("This is how many nickels Joe has: "+nickels);
    System.out.println("This is how many pennies Joe has: "+pennies);
  }
}
    
    