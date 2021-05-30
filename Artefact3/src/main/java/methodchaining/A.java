package methodchaining;

public class A {
	
	public A  m1()
	{
		System.out.println("This is class A m1");
		return this;
	}
	
	public A  m2()
	{
		System.out.println("This is class A m2");

		return this;
	}
	
	public B m3()
	{
		return new B();
	}

}
