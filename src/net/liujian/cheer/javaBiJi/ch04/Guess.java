package net.liujian.cheer.javaBiJi.ch04;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //建立一个Scanner实例
		int number =(int)(Math.random()*10);
		int guess;
		do{
			System.out.print("猜数字(0~9): ");
			guess=scanner.nextInt();   //取得下一个整数
			
		}while(guess != number);
		System.out.println("猜中了...XD");
	}

}
