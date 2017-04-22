package net.liujian.cheer.exercise.ch05;

public class Test503 {

	public static void main(String[] args) {
		String regex = "1[35]\\d{9}";
		String text = "15345322466";
		if (text.matches(regex)) {
			System.out.println(text + "是合法的手机号");
		}
	}
}
