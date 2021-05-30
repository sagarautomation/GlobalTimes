package com.mypages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DateUtils;
import utilities.ExcelUtils;

public class ExistingTimeCardPage extends BasePage {
	
	private By FromdateSelector=By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:qryId2:value00::glyph");
	private By TodateSelector=  By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:qryId2:value10::glyph");
	private By Month=By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:qryId2:value00::pop::cd::mSel::content");
	private By Year= By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:qryId2:value00::pop::cd::ys::content");
	private By Fromdatetextfield=By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:qryId2:value00::content']");
	private By Todatetextfield=  By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:qryId2:value10::content']");
	private By Createtimecard=By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:r1:0:r3:0:AP1:AT1:p2::content']");
	private By Createtimecard_Month=By.xpath("//select[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:r1:0:r3:0:AP1:AT1:r2:0:cd1::mSel::content']");
	private By Createtimecard_Year=By.xpath("//input[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:0:r1:0:r3:0:AP1:AT1:r2:0:cd1::ys::content']");
	private By Creatimecard_OKbutton=By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:AT1:d2::ok']");
	
	private By Addbutton=By.id("_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:AT1:_ATp:create::icon");
	private By Days=By.xpath("//table[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:AT1:r2:0:cd1::cg']//tr//td");
	private By startstopsfield=By.xpath("//table[@summary='Time Card Entries']//input");
	
	public void print()
	{
		System.out.println("Printing startstopfield"+startstopsfield.toString());
	}

	public WebElement getFromdateSelector() {
		return getElement(FromdateSelector);
	}

	public WebElement getTodateSelector() {
		return getElement(TodateSelector);
	}
	
	

	public WebElement getMonth() {
		return getElement(Month);
	}

	public WebElement getYear() {
		return getElement(Year);
	}
	
	
	
	public WebElement getFromdatetextfield() {
		return getElement(Fromdatetextfield);
	}

	public WebElement getTodatetextfield() {
		return getElement(Todatetextfield);
	}

	public WebElement getAddbutton() {
		return getElement(Addbutton);
	}
	public ExistingTimeCardPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public WebElement getCreatetimecard_Month() {
		return getElement(Createtimecard_Month);
	}

	public WebElement getCreatetimecard_Year() {
		return getElement(Createtimecard_Year);
	}
	
	
	public WebElement getCreatimecard_OKbutton() {
		return getElement(Creatimecard_OKbutton);
	}

	public void fillDate()
	{
		String fromdate,todate,formattedfromdate,formattedtodate=null;
		
		String pattern="dd-MMM-uuuu";
		ExcelUtils ex=new ExcelUtils(System.getProperty("user.dir")+"/src/test/resources/TimeSheetAutomation.xlsx");
		ex.getRowValuesinList(1).stream().forEach(val->System.out.println(val.toString()));
		fromdate=ex.getRowValuesinList(1).get(0).toString();
		todate=ex.getRowValuesinList(1).get(1).toString();
		formattedfromdate=DateUtils.formatDate(fromdate, pattern);
		formattedtodate=DateUtils.formatDate(todate, pattern);
		System.out.println(formattedfromdate);
		System.out.println(formattedtodate);
		getFromdatetextfield().sendKeys(formattedfromdate);
		getTodatetextfield().sendKeys(formattedtodate);
			
	}
	
	
	
	public void clickAddbutton()
	{
		waitforElementPresent(Addbutton);
		 doClick(Addbutton);
	}
	
	public void SelectDatefromcalendar() throws InterruptedException
	{
		
		//table[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:1:r1:0:r3:0:AP1:AT1:r2:0:cd1::cg']//tr//td[contains(text(),'8')]
		
		String fromdate,todate,formattedfromdate,formattedtodate=null;
		String pattern="d-MMMM-uuuu";
		ExcelUtils ex=new ExcelUtils(System.getProperty("user.dir")+"/src/test/resources/TimeSheetAutomation.xlsx");
		fromdate=ex.getRowValuesinList(1).get(0).toString();
		formattedfromdate=DateUtils.formatDate(fromdate, pattern);
		String day=formattedfromdate.split("-")[0]; //8
		
		//select day from Calendar.............
		getElements(Days).stream().
		filter(dy->dy.getText().equalsIgnoreCase(day)).findFirst().get().click();
		
		waitforElementPresent(Creatimecard_OKbutton);
		doClick(Creatimecard_OKbutton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ex.selectSheet("StartStopTime");
        ex.getRowValuesinList(1).
        stream().
        forEach(time->System.out.println(time.toString().replaceAll("\\s+", " ")));
        
         
         
       List<WebElement>startstops= getElements(startstopsfield);
       System.out.println("size is"+startstops.size());
       for( int i=0;i<=startstops.size()-1;i++)
       {
    	   By by=getByFromElement(startstops.get(i));
    	   System.out.println(by.toString());
    	   if(i==0||i==1)
    	   {
    		   continue;
    	   }
    	   else if(i==4||i==7||i==10||i==13||i==16||i==19||i==22)
    	   {
    		   try
    		   {
        	   startstops.get(i).click();
        	   Thread.sleep(2000);
    		   }
    		   catch(StaleElementReferenceException e)
    		   {
    			   getElement(getByFromElement(startstops.get(i))).click();
    		   }
    		   
    		   
    	   }
    	   else
    	   {
    		   try
    		   {
        	   startstops.get(i).sendKeys("07:30 AM");
        	   Thread.sleep(2000);
    		   }
    		   catch(StaleElementReferenceException e)
    		   {
    			   getElement(getByFromElement(startstops.get(i))).sendKeys("07:30 AM");;
    		   }

    		   
    	   }
    	   
    	   
       }
        
        
        
        
		
		

		
		
		
		
	}
	
	
	
	

	public void fillTimings()
	{
		/*10:00  AM-07:00  PM
		10:00  AM-07:00  PM
		10:00  AM-07:00  PM
		10:00  AM-07:00  PM
		10:00  AM-07:00  PM */
		
		List<WebElement>inputfields=getElements(startstopsfield);
		
		
		
	}

	

}
