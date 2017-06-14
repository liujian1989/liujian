package net.liujian.cheer.demo.ch18;

public class MyFirstRunableTest {

	public static void main(String[] args) {
		for (int i=0;i<10;i++){
			new Thread(new MyFirstRunableTest);
		}
	}

}

class MyFirstRunable implements Runable {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("This is " + getClass().getName());
		} catch (InterputException e) {
			e.
		}
	}
}