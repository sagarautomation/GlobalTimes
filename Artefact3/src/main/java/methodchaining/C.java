package methodchaining;

public class C {

	public static void main(String[] args) {
		A a=new A();
		B ref=a.m1().m2().m3();
		//ref.x();

	}

}
