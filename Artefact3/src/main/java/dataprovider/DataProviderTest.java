package dataprovider;

import org.apache.tools.ant.types.Assertions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class DataProviderTest {
	
	@Test(dataProvider="getData1")
	public void test1(String data)
	{
		System.out.println(data);
		
	}
	
	@Test(dataProvider="getData3",enabled=false)
	public void test2(Employee v1)
	{
		System.out.println(v1.getName()+v1.getProfile());
	}
	
	@DataProvider
	public String[]getData()
	{
		String[]a= {"sagar","sapkota","Automation"};
		return a;
		
	}
	
	
	
	@DataProvider
	public Object[] getData1()
	{
		return new Object[] {"sagar","Automation","labs"};
	}
	
	
	@DataProvider
	public Object[][] getData2()
	{
		return new Object[][] {{"sagar","Automation"},
			{"tom","devops"},
			{"mary","development"}};
	}
	
	
	@DataProvider
	public Employee[] getData3()
	{
		return new Employee[] {new Employee("sagar","Automation"),
				new Employee("Tom","Devops"),
				new Employee("Cruise","Cloud")};
	}
	
	
	}



