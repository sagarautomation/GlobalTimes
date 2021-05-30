package listeners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {
	
	@BeforeClass
	public void setUp() {
		System.out.println("Before class A");
	}

	@Test(priority=3, groups={"smoke"} )
	public void testcase1() {
		System.out.println("A test one - priority 3");
	}
	
	@Test(priority=2, groups={"regression"})
	public void testcase2() {
		System.out.println("A - test two - priority 2");
	}

	@Test(priority=1, groups="smoke")
	public void testcase3() {
		System.out.println("A test three - priority 1");
	}

	@Test(priority=2, groups="UI")
	public void testcase4() {
		System.out.println("A test four - priority 2");
	}
	
	@Test(priority=2, groups={"regression"})
	public void testcase5() {
		System.out.println("A - test five - priority 2");
	}
	
	@Test(priority=2, groups={"regression"})
	public void testcase6() {
		System.out.println("A - test six - priority 2");
	}
	


}
