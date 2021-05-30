package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HomePage extends BasePage{
	
	private By header=By.xpath("//h1[contains(text(),'Welcome')]");
	private By hamburger_icon=By.xpath("//a[@title='Navigator']");
	private By Me=By.cssSelector("div[class='navmenu-header x1a'][title='Me']");
	private By Myteam=By.cssSelector("div[class='navmenu-header x1a'][title='My Team']");
	private By Tools=By.cssSelector("div[class='navmenu-header x1a'][title='Tools']");
	private By MeChildlocators=By.xpath("//div[@id='pt1:_UISnvr:0:nvgpgl3_groupNode_my_information']//div//span");

	//pt1:_UISnvr:0:nvgpgl1_groupNode_my_information
	//pt1:_UISnvr:0:nvgpgl1_groupNode_manager_resources
	
	
	//pt1:_UIScmil2u::icon
	//pt1:_UISlg1
	//button[@id='Confirm']
	

	public WebElement getHamburger_icon() {
		return getElement(hamburger_icon);
	}



	public WebElement getMe() {
		return getElement(Me);
	}



	public WebElement getMyteam() {
		return getElement(Myteam);
	}



	public WebElement getTools() {
		return getElement(Tools);
	}



	public WebElement getHeader() {
		return getElement(header);
	}
	
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void expandHamburger()
	{
		getHamburger_icon().click();
	}
	
	public void expandMe()
	{
		getMe().click();
		
	}
	
	public void expandMyTeam()
	{
	  getMyteam().click();	
	}
	
	public void expandTools()
	{
	   getTools().click();	
	}
	
	public void selectOptions(String option)
	{
		expandHamburger(); 
		expandMe();
		System.out.println("invoking getelements()--");
		List<WebElement>elements=getElements(MeChildlocators);
		//using for loop
		/*for(WebElement el:elements)
		{
			System.out.println(el.toString());
			if(el.getText().equalsIgnoreCase(option))
			{
				el.click();
				break;
			}
			
		}*/
		
		//using java8...
		elements.stream().
		filter(el->el.getText().equalsIgnoreCase(option))
		.findFirst()
		.get()
		.click();
		
				
		
	}
	
	

}
