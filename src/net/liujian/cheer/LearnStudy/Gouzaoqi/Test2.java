package net.liujian.cheer.LearnStudy.Gouzaoqi;

public class Test2 {

	String name;
	static String type;
	
	void method(){
		name ="张三";
		System.out.println(name);
		type ="大班长";    //实例成员可以对静态和实例的产生访问
				
	}
	
	static void method1(){  //静态成员只能访问静态的
		type="三好学生";
		//name="张三"; 在静态的环境中找不到实例的成员
	}
	   void setName (String name){
		   this.name=name;
	   }	
	
public static void main(String[] args){
	Test2 a=new Test2();
	a.setName("a");
	Test2 旺财=new Test2();
	旺财.setName("公狗");
	System.out.println(a.name);
	System.out.println(旺财.name);
	
}
   
}