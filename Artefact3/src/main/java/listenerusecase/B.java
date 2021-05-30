package listenerusecase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Setup");
	}
	
	@Test
	public void test4() {
		System.out.println("A test four");
	}
	
	@Test
	public void test5() {
		System.out.println("A test five");
	}
	
	@Test
	public void test6() {
		System.out.println("A test six");
	}
	
	
	@AfterMethod
	public void teardown() {
		System.out.println("Teardown");
	}


}
