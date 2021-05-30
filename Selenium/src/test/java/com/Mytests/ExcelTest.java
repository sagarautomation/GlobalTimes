package com.Mytests;

import utilities.ExcelUtils;

public class ExcelTest {

	public static void main(String[] args) {
		ExcelUtils ex=new ExcelUtils(System.getProperty("user.dir")+"/src/test/resources/TimeSheetAutomation.xlsx");
		ex.selectSheet("StartStopTime");
		ex.getRowValuesinList(1).stream()
		.forEach(val->System.out.println(val.toString()));;

	}

}
