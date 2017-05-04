package net.liujian.cheer.sample.ch08;

public class Charac {

	public static void main(String[] args) {
		String str = Integer.toString(123);
		String str2 = Integer.toBinaryString(123);
		String str3 = Integer.toHexString(123);
		String str4 = Integer.toOctalString(123);
        System.out.println("'123'的十进制表示为: "+str);
        System.out.println("'123'的二进制表示为: "+str2);
        System.out.println("'123'的十六进制表示为: "+str3);
        System.out.println("'123'的八进制表示为: "+str4);
	}

}
