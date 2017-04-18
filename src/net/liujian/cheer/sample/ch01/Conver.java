package net.liujian.cheer.sample.ch01;

public class Conver {

	public static void main(String[] args) {
	 byte mybyte = 127;
	 int myint = 150;
	 float myfloat = 452.65f;
	 char mychar = 10;
	 double mydouble = 45.46546;
	 System.out.println("byte型与float型数据进行运算的结果为:"+(mybyte+myfloat));
	 System.out.println("byte型与int型数据进行运算的结果为:"+mybyte*myint);
	 System.out.println("byte型与char型数据进行运算的结果为:"+(mybyte/mychar));
	 System.out.println("double型与byte型数据进行运算的结果为:"+(mydouble+mybyte));
	}

}
