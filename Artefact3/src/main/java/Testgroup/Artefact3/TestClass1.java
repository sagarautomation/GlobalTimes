package Testgroup.Artefact3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class TestClass1 
{
	
	//input[@id='Test']; //input[@id='{0}']
	//input[@id='Test1' and @name='Test2']
	//input[@id='{0}' and  @name='{1}']    
	private static String createXapth(String expression, Object ...value) {
		
		for(int i=0;i<value.length;i++)
		{
			expression=expression.replace("{"+i+"}", (CharSequence) value[i]).trim();
		}
		return expression;
	}
	
	public static void m1()
	{
		String s="sagar";
		s=s.replace('a', 'b');
		System.out.println(s);
		
		String s1="Su        raj";
		System.out.println(s1.substring(0, 2).stripLeading());
		
	}

	public static void main(String[]args)
	{
		By by=null;
		String webelement="[[ChromeDriver: chrome on WINDOWS (b1e26981c9591b54fee2c68844d84de6)] -> xpath: //table[@summary='Time Card Entries']//input]";
		

		String[]pathvariables=webelement.split("->")[1].replaceFirst("(?s)(.*)\\]","$1" + "").split(":");
		System.out.println(pathvariables[0]);
		System.out.println(pathvariables[0].trim());

		
		String selector=pathvariables[0].trim();
		String value=pathvariables[1].trim();
		
		switch(selector)
		{
		case "id":
			by=By.id(value);
			break;
			
		case "className":
			by=By.className(value);
			break;
		case "tagName":
			by=By.tagName(value);
			break;
			
		case "cssSelector":
			by=By.cssSelector(value);
			break;
			
		case "xpath":
			by=By.xpath(value);
			System.out.println(by.toString());
			break;
			
		case "linkText":
			by=By.linkText(value);
			break;	
			
		case "partialLinkText":
			by=By.partialLinkText(value);
			break;
			
		default:
			throw new IllegalStateException("locator"+selector+"not found");
					
		}

		
		
		String xpath1=TestClass1.createXapth("//input[@id='{0}']","Test4");
		System.out.println(xpath1);
		
		String xpath2=TestClass1.createXapth("//input[@id='{0}' and @name='{1}']","Test0","Test1");
		System.out.println(xpath2);
		TestClass1.m1();
		
		


		
	}

	
}
