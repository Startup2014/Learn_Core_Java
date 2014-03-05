package java_misc_examples;

public class String_chat {
	
	public static String reverseIt(String source) {
	    int i, len = source.length();
	    StringBuffer dest = new StringBuffer(len);

	    for (i = (len - 1); i >= 0; i--)
	      dest.append(source.charAt(i));
	    return dest.toString();
	    
	  }
	
	public void Delete_dup(String madam ) {
	//program to delete duplicate char 
	
	}
	
	//reverse vowels in String " used "
	
	//Palindrome programme
	
//==========================================
	public static void main(String args[])
	   {
		//hello world example 
		String palindrome =" madam";
		//print string
	      System.out.println("Hello World");
	      //print string length
	      System.out.println("string lenght : " +palindrome.length());
//=========================================    
	      //reverse a string 
	      String source =" teeeerrt";
	      int i, len = source.length();
		    StringBuffer dest = new StringBuffer(len);
		    for (i = (len - 1); i >= 0; i--)
		      dest.append(source.charAt(i));
		    System.out.println("string lenght : " +dest.toString());
		    
//===================================
		    // how to compare two strings
		    String str = "Hello World";
		      String anotherString = "hello world";
		      Object objStr = str;

		      System.out.println( str.compareTo(anotherString) );
		      System.out.println( str.compareToIgnoreCase(anotherString) );
		      System.out.println( str.compareTo(objStr.toString()));
		      
//=====================================
		      String str2 = "this is Java";
		      //Test to remove third chareacter
		      System.out.println(removeCharAt(str2, 3));
		      //Test to print  third chareacter
		     // System.out.println(str2, 3);
//======================================
		   // verify string contains test
				String teststring ="this is test string";
				System.out.println("verify test is present in string:  \t "  + teststring.contains("test"));
		      
		   }
		   public static String removeCharAt(String s, int pos) {
		      return s.substring(0, pos) + s.substring(pos + 1);
		   }
	    
	   

}
