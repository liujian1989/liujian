package net.liujian.cheer.javaBiJi.ch04;

public class Score {

	public static void main(String[] args) {
		int[] scores = { 88, 81, 74, 68, 78, 76, 77, 85, 95, 93 };
		for (int i = 0; i < scores.length; i++) {
			//System.out.println("学生分数: " + scores[i]);
			System.out.printf("学生分数: %d %n",scores[i]);
		}

	}

}
