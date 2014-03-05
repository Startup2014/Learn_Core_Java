package java_misc_examples;

public class integers {
	
	//program to add two numbers and crate array to print upto 10 
		//1  1   2  3  5  8..up to 10
		//collection , hast map , hast set , hashcode
	public static int num1 = 2;
	public static int num2 = 3;
	public static int summ  = 0;
	public static int  sum2 = 0;
	
private int sum;
private final int NUMBER;

	public integers(int x)
	{
		NUMBER = x;
	}
	public void add()
	{
		sum+=NUMBER;
	}
	      
	public String toString(){
		return String.format("sum = %d\n" , sum);
	}
	
	
	//=================Different mehtod===============
	      public int addtion(int num1 , int num2)
	      {
	    	summ  = num1 + num2;
	   	     System.out.println("Sum of entered integers = "+summ);
	   	     
	   	   sum2 = num2 + summ;
		    System.out.println("Sum of entered integers = "+sum2);
		    return summ;
	      }
	      
	      
	
}
