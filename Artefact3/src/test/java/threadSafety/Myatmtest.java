package threadSafety;

public class Myatmtest {
	
	public static void main(String[] args) throws InterruptedException 
	{
		Myatm mn=new Myatm();
		Thread t1=new Thread(mn);
		Thread t2=new Thread(mn);
		t1.start();
		t2.start();

		

	}
	

}
