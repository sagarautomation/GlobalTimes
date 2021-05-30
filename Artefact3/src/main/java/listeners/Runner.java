package listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Runner {
	
	@BeforeSuite
	public void setUpsuite()
	{
		System.out.println("Before suite in runner");
	}
	
	@AfterSuite
	public void tearDownsuite()
	{
		System.out.println("After suite in runner");

	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Before method in runner");

	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("After method in runner");

	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");

	}
	@Test
	public void test3()
	{
		System.out.println("Test3");

	}
	
	

}
