package net.liujian.cheer.demo.ch08;

public class EquailExcludeTest {

	public static void main(String[] args) {
		Integer i = 10000;
		Integer j = 10000;
		if (i.equals(j)){
			System.out.println("i equals j");
		}
		Integer a = 127;//小于127“==”可以被打印出来
		Integer b = 127;
		if (a==b){
			System.out.println("a == b");
		}
	}

}
