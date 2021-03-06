package listenerusecase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static ArrayList<LinkedHashMap> readData() throws IOException
	{
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/excel/AutomationSheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		//System.out.println(sh.getLastRowNum());
		ArrayList<LinkedHashMap>ls=new ArrayList<>();
		for(int i=1;i<=sh.getLastRowNum();i++) //1<=6
		{
			LinkedHashMap<String, String>hm=new LinkedHashMap<>(); 
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
			{
				
				hm.put(sh.getRow(0).getCell(j).getStringCellValue(), sh.getRow(i).getCell(j).getStringCellValue());
				
				
			}
			
			  ls.add(hm);
			
		}
		
		//System.out.println(ls);
		
		for(Map<String,String> eachmap:ls)
		{
			//System.out.println(eachmap);
		}
		return ls;
		
	}
	
	public static void main(String[]args) throws IOException
	{
		ExcelReader.readData();	
	}

}
