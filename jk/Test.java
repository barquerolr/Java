public class Test//calling other programs (MethodExampleCube)
{
    public static void main(String[] args)
    {
        int j=MethodExampleCube.input();//call to seperate program and function within
        System.out.println("the value returned from MethodExampleCube.input is:   "+j);
        
        int x=MethodExampleCube.triple(j);//call to seperate program and function within
        System.out.println("the value returned from MethodExampleCube.triple is:   "+x);//display of return from MethodExampleCube.triple
        
        System.out.println("the value returned from MethodExampleCube.output is:   ");
        MethodExampleCube.output(x);//display from the seperate program
    }
}
