public class Multiples
{
public static void main(String args[])
{
int total=0;
for(int number=1; number<4; number++)
{
System.out.println("The number is "+number); 
System.out.println("The multiples of "+number+" are: ");

 for(int multnumber=1; multnumber<5; multnumber++)
 {
total=number*multnumber;
 System.out.println(total+"   ");
}
}
}
}
