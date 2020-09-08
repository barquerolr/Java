public class Integers
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int p = a * b;
        int q = a / b; 
        int s = b / a;
        int r = a % b;
        int t = b % a; 
        int w = a * b + b - a;
        System.out.println(a + " * " + b + " = " + p);
        System.out.println(a + " / " + b + " = " + q);
        System.out.println(b + " / " + a + " = " + s);
        System.out.println(a + " % " + b + " = " + r);
        System.out.println(b + " % " + a + " = " + t);
        System.out.println(a + " * " + b + " + " + b + " - " + a + " = " + w);
        System.out.println(a + " = " + q + " * " + b + " + " + r);
        System.out.println(b + " = " + q + " * " + a + " + " + r);
        System.out.println(a + " = " + s + " * " + a + " + " + b + " / " + p + " - " + r);
    }
}