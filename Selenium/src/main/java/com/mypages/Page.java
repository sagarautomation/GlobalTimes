package com.mypages;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;  


public abstract class Page 
{
	//   https://ehec.login.em2.oraclecloud.com/
	WebDriver driver;
	WebDriverWait wait;
	public Page(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
	}
	
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement  getElement(By locator);
	public abstract List<WebElement> getElements(By locator);
	public abstract void waitforElementPresent(By locator);
	public abstract void checkifElementDisplayed(By locator);
	public abstract void waitforPageTitle(String title);
	public abstract void doSendkeys(By locator);
	public abstract void doSendkeys(By locator,String contents);
	public abstract void doClick(By locator);
	public abstract By getByFromElement(WebElement element);
	
	
	public<TPage extends BasePage> TPage getInstance(Class<TPage>pageClass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		
		
	}

	


	
	
	

}
