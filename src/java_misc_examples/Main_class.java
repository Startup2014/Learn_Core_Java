package java_misc_examples;
import java.util.Arrays;
import java.util.*;
	//: c02:DataOnlyTest.java
	// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
	// www.BruceEckel.com. See copyright notice in CopyRight.txt.

	public class Main_class {
		
	  public static void main(String[] args) throws Exception {
	    //print new date
	    System.out.println("Hello, it's: ");
	    System.out.println(new Date());
	   
	    //called a mehtod
	    
	    comparearray();
	    
	    //called a class from integers
	    
	    integers integersobj = new integers(10);
	    
	    for(int i =0; i< 5 ;i++)
	    	
	    {
	    	integersobj.add();
	    	System.out.printf("%s ", integersobj);
	    }
	    
	    
	  }
		 
	   public static void comparearray() throws Exception {
		   //programe to compare two arrays
	      int[] ary = {1,2,3,4,5,6};
	      int[] ary1 = {1,2,3,4,5,6};
	      int[] ary2 = {1,2,3,4};
	      System.out.println("Is array 1 equal to array 2?? "
	      +Arrays.equals(ary, ary1));
	      System.out.println("Is array 1 equal to array 3?? "
	      +Arrays.equals(ary, ary2));
	     
	   }
	   //favinous series
	   
	   public int a = 1;
	   public int b = 3;
	  // ;
	   
	   public static void favinious_series() 
	   {
		 //  public static int total = a +b;
		   
		   
		   
	   }
	}



