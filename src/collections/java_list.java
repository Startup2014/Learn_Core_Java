package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map ;
import java.util.SortedMap;
import java.util.TreeMap;

public class java_list {
/*http://tutorials.jenkov.com/java-collections/list.html
 * List listC = new Vector();
 *List listD = new Stack(); 
 *List listA = new ArrayList();
 * List listB = new LinkedList();
 */
	public static void main(String[] args) throws Exception 
	{
		 
		list_example();
		linked_list_example();
	}
	
	public static void list_example()
	{
		//Lists let you store a value multiple times and access or modify insertion order:
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Two");
		strings.add("Three");
		strings.add(0, "One");
		strings.add(3, "One");
		strings.add("Three");
		strings.add(strings.size() - 1, "Two");
		System.out.println(strings);
	
		//LIST2
		
		List listA = new ArrayList();
		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 2");
		
		

		//access via index
		String element0 = (String) listA.get(0);
		String element1 = (String) listA.get(1);
		String element3 = (String) listA.get(2);


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  
		}


		//access via new for-loop
		for(Object object : listA) {
		    String element = (String) object;
		}
		System.out.println(listA);
		
		System.out.println(strings.addAll(listA));
	}
	
	public static void  linked_list_example()
	{
		
		List listB = new LinkedList();
		
		
		String str = "1-800-APPLE ";
		str = str.replace("-","");
		System.out.println(str);
		
		 
		//Map mapA = new HashMap();
		SortedMap mapA = new TreeMap();
		mapA.put("A", "1");
		mapA.put("P", "2");
		mapA.put("L", "3");
		mapA.put("E", "4");
		
		   StringBuilder string = new StringBuilder("1-800-APPLE");
		    System.out.println("string = " + str);
		    
		Iterator iterator = mapA.keySet().iterator();
		
		while( iterator.hasNext()){
		  Object key   = iterator.next();
		  Object value = mapA.get(key);
		  System.out.println(value);
		}
		
		//we need to make this programee using string builder
		System.out.println("After replace  = " + string.toString());
	}
}
