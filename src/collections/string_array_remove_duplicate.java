package collections;
 
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class string_array_remove_duplicate 
{
	public static void main(String[] args) {
	
		 	String[] strArr = {"one","two","three","four","four","five"};
	        //convert string array to list
	        List<String> tmpList = Arrays.asList(strArr);
	        //create a treeset with the list, which eliminates duplicates
	        TreeSet<String> unique = new TreeSet<String>(tmpList);
	        System.out.println("Before Duplicates are removed" +Arrays.toString(strArr));
	        System.out.println("After Duplicates are removed" +unique);
		 								}
}
