package parallel;

public class Mynumbertest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Mynumber mn=new Mynumber();
		Thread t1=new Thread(mn);
		Thread t2=new Thread(mn);
		t1.start();
		Thread.sleep(2000);
		t2.start();

		
		

	}

}
