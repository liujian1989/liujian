package net.liujian.cheer.javaBiJi.ch04;

public class IntegerDemo {

	public static void main(String[] args) {
		int data1 = 10;
		int data2 = 20;
		Integer wrapper1 = new Integer(data1); // 打包基本类型
		Integer wrapper2 = new Integer(data2);
		System.out.println(data1 / 3); // 基本类型运算
		System.out.println(wrapper1.doubleValue() / 3);// 操作打包器方法
		System.out.println(wrapper1.compareTo(wrapper2));
	}

}
