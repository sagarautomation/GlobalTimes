package threadSafety;

public class Inheritablethread 
{
	/*Thread local instance store value/variables independently/separately so that when multiple threads
	 are accessing that value/variable then that variable is available to current running thread and not to other thread
	 .This way Thread safety is achieved and this in turn
	 avoid Data Inconsistency 
	 
	 
	Inheritable thread local grant access to value to thread and its child thread.
	 
	 */

	public static void main(String[] args) throws InterruptedException 
	{
		ThreadLocal<String>threadLocal=new ThreadLocal<String>();
		InheritableThreadLocal<String>inheritableThreadlocal=new InheritableThreadLocal<>();
		
		Thread t1=new Thread(()->{
			System.out.println("----Thread1----");
			threadLocal.set("Thread1-Threadlocal");
			inheritableThreadlocal.set("Thread1-inheritablethreadLocal");
			System.out.println(threadLocal.get());
			System.out.println(inheritableThreadlocal.get());
			Thread child=new Thread(()->
			{
				System.out.println("---Child thread----");
				System.out.println(threadLocal.get());
				System.out.println(inheritableThreadlocal.get());
				
			});
			
			child.start();
		});
		t1.start();
		Thread t2=new Thread(()->{
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
			}
			
			System.out.println("----Thread2----");
			System.out.println(threadLocal.get());
			System.out.println(inheritableThreadlocal.get());
		});
		
		t2.start();
		
		
		

	}

}
