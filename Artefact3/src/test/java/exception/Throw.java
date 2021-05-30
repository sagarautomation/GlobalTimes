package exception;

import java.util.Arrays;

public class Throw
{
	public static void m1(int range) throws Exception
	{
		if(range<25)
		{
			throw new Exception("Number should be not less than 25");
			
		}
		else
		{
			System.out.println("The range is valid");
			
		}
		
	}
	
	public static void m2() throws Exception
	{
		String text="12345";
		
		boolean isOnlynumpresent=Arrays.stream(text.split(""))
		.allMatch(ch->Character.isDigit(ch.charAt(0)));
		if(!isOnlynumpresent)
		{
			throw new Exception("Only numeric values are allowed");
			
		}
		else
		{
			System.out.println("All are digits");
		}
		
		
		
		
	}

	public static void main(String[] args) throws Exception
	{
		Throw t=new Throw();
		//t.m1(20);
		t.m2();
		

	}

}
