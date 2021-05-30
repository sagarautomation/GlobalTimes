package objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Fusionlocators 
{
	@FindBy(how = How.XPATH, using = "//button[@id='ssoBtn']")
	 
	 private static WebElement ssolink;	
	
	
	@FindBy(how = How.XPATH, using ="//a[@title='Navigator']")
	 
	 private static WebElement hamburger_icon;


	public static WebElement getSsolink() {
		return ssolink;
	}


	public static void setSsolink(WebElement ssolink) {
		Fusionlocators.ssolink = ssolink;
	}


	public static WebElement getHamburger_icon() {
		return hamburger_icon;
	}


	public static void setHamburger_icon(WebElement hamburger_icon) {
		Fusionlocators.hamburger_icon = hamburger_icon;
	}
	
	

}
