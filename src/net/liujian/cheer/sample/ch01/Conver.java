package net.liujian.cheer.sample.ch01;

public class Conver {

	public static void main(String[] args) {
	 byte mybyte = 127;
	 int myint = 150;
	 float myfloat = 452.65f;
	 char mychar = 10;
	 double mydouble = 45.46546;
	 System.out.println("byte����float�����ݽ�������Ľ��Ϊ:"+(mybyte+myfloat));
	 System.out.println("byte����int�����ݽ�������Ľ��Ϊ:"+mybyte*myint);
	 System.out.println("byte����char�����ݽ�������Ľ��Ϊ:"+(mybyte/mychar));
	 System.out.println("double����byte�����ݽ�������Ľ��Ϊ:"+(mydouble+mybyte));
	}

}
