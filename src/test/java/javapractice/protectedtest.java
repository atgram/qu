package javapractice;

public class protectedtest {

	public void method() {}
	public void method1() {}
	public void method2() {}
	
	public static void main(String[] args) {
		
		protectedtest a = new protectedtest();
		
		a.method();
		a.method1();
		a.method2();



	}

}
