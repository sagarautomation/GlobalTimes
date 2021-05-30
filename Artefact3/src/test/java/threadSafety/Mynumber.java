package threadSafety;

import java.util.Random;

public class Mynumber implements Runnable
{
	/*Thread local class is used to provide thread safety
	 When multiple threads are accessing same piece of code then the two threads cannot see
	 each other thread local variables 
	 In this example two threads execute the run() method and set
	 different value on Thread local instance
	 A single instance of ThreadLocal can store different values for each thread independently. 
	 Therefore, the value stored in a ThreadLocal instance is specific (local) to the current running thread 
	 and any other code logic running on the same thread will see the same value, but not the values set on the 
	 same instance by other threads.
	 (There are exceptions, like InheritableThreadLocal, which inherits its parent thread’s values by default.)
	 */
	
	
    //private ThreadLocal<String> myno = new ThreadLocal<String>();  
	
	//setting the initial value...
	private ThreadLocal<String>myno=new ThreadLocal<String>() {
		@Override protected String initialValue() {
	        return String.valueOf(System.currentTimeMillis());
	    }	
	};
	@Override
	public void run()
	{
		//myno.set("0");
		m1();
		try {
			display();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void m1()
	{
		System.out.println(Thread.currentThread().getId()+"---->Before registering value of myno----"+myno.get());
		System.out.println(Thread.currentThread().getId()+"-------->Registering------");
		//myno=Thread.currentThread().getId()+"++"+new Random().nextInt();
		myno.set(Thread.currentThread().getId()+"++"+new Random().nextInt());
		System.out.println(Thread.currentThread().getId()+"--->After reg value is---->"+myno.get());
		
	}
	
	public void display() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("For"+Thread.currentThread().getId()+"myno is------>"+myno.get());
		
	}

}
