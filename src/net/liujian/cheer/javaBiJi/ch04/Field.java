package net.liujian.cheer.javaBiJi.ch04;

class Clothes { // 定义Clothes类
	String color;
	char size;
}

public class Field {
	public static void main(String[] args) {
		Clothes sun = new Clothes();// 创建Clothes实例
		Clothes spring = new Clothes(); // 创建Clothes实例
		sun.color = "red"; // 为个别对象的数据成员指定值
		sun.size = 'S';
		spring.color = "green";
		spring.size = 'M';
		/*
		 * System.out.println(sun.size,); System.out.println(sun.color);
		 * System.out.println(spring.color); System.out.println(spring.size);
		 */
		System.out.printf("sun(%s,%c)%n", sun.color, sun.size);
		System.out.printf("sun(%s,%c)%n", spring.color, spring.size);
	}

}
