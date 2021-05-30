package com.Mytests;

import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import com.mypages.TimeandAbsences;

public class TimeandAbsenceTest extends BaseTest {
	
	HomePage hp=null;
	TimeandAbsences ta=null;
	@Test
	public void selectOptionsTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		ta=page.getInstance(TimeandAbsences.class);
		hp=page.getInstance(LoginPage.class).doLogin();
		hp.selectOptions("Time and Absences");
		String actual_header=ta.TimeandAbsencePageheader();
		System.out.println("Actual Header---->"+actual_header);
		Assert.assertEquals(actual_header, "Time and Absences");
		ta.selectOptionfromTimeandAbsence("Existing Time Cards");
		
		
		
	}

}
