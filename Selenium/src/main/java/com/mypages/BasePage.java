package com.mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page 
{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
		element= driver.findElement(locator);
		System.out.println(element.toString());
		}
		catch(Exception e)
		{
			System.out.println("Some error occured while creating element"+locator.toString());
			e.printStackTrace();
		}
		return element;
		
	}
	
	
	@Override
	public List<WebElement> getElements(By locator)
	{
		List<WebElement>elements=null;
		try {
		elements=driver.findElements(locator);
		System.out.println(elements.toString());
		
		}
		catch(Exception e)
		{
			System.out.println("Some error occured while creating element"+locator.toString());
			e.printStackTrace();
		}
		return elements;
	}

	@Override
	public void waitforElementPresent(By locator) {
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e)
		{
			System.out.println("some error occured while while for element"+locator.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitforPageTitle(String title) {
		try {
		wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			System.out.println("some error occured while getting the title of page"+title);
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void checkifElementDisplayed(By locator)
	{
		
	}

	@Override
	public void doSendkeys(By locator) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].value='Persistent@12345';", getElement(locator));

	}

	@Override
	public void doClick(By locator) {
		
		getElement(locator).click();
	}

	@Override
	public void doSendkeys(By locator, String content) {
		
		Actions ac=new Actions(driver);
		ac.sendKeys(getElement(locator), content);
		
	}

	@Override
	public By getByFromElement(WebElement element) {
		By by=null;
		String pathvariables[]=element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "").split(":");
		String selector=pathvariables[0].trim();
		String value=pathvariables[1].trim();
		//System.out.println("selector"+selector+"       "+"value"+value);
		switch(selector)
		{
		case "id":
			by=By.id(value);
			break;
			
		case "className":
			by=By.className(value);
			break;
		case "tagName":
			by=By.tagName(value);
			break;
			
		case "cssSelector":
			by=By.cssSelector(value);
			break;
			
		case "xpath":
			by=By.xpath(value);
			break;
			
		case "linkText":
			by=By.linkText(value);
			break;	
			
		case "partialLinkText":
			by=By.partialLinkText(value);
			break;
			
		default:
			throw new IllegalStateException("locator"+selector+"not found");
					
		}
		
		return by;
	}

	

		
		
		
	

}
