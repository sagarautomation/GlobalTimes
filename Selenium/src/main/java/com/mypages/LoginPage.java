package com.mypages;

import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By sign_on=By.xpath("//button[@id='ssoBtn']");
	private By login_interface=By.cssSelector("div.lightbox-cover");
	private By user_name=By.id("i0116");
	private By pwd=By.id("passwordInput");
	private By next_button=By.xpath("//input[@type='submit']");
	private By sign_in=By.id("submitButton");
	
	
	public WebElement getNo() {
		return getElement(no);
	}

	private By no=By.id("idBtn_Back");
	

	
	public WebElement getSign_in() {
		return getElement(sign_in);
	}



	public WebElement getUser_name() {
		return getElement(user_name);
	}



	public WebElement getPwd() {
		return getElement(pwd);
	}

	
	public WebElement getNext_button() {
		return getElement(next_button);
	}



	
	public WebElement getSign_on() {
		return getElement(sign_on);
	}
	
	
	
	public WebElement getLogin_interface() {
		return getElement(login_interface);
	}


	public String getLoginpagetitle()
	{
		return getPageTitle();
	}
	
	public HomePage doLogin() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
 
		    getSign_on().click();
			getUser_name().sendKeys("sagar_sapkota@persistent.com");
			getNext_button().click();
			System.out.println(getElement(pwd).isDisplayed());
			wait.until(ExpectedConditions.visibilityOfElementLocated(pwd));
			doSendkeys(pwd);
			getSign_in().click();
			getNo().click();
		    return getInstance(HomePage.class);
		
	}

	

}
