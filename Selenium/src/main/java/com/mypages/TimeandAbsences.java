package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeandAbsences extends BasePage {
	
	private By header=By.xpath("//h1[contains(text(),'Time and Absences')]");
	private By existingtimecard=By.xpath("//span[contains(text(),'Existing Time Cards')]");
	private By addabsence=By.xpath("//span[contains(text(),'Add Absence')]");
	private By absenceBalance=By.xpath("//span[contains(text(),'Absence Balance')]");

	

	public WebElement getAddabsence() {
		return getElement(addabsence);
	}

	public WebElement getAbsenceBalance() {
		return getElement(absenceBalance);
	}

	public WebElement getExistingtimecard() {
		return getElement(existingtimecard);
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public TimeandAbsences(WebDriver driver) {
		super(driver);
	}
	
	
	public void selectOptionfromTimeandAbsence(String option)
	{
		
		switch(option)
		{
		case"Existing Time Cards":
		getExistingtimecard().click();
		break;
		case"Add Absence":
		getAddabsence().click();	
		break;
		case"Absence Balance":
		getAbsenceBalance().click();	
		break;
		
			
		}
		
	}
	
	public String TimeandAbsencePageheader()
	{
		return getPageHeader(header);
		
	}
	

}
