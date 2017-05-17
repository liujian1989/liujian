package net.liujian.cheer.LearnStudy.Gouzaoqi;

public class S1 {
	
	static {
	System.out.println("static......");  //静态初始化方法
	}
	static final String NAME="ABCD";///大写就是常量，fianl 修饰常量，不再赋值，属性常量
     S1 (){
    	 System.out.println("s1......");
    	 
     }
	public static void main(String[] args) {
		
	//final 最终的意思
		
		final String name ="abc";  //final 将变量变常量
		
		
		
		new S1();
		new S1();
		new S1();
		new S1();
	}

}
