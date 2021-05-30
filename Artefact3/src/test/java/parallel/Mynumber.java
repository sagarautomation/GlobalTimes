package parallel;

import java.util.Random;

public class Mynumber implements Runnable
{
	String myno="0";
	//myno+Threadid+randomno.

	@Override
	public void run() 
	{
		m1();
		
		try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void m1()
	{
		System.out.println(Thread.currentThread().getId()+"---->Before registering value of myno----"+myno);
		System.out.println(Thread.currentThread().getId()+"-------->Registering------");
		myno=Thread.currentThread().getId()+"++"+new Random().nextInt();  
		System.out.println(Thread.currentThread().getId()+"--->After reg value is---->"+myno);
		
	}
	
	public void display() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("For"+Thread.currentThread().getId()+"myno is------>"+myno);
		
	}
	

}
