package net.liujian.cheer.sample.ch08;

public class Charac {

	public static void main(String[] args) {
		String str = Integer.toString(123);
		String str2 = Integer.toBinaryString(123);
		String str3 = Integer.toHexString(123);
		String str4 = Integer.toOctalString(123);
        System.out.println("'123'��ʮ���Ʊ�ʾΪ: "+str);
        System.out.println("'123'�Ķ����Ʊ�ʾΪ: "+str2);
        System.out.println("'123'��ʮ�����Ʊ�ʾΪ: "+str3);
        System.out.println("'123'�İ˽��Ʊ�ʾΪ: "+str4);
	}

}
