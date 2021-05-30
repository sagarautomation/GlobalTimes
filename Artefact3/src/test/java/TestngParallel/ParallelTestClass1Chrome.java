package TestngParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTestClass1Chrome {
	
	
	public  WebDriver driver;
	 
	 @BeforeTest
	 public void beforeTest() {
	 System.out.println("Initilizing the Google Chrome Driver");
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe"); 
	 driver = new ChromeDriver();
	 }
	 @Test
	 public void ChromeTestMethod()
	 { 
	 
	   //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	   driver.get("https://www.google.com"); 
	   driver.findElement(By.name("q")).sendKeys("Global Times",Keys.ENTER);
	 
	}
	 
	 @AfterTest
	 public void afterTest() {
	 System.out.println("Closing the browser ");
	 //driver.close();
	 }

}
