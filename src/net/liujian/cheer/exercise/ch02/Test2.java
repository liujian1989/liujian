package net.liujian.cheer.exercise.ch02;

public class Test2 {
    public static String name = "小王"; 
    public static int age ;
    static { age = 23; 
    System.out.println("初始化age");
    }
    public static String address ;
    static {
    	address = "苏州";
    	age =36;
    }
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(name);
		System.out.println(address);
	}

}
