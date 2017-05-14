package net.liujian.cheer.demo.ch11;

public class InnerClass {
	private int value;
	private void process(){
		System.out.println("Call process!");
		
		
		
	}
	class InnerClassTest{
		public InnerClassTest(){
			value =101;
			process();
		}
		
		
		
	}
	public void processInnerClassTest(){
		
	}
	 
	public static void main(String[] args) {
	
	}

}
