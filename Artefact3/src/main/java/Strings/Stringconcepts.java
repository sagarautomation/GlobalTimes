package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import ArraysCollection.Collection;

public class Stringconcepts {

	public static void m1()
	{
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);
		//System.out.println(s);

		String s1="     Java     Exercises!     ooo      ";
		System.out.println(s1+"length of s1"+s1.length());
		System.out.println(s1.strip()+"After applying strip length is"+s1.strip().length());
		System.out.println(s1.stripLeading()+"After applying stripleading  length is"+s1.stripLeading().length());
		System.out.println(s1.stripTrailing()+"After applying striptrailing  length is"+s1.stripTrailing().length());


	}

	public static void m2()
	{
		//blank will not recognize the spaces
		//empty() will recognize the spaces
		String s="";
		//System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(Objects.isNull(s));

	}


	public static void m3()
	{
		String s="w3rsource.com"; 
		System.out.println(s.length());
		System.out.println(s.codePointCount(3, 10));// (3,10-1)(3,9) 3456789
	}

	public static void m4()
	{
		String s="yamaha";

		//o/p--yamaaahaaaaa
		//a--->i=1 a  i=3  aaa  i=5 aaaaa
		String res="";  //ymh

		int count=1;

		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a')
			{
				//core logic
				for(int j=1;j<=count;j++)  //j<=3
				{
					res=res+'a'; //yamaaa

				}
				count+=2; //3

			}
			else
			{
				res=res+s.charAt(i); //yam


			}
		}

		System.out.println(res);

	}

	public static void m5()
	{
		String s="Salma"; 
		//o/p->s-1 a-2 l-1 m-1

		LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
		for(int i=0;i<=s.length()-1;i++) // 0-4
		{
			int count=1;  

			for(int j=i+1;j<=s.length()-1;j++)  //1<=4
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count=count+1;
					hm.put(String.valueOf(s.charAt(i)),count);

				}

				else
				{
					hm.put(String.valueOf(s.charAt(i)),1);

				}
			}


		}

		System.out.println(hm);



	}

	public static void m6()
	{
		//find the sum of digit in the range between 1-9999 and print the number whose sum is 9..
		for(int i=1;i<=9999;i++)
		{
			if(sum(i)==9)
			{
				System.out.println(i);
			}

		}


	}
	public static int sum(int no)
	{
		int sum=0;
		while(no>0)
		{
			sum=sum+no%10; 
			no=no/10;
		}
		return sum;

	}




	public static void m7()
	{
		String str1="This is the thread that given";
		String str2="th";
		//output=hTis is  hte htread htat given  
		reverseString(str1,str2);


	}



	public static void reverseString(String str1,String str2)
	{


		for(int i=0;i<=str1.length()-str2.length();i++)
		{
			if(str1.substring(i, i+str2.length()).equalsIgnoreCase(str2))
			{
				str1=str1.replace(str1.substring(i, i+str2.length()), new StringBuffer(str1.substring(i, i+str2.length())).reverse());
			}


		}

		System.out.println(str1);
	}

	public static void m8 ()
	{

		String str="hi how are you";
		//o/p ih woh are you
		//str.split(" ");
		String op= Arrays.stream(str.split(" "))
				.map(i-> new StringBuilder(i).reverse()+" ")
				.collect(Collectors.joining());
		System.out.println(op);	
	}



	public static void m9()
	{
		String filename="2021-05-25T10:00:05.597320600";
		filename=filename.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(filename);

	}


	public static void m10()
	{
		String str="My n@me is 12Sagar";
		//op->yM em@n si 12ragaS

		//		String output=Arrays.stream(str.split(" ")).
		//				map(el->new StringBuffer(el).reverse()+" ").
		//				collect(Collectors.joining());
		//		System.out.println(output);

		String output=Arrays.stream(str.split(" ")).
				map(el->el.toCharArray()).
				map(Stringconcepts::m11)
				.collect(Collectors.joining(" "));

		System.out.println(output);

	}


	public static String m11(char[]str)
	{


		int begin=0,end=str.length-1;  //0 6 3 5  
		while(begin<end)
		{
			if(Character.isDigit(str[begin]))
			{
				begin++;
			}
			else if(Character.isDigit(str[end]))
			{
				end--;
			}
			else
			{
				char c=str[begin];
				str[begin]=str[end];
				str[end]=c;
				begin++;
				end--;

			}
		}

		return new String(str);

	}


	public static void m12()
	{
		/*Reversing string many ways*/
		
		String s="12sagar";
		String op="";
		for(int i=s.length()-1;i>=0;i--)
		{
			op=op+s.charAt(i);
		}
		System.out.println(op);
		
		
		char[]chs=s.toCharArray();
		for(int i=0,j=chs.length-1;i<j;i++,j--)
		{
			if(Character.isDigit(chs[i]))
			{
			  	
			}
			
			else
			{
			char c=chs[i];
			chs[i]=chs[j];
			chs[j]=c;
			}
			
		}
		
		System.out.println(chs);
			
			
		
		

	}






	//	public static void reverseString(String str1,String str2)
	//	{
	//		String output="";
	//		for(int i=0;i<=str1.split(" ").length-1;i++)
	//		{
	//		if(str1.split(" ")[i].substring(0, str2.length()).equalsIgnoreCase(str2))
	//		{
	//			output=output+str1.split(" ")[i].replace(str1.split(" ")[i].substring(0, str2.length()), new StringBuffer(str1.split(" ")[i].substring(0, str2.length())).reverse())+" ";
	//		}
	//		else
	//		{
	//			output+=str1.split(" ")[i]+ "  ";
	//		}
	//		
	//		}
	//		
	//		
	//		System.out.println(output);
	//		
	//	}


	public static void main(String[] args) {

		Stringconcepts.m12();


	}

}
