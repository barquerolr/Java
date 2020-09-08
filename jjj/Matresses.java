public class Matresses
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]); // this is the number of matresses purchased by the store
    int b = Integer.parseInt(args[1]); // this is the number of matresses sold by the store
    int c = a - b; // this is the number of matresses in stock
    System.out.println(a + " - " + b + " = " + c);
  }
}
    