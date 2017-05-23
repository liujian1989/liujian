package net.liujian.cheer.javaBiJi.ch03;

public class RandomStop2 {

	public static void main(String[] args) {
		int number;
		do {
			number = (int) (Math.random() * 10);// 先随机产生0~9随机数
			System.out.println(number);
		} while (number != 5); // 再判断要不要重复循环
		System.out.println("I hit 5...Orz");
	}

}
