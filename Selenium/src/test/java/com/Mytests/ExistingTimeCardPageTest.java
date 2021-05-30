package com.Mytests;

import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.ExistingTimeCardPage;
import com.mypages.HomePage;
import com.mypages.LoginPage;
import com.mypages.TimeandAbsences;

public class ExistingTimeCardPageTest extends BaseTest {
	
	HomePage hp=null;
	TimeandAbsences ta=null;
	ExistingTimeCardPage etp=null;
	@Test
	public void selectDateTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException
	{
		etp=page.getInstance(ExistingTimeCardPage.class);
		ta=page.getInstance(TimeandAbsences.class);
		hp=page.getInstance(LoginPage.class).doLogin();
		hp.selectOptions("Time and Absences");
		ta.selectOptionfromTimeandAbsence("Existing Time Cards");
		etp.clickAddbutton();
		etp.SelectDatefromcalendar();
		
		
		
		
		
	}

}
