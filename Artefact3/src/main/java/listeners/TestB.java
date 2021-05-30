package listeners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {
	
	@BeforeClass
	public void setUp() {
		System.out.println("Before class B");
	}

	@Test(priority=3, groups="smoke")
	public void testcase1() {
		System.out.println("B test one - priority 3");
	}
	
	@Test(priority=2, groups="UI")
	public void testcase2() {
		System.out.println("B test two - priority 2");
	}

	@Test(priority=2, groups={"smoke", "regression"})
	public void testcase3() {
		System.out.println("B test three - priority 2");
	}

}
