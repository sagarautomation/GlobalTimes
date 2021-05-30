package parallel;

public class Friday implements Runnable {

	@Override
	public void run() {
		
		
		//some job or task....
		System.out.println("Thread id is"+Thread.currentThread().getId());
		System.out.println("hi..");
		System.out.println("hello");
		
		
	}

	

}
