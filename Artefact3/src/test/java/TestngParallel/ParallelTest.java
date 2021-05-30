package TestngParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	//public WebDriver driver;
	ThreadLocal<WebDriver>driver=new ThreadLocal<WebDriver>();
	 @Test
	  public void EdgeTest() { 
		 
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/Drivers/msedgedriver.exe"); 
//	   driver. = new EdgeDriver();  
//	   driver.get("https://www.google.com"); 
//	   driver.findElement(By.name("q")).sendKeys("Global Times",Keys.ENTER);
//	   driver.quit();
	   
	   driver.set(new EdgeDriver());
	   driver.get().get("https://www.google.com");
	   driver.get().findElement(By.name("q")).sendKeys("Global Times",Keys.ENTER);
	   //driver.get().quit();
	 
	  }
	 
	    @Test
	 public void ChromeTest()
	 { 
	 
	   //Initialize the chrome driver
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe"); 

//	   driver = new ChromeDriver();
//	   driver.get("https://www.google.com"); 
//	   driver.findElement(By.name("q")).sendKeys("Global Times",Keys.ENTER);
//	   driver.quit();
	   
	   driver.set(new ChromeDriver());
	   driver.get().get("https://www.google.com");
	   driver.get().findElement(By.name("q")).sendKeys("Global Times",Keys.ENTER);
	   //driver.get().quit();
	 
	 
	 }
  
}
