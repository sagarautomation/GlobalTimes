package regularexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpressions {

	public static void m1()
	{

		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "ak"));//false (2nd char is not s) 
		System.out.println(Pattern.matches("..s", "aks"));//true (3rd char is  s)  

		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char) 
		System.out.println(Pattern.matches("..t", "mst"));//true(has 3 char and the last one is t)

		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  

	}
	public static void m2()
	{

		//[abc]->a,b or c

		System.out.println(Pattern.matches("[amn]", "akkkkk"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  

	}

	public static void m3()
	{

		//X?----->X occurs once or not at all
		System.out.println(Pattern.matches("[a]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "azzt"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

	}

	public static void m4()
	{

		//X+ ---->X occurs once or more times

		System.out.println(Pattern.matches("[amn]+", ""));//false(a or m or n doesnt occur even 1 time) 
		System.out.println(Pattern.matches("[amn]+", ""));//true (a or m or n once or more times)  

		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  


	}


	public static void m5()
	{

		//X*---------->X occurs zero or more times
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
		System.out.println(Pattern.matches("[amn]*", "ammmnazzz"));//false(since z is not a matching pattern)
	}



	public static void m6()
	{

		//X{n}--------->X occurs n times only
		System.out.println(Pattern.matches("a{2}", "ammmna"));//false(a occurs 2 times but other character also present)
		System.out.println(Pattern.matches("a{2}", "aa")); //true
		System.out.println(Pattern.matches("a{2}", "aaa")); //false


	}


	public static void m7()
	{

		//metacharacters
		/*
		.	Any character (may or may not match terminator)
		\d	Any digits, short of [0-9]
		\D	Any non-digit, short for [^0-9]
		\s	Any whitespace character, short for [\t\n\x0B\f\r]
		\S	Any non-whitespace character, short for [^\s]
		\w	Any word character, short for [a-zA-Z_0-9]
		\W	Any non-word character, short for [^\w]
		\b	A word boundary
		\B	A non word boundary
		 */

		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  


		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
		System.out.println(Pattern.matches("\\D*", "abcd"));




	}


	public static void m8()
	{
		/*Create a regular expression that accepts alphanumeric characters only.  
		Its length must be six characters long only.*/  

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
		System.out.println(Pattern.matches("[a-z0-9]{6}", "arun23"));  
	}


	public static void m9()
	{
		/*Create a regular expression that accepts 10 digit numeric characters 
		 starting with 7, 8 or 9 only.*/  


		System.out.println("by character classes and quantifiers ...");  
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  

		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  

		System.out.println("by metacharacters ...");  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  
	}


	public static void m10()
	{
		String s="2021-05-25T10:00:05.597320600";
		System.out.println(s);
		s=s.replaceAll("[^a-z 0-9 A-Z\\:]", "");
		System.out.println(s);

	}


	public static void m11()
	{
		String s="AAABCCC";
		System.out.println(Pattern.matches("A{3}B?C{3}", s)); //(true)  A occur 3 times B occur once and C occur 3 times
		System.out.println(Pattern.matches("AAA.*CCC", s)); //(true)  A occur 3 times B occur once and C occur 3 times
		System.out.println(Pattern.matches("AAA(.*)CCC", s)); //(true)  A occur 3 times B occur once and C occur 3 times

	}

	public static void m12()
	{
		String inputstring="12Sagar";
		String regex="[0-9]+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(inputstring);

		while (m.find()) {
			System.out.println("find() found substring \"" + m.group()
			+ "\" starting at index " + m.start()
			+ " and ending at index " + m.end());
			
			int g=m.end()-1;
			System.out.println(g);
		}


	}

	public static void m13()
	{
		List<String> emails = new ArrayList();
		emails.add("user@domain.com..");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.co.in");
		emails.add("user@domaincom");
		 
		//Invalid emails
		emails.add("user#domain.com");
		emails.add("@yahoo.com");
		 
		String regex = "^[\\w-\\. #]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email +" : "+ matcher.matches());
		}

	}






	public static void main(String[] args) {

		Regularexpressions.m13();
	}

}
