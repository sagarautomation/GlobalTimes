package dataprovider;

public class Employee {
	
	public String name,profile;
	public Employee(String name,String profile) 
	{
		this.name=name;
		this.profile=profile;
		
	}
	
	public static Object[][]empdata()
	{
		return new Object[][] {{new Employee("Sagar","Automation")},
			{new Employee("Tom","Devops")},
			{new Employee("Peter","Cloud")}
			};
		
	}

	public String getName() {
		return name;
	}

	public String getProfile() {
		return profile;
	}

}


