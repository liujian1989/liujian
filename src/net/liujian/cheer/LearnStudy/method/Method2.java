package net.liujian.cheer.LearnStudy.method;

public class Method2 {

	
	static float add(float f,float f1){
		f=f+f1;
		return f;//结束方法的意思   要把f值返回到调用的地方
	}
	static void method(int age){
		if (age>=18){
			
			System.out.println("可以参加运动会！");
		}else{
			return;//结束后面不能写代码了
	
		}
		System.out.print("报名参加运动会！");
		
		
	}
	
	static void method1(float m,boolean h,boolean c){
		if (m<1000000||h==false||c==false){
			System.out.println("拜拜！");
			return;
		}
		System.out.println("可以参加！");
		System.out.println("好的！");
		System.out.println("很棒！");
	}
	
	
	
	
	//return 有两种用法1、用来返回值  2、结束方法（无返回值的方法中也可以使用）
	
	
	public static void main(String[] args) {
		
		method1(1500000,true,true);
		
		//method(1);		
		
		
	    // System.out.println( add(12,34.5F));
	}

}
