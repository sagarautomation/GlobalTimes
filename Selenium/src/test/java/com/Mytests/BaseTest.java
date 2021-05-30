package com.Mytests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

public class BaseTest {
	Page page;
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUp(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			
		}
		else
		{
			System.out.println("No browser is defined in XML file");
			
		}
		
		System.out.println("Before launching url");
		driver.get("https://ehec.login.em2.oraclecloud.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		System.out.println("URL launched");
		page=new BasePage(driver);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	

}
