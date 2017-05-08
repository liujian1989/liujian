package net.liujian.cheer.LearnStudy;

public class Method01 {
	
  static void hello(){     //定义一个方法，方法必须申请在class大括号中,申明方法 无返回值 无参数的方法
	  System.out.println("Hello Java Method !!");
	  System.out.println("你好       瓜娃     方法 !!");
  } 

  
  static void method(int a,int b){
	  System.out.println(a+b);	  
  }
  
  static void method1(int[] a){
	  
	  //for (int k:a){
		//  System.out.println(k);
	 // }
	  a[0]=10000;
  }
  static void method2(int i){  
	  i=10000; 
  }
  
  static void method3(int [] i){
	  i[0]=10000;
	  
  }
  //集合参数    
  
  
  static void method4(int...i){  //int...i就是简单的数组
	  for(int u:i){
		  System.out.println(u);
	  }
  }
  //static void method4(int...i,int...i){} 是错误的
  //static void method4(int...i,int y,int k){} 是错误的
  //static void method4(int y,int k,int...i){} 是正确的，集合参数只能跟在数组后面
  	
  
  static int method5(){
	  
	  
	  return (int)60f;//返回值	  return后面不能写代码
  }
  static int add(int a,int b){
	  
	  return a+b;
  }
  
  public static void main(String[] args) {
	 // int sum=add(50，60);
	  int sum=add(50,add(50,add(50,add(50,add(50,add(50,60))))));//嵌套调用
  		System.out.println(sum);
  		//int y=method5();
  		//System.out.println(y);
  		
  	//	method4(1,2,34,5,25,52,5,25,25,2,5,56,6);
  	/*	int[]i={100};
  		int[] k=i;//除基本数据类型以外，所有的赋值都是给地址
  		method3(k);
  		System.out.println(i[0]);*/
  		
  		
  		
  		
		/*int[] i={123};
		method1(i);
		System.out.println(i[0]);//10000
		int k =0;
		method2(k);//除基本数据类型按值传递，别的类型均按地址传递
		System.out.println(k);//0
		*/
  		//int[] i={123,131,214,1244,1355,14,56,26464,3354};
  		
  		//method1(i);
  		//System.out.println(i[0]);
  		
		//method(50,60);
		//int u=100;
		//short k=90;//自动转型 从小到大自动的
		//long k=90;
		//method(u,(int)k);//强制类型转换
		
		//hello();  //调用hello方法，写方法名+（）  方法的调用

	}

}
