package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	
	
	@Test(dataProvider="getData")
	public void test1(String username,String password,String fname,String lname)
	{
		System.out.println("username"+username+"password"+password+"fname"+fname);
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/excel/Testdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rownum=sh.getLastRowNum();
		int colnum=sh.getRow(0).getLastCellNum();
		Object[][]data=new Object[rownum][colnum];
		
		System.out.println("Rownum is"+rownum+"and Colnum is"+colnum);
		
		for(int i=1;i<=rownum;i++) //i=1 i<4  1 2 3
		{
			for(int j=0;j<colnum;j++) //j=0 j<4  0 1 2 3
			{
				data[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		
		
		return data;
	}

}
