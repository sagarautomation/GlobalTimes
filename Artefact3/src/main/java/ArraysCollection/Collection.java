package ArraysCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection 
{

	public static void m1()
	{
		int a[]= {2,3,5,}; 
		short b[]= {2,4,7};
		char c[]= {'a','b','c'};
		Object[]s= {2,"3"};




		System.out.println(a.length);
	}

	public static void m2()
	{
		//in Arraylist the insertion order is preserved..
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
		System.out.println(list.isEmpty());

		//not added....

		list.add("Apple");//Adding object in arraylist    
		list.add("Apple");    
		list.add("Banana");    
		list.add("Grapes");  

		// added.....
		//Printing the arraylist object
		System.out.println(list.isEmpty());

		System.out.println("list object"+list);  
		System.out.println(list.get(2));

		//set.............................
		HashSet<String>set=new HashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("grapes");


		for(String el:set)
		{
			System.out.println(el.toString());
		}




	}
	public static void m3()
	{
		//insertion order not preserved in  hashmap
		//insertion order is preserved in linkedhashmap
		//Treemap
		//Null key is not alllowed
		//insertion order is as per sorting order
		TreeMap<String, String>hm=new TreeMap<>();
		//hm.put(null, null);
		hm.put("1", null);
		//hm.put(null, null);//Hashmap accepts only one Null as key
		hm.put("7", "Mendix");
		hm.put("3", "Selenium");
		hm.put("4", "Python");
		hm.put("5", "Robot Framework");

		System.out.println(hm);//{}
		/*if(hm.containsKey("1"))
		{
			System.out.println("inside if");

		}
		else
		{
			System.out.println("inside else");	
		}*/

		//System.out.println(hm.entrySet());
		//for(Map.Entry<String, String>eachentry:hm.entrySet())
		{
			//System.out.println(eachentry.getKey()+"------------------"+eachentry.getValue());
			//			if(eachentry.getKey()==null||eachentry.getKey().equalsIgnoreCase("2"))
			//			{
			//				continue;
			//			}
			//			else
			//			{
			//				System.out.println(eachentry.getKey()+"------------------"+eachentry.getValue());
			//			}


		}

		//		TreeMap<Integer, String>tm=new TreeMap<Integer,String>();
		//		tm.put(2, "selenium");
		//		tm.put(4, "java");
		//		tm.put(1, "mendix");
		//		tm.put(0, "python");
		//		tm.put(8, "API");
		//		tm.put(3, ".net");
		//		
		//		
		//		System.out.println(tm);

	}
	
	
	public static void m4()
	{
		
		List<String>els=Arrays.asList("1","2","3","4","1");
		System.out.println(els.size());
		Set<String>res=new HashSet<>(els);
		System.out.println(res.size());
		
	}







	public static void main(String[] args)
	{
		Collection.m4();

	}

}
