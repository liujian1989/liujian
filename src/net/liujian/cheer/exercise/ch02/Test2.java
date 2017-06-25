package net.liujian.cheer.exercise.ch02;


public class Test2 {
    public static String name = "С��"; 
    public static int age ;
    static { age = 23; 
    System.out.println("��ʼ��age");
    }
    public static String address ;
    static {
    	address = "����";
    	age =36;
    }
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(name);
		System.out.println(address);
	}

}
