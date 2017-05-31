package net.liujian.cheer.sample.ch12;

public class MyException1 extends Exception { // 创建自定义异常类继承Exception类
	String message; // 定义String类型变量
	public MyException1(String ErrorMessage){  //父类方法
		message=ErrorMessage;
	}
	public String getMessage(){                 //覆盖getMessage()方法
		return message;
	}
	public static void main(String[] args) {
		System.out.println("message");

	}

}
