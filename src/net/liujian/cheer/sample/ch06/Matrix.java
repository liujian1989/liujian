package net.liujian.cheer.sample.ch06;

public class Matrix {

	public static void main(String[] args) {
	int a[][] = new int[3][4];
	for (int i = 0 ;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	}

}