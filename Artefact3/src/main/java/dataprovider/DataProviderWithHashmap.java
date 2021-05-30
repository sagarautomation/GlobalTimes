package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithHashmap {
	
	
	@Test(dataProvider="getData")
	public void test1(HashMap data)
	{
		
		System.out.println(data.get("Username"));
		
		
	}
	
	@DataProvider
	public Object[] getData() throws IOException
	{
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/excel/Testdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet2");
		int rownum=sh.getLastRowNum();
		int colnum=sh.getRow(0).getLastCellNum();
		Object[]data=new Object[rownum];
		
		//1st iteration
		//map--key and value---
		
		System.out.println("Rownum is"+rownum+"and Colnum is"+colnum);
		
		for(int i=1;i<=rownum;i++) //i=1 i<4  1 2 3
		{
			HashMap map = new HashMap();
			for(int j=0;j<colnum;j++) //j=0 j<4  0 1 2 3
			{
				String key=sh.getRow(0).getCell(j).getStringCellValue();
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				
				
			}
			
			data[i-1]=map;
		}
		
		
		return data ;
	}

}
