package com.Mytests;

import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import com.mypages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(enabled = false)
	public void verifyLoginpageTitletest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		String title=page.getInstance(LoginPage.class).getLoginpagetitle();
		System.out.println("Title is"+title);
		
		
	}
	
	@Test(priority  =2)
	public void doLoginTest()
	{
		try {
		page.getInstance(LoginPage.class).doLogin();
		
		}
		catch(Exception e)
		{
			
		}
		
	}

}
