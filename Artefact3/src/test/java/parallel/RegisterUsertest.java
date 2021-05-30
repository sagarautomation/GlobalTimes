package parallel;

public class RegisterUsertest {

	public static void main(String[] args) throws InterruptedException
	{
		Registeruser r=new Registeruser();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		Thread.sleep(2000);
		t2.start();


	}

}
