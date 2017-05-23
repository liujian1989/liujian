package net.liujian.cheer.demo.ch07;

public class ObjectRefTest {

	public static void main(String[] args) {
	
		RefObject a= new RefObject ();
		a.setValue(101);
		RefObject b=a;
		b.setValue(101);
		System.out.println(a.getValue());
	}

}
   class RefObject{
	   private int value;
	   public int getValue() {
			return value;
		}

	   public void setValue(int value) {
			this.value = value;
		}
   }