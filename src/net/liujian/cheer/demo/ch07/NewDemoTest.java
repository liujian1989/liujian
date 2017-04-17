package net.liujian.cheer.demo.ch07;

public class NewDemoTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p);
		Child c=new Child();
		
	}
}
	class Parent{
		private int value=0;
		public Parent(){
			System.out.println("call Parent new method");
		}
		public Parent(int i){
			this.value=1;
		}
	}
	
	
	
	class Child extends Parent{
		public  Child (){
			System.out.println("call Child new method");
		}
		
	}
	class old extends Parent{
		public  old (){
			System.out.println("call old new method");
		}
	}
	
	
	
	

