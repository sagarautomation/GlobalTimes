package threadSafety;

public class Myatm implements Runnable {
	
	private static ThreadLocal<String>atm=new ThreadLocal<>() {
		
		@Override protected String initialValue() {
	        return "0";
	    }	
		
	};
	
	
	
	@Override
	public void run() {
		
	
		int total=100;
		String money=null;
		setMoney("1000");
		money=getMoney();
		System.out.println("Thread id is"+Thread.currentThread().getId()+"Money is"+money);
		total=total+Integer.parseInt(money);
		System.out.println("The total amount for"+Thread.currentThread().getId()+"is------>"+total);
		
		
		
	}
	
	public static String getMoney()
	{
		return atm.get();
		
	}
	
	public static void setMoney(String amount)
	{
	   atm.set(amount);
		
	}
	

	

	

}
