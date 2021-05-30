package ArraysCollection;

import dataprovider.Employee;

public class Objectarray {
	
	public void m1()
	{
		Object[][] obj= {new Object[] {"sagar","suraj"},new Object[] {"suraj","Ramesh"}}; 
		System.out.println(obj[0][1]);
		
	}
	
	public Object[][] m2()
	{
		//Object[][] obj= {{"1","2","3"},{"4","5","6"},{"7,8,9"}};
		//System.out.println(obj[1][1]);
		return new Object[][] {{"sagar","Automation"},
			{"tom","devops"},
			{"mary","development"}};
	}
	
	public void m3()
	{
	   Object[][]empdata=Employee.empdata();
	}

	public static void main(String[] args) {
		
		Objectarray ob=new Objectarray();
		Object[][] data=ob.m2();
		System.out.println(data[1][0]);
	}

}
