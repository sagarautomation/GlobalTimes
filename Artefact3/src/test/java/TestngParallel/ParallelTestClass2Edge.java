package TestngParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTestClass2Edge {
	
	public WebDriver driver;
	 
	 @BeforeTest
	 public void beforeTest() {
	 System.out.println("Initilizing the  Edge Driver");
	 System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/Drivers/msedgedriver.exe"); 
	 driver = new EdgeDriver();
	 }
	 @Test
	 public void EdgeTestMethod()
	 { 
	 
	   //Initialize the chrome driver
	 System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
	   driver.get("https://www.google.com"); 
	   driver.findElement(By.name("q")).sendKeys("Global Times",Keys.ENTER);
	 
	}
	 
	 @AfterTest
	 public void afterTest() {
	 System.out.println("Closing the browser ");
	 //driver.close();
	 }


}
