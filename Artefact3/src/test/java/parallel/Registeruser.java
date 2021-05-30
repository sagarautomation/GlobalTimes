package parallel;

import java.util.Random;

//drawback of using global variable or static varuable while running test case in paralell....

public class Registeruser implements Runnable
{
	String registeredusername="No Value";   // 13 salma123 salma123   //hussein123
	@Override
	public void run() 
	{
		createuser(); //13 salma123
		
		try {
			display(); //salma123
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void createuser()
	{
		System.out.println(Thread.currentThread().getId()+"-->"+"Before starting registration value of registeredusername is"+Thread.currentThread().getId()+registeredusername);
		System.out.println(Thread.currentThread().getId()+"---->"+"Registering a user");
		registeredusername=Thread.currentThread().getId()+"-User"+new Random().nextInt();//salma123
		System.out.println(Thread.currentThread().getId()+"--->"+"After registration value is"+Thread.currentThread().getId()+registeredusername);
		
	}
	
	//retreiving the registered user...
	public void display() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getId()+"After some delay"+"value is"+registeredusername);
		
		
	}


	

	
}
