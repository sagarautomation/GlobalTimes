package fusion.timesheet;

import utilities.ExcelUtils;

public class SubmitTimeTest 
{
	public static void main(String[]args)
	{
		
		ExcelUtils ex=new ExcelUtils(System.getProperty("user.dir")+"/src/test/resources/TimeSheetAutomation.xlsx");
		System.out.println(ex.getRowValuesinList(1).get(0));
		System.out.println(ex.getRowValuesinList(1).get(6).toString().isEmpty());
		
		
		
		

		


	}
    
}
