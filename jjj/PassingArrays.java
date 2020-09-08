public class PassingArrays // example of passing to methods
{
  public static void main(String[] args)//main program
  {
    int array[]={1,2,3,4,5};//array that will be passed
    String teststring="joe";//string that will be passed
     System.out.println("the values in the original array are");
        for(int counter=0; counter<array.length; counter++)
        System.out.println(array[counter]);//output showing original values of array

         modifyArray(array);   //call to modify Array
        System.out.println("the values in the modified array are");
        for(int counter=0; counter<array.length; counter++)
        System.out.println(array[counter]);  //output showing values of array after being passed and modified within method
   
        System.out.println("the values of a[3] before modifyElement is  "+array[3]);//value of subscript 3
        modifyElement(array[3]);//call to method to modify a single subscript
        System.out.println("the values of a[3] after modifyElement is  "+array[3]);   //value of subscript 3 after method
                         
        modifyString(teststring);//call to modify String
        System.out.println("the value of teststring after the method is:   "+teststring);//value of String after modification
  }//end of main
  
  public static void modifyArray(int array2[])  //method or function header or signature to modify Array
  {
    for(int counter=0; counter<array2.length; counter++)
    array2[counter]=array2[counter]*2;      
  }//end of array modification method
  
   public static void modifyElement(int element)  //method or function header or signature to modify element or subscript 3
  {
    element=element*2;
    System.out.println("the values of a[3] inside of modifyElement after multiplication is  "+element);
  }//end of element modification method
   
    public static void modifyString(String testmethod)  //method or function header or signature to modify String
  {
      System.out.println("the value of testmethod originally is:  "+testmethod);
      testmethod="george";    
      System.out.println("the value of testmethod after changing within method is:  "+testmethod);
  }//end of string modification method
}//end of program
