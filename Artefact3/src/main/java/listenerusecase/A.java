package listenerusecase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Setup");
	}
	
	@Test
	public void test1() {
		System.out.println("A test one");
	}
	
	@Test
	public void test2() {
		System.out.println("A test two");
	}
	
	@Test
	public void test3() {
		System.out.println("A test three");
	}
	
	
	@AfterMethod
	public void teardown() {
		System.out.println("Teardown");
	}

}
