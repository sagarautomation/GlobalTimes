package parallel;

public class Fridaytest {

	public static void main(String[] args) throws InterruptedException {
		Friday f=new Friday();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		t1.start();//id thread id
		Thread.sleep(2000);
		t2.start();

	}

}
