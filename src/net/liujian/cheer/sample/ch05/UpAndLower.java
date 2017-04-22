package net.liujian.cheer.sample.ch05;

public class UpAndLower {

	public static void main(String[] args) {
		String str = new String("abc DEF");
		String newstr = str.toLowerCase();//实现小写转换方法toLowerCase()
		String newstr2 = str.toUpperCase();//实现小写转换方法toUpperCase()
		System.out.println(newstr);
		System.out.println(newstr2);
		String str1 = new String("dryu hUtKiO");
		String newstr3 = str1.toLowerCase();
		String newstr4 = str1.toUpperCase();
		System.out.println(newstr3);
		System.out.println(newstr4);

	}

}
