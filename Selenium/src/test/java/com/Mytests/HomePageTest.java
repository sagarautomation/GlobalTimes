package com.Mytests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class HomePageTest extends BaseTest
{
	HomePage hp=null;
	@Test
	public void selectOptionsTest()
	{
		try {
		hp=page.getInstance(LoginPage.class).doLogin();
		hp.selectOptions("Time and Absences");
		//Assert.assertEquals("Time and Absences",);
		
		}
		catch(Exception e)
		{
			
		}
		
	}
	

}
