package net.liujian.cheer.javaBiJi.ch04;

class Clothes2 {
	String color;
	char size;

	Clothes2(String color, char size) { // 定义构造函数
		this.color = color; // color参数的值指定给这个对象的color成员
		this.size = size;
	}
}

public class Field2 {

	public static void main(String[] args) {
		Clothes2 sun = new Clothes2("read", 'S'); // 使用指定构造函数建立对象
		Clothes2 spring = new Clothes2("green", 'M');
		//System.out.printf("sun(%s,%c)%n", sun.color, sun.size);
		//System.out.printf("sun(%s,%c)%n", spring.color, spring.size);
		System.out.println("sun"+"("+sun.color +" "+ sun.size+")");
		System.out.println("spring"+"("+spring.color +" "+ spring.size+")");
	}

}
