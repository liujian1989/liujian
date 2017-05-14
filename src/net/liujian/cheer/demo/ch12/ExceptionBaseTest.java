package net.liujian.cheer.demo.ch12;

public class ExceptionBaseTest {
	
	private static void a(){
	
		b();
	}
	private static void b(){
		c();
	}
	private static void c(){
		d();
	}
	
	private static void d() {
		
	}

	int i=10;
	int j=-1;
	try{
		 j=i/0;
		 a.charAt(0);
		
	}catch (ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	System.out.println(j);
	public static void main(String[] args) {
		
	    }
	
        }
}