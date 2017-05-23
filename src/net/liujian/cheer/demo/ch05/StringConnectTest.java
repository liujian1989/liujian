package net.liujian.cheer.demo.ch05;

public class StringConnectTest {
	public static void main(String[] args){
		String str1 = "China,";
		String str2 = "I Love you";
		Demo demo = new Demo();
		String str3 = str1+ str2 + 0 + " " + 0.0d + "" + demo;
		System.out.println(str3);
		
		String a ="caresasadfasdfcares";
		String b = "a"+"b";  // 3�� String
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.length());
		System.out.println(b.length());
		a ="ares";
		System.out.println(b.indexOf(a));
		
		/**
		 * int length()  //�����ַ����ĳ���
int indexOf(String substr) //���ַ�����ʼ��λ�ã���0��ʼ
int lastIndexOf(String substr) //���ַ������һ�γ��ֿ�ʼ��λ�ã���0��ʼ

char charAt(int index��//����ָ���±���ַ�����0��ʼ

		 */
		
		
		String value="hello world";
		System.out.println(value.replace("lo","yo"));
		
		
		
		
	}
}

class Demo{
	public String toString(){
		return "demo";
	}
}
