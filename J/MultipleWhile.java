public class MultipleWhile
{
public static void main(String args[])
{
int number=1;
int multCounter=1;
int total=0;
while(number<6)
{
System.out.println("The number is "+number); 
System.out.println("The multiples of "+number+" are: ");
 while(multCounter<4)
 {
total=number*multCounter;
 System.out.println(total+"   "); 
 multCounter=multCounter +1;
}
 number=number+1;
 multCounter=1;
}
}
}
