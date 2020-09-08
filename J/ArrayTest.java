public class ArrayTest//calling StdRandom and StdStats
{
    public static void main(String[] args)
    {
      int num[]={20,30,40,50,60,70,80};//integer array for use with StdArrayIO
      double statarray[]={20.1, 30.2, 40.3, 50.4, 60.4};//double array for use with StdStats
      double value=0;//value is variable for use with StdRandom
      double x=0;//x is variable for use with StdStats
      
      value=StdRandom.uniform(20,80);//call of StdRandom
      System.out.println("The return value from StdRandom is:    "+value);//
      System.out.println();//line for spacing
      
      System.out.println("The return value from StdArrayIO is:   ");
      StdArrayIO.print(num);//use of StdArrayIO to display
      System.out.println();//line for spacing
      
      x = StdStats.mean(statarray);//x is set to return value from StdStats.mean
      System.out.println("The mean value of statarray is:     "+x);//output of x
    }
}

