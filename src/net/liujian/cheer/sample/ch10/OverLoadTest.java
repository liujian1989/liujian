package net.liujian.cheer.sample.ch10;

public class OverLoadTest {
  public static int add(int a,int b){  //定义一个方法
	  return  a+b;
	  }
  public static int add(int a ){//定义与第一个方法参数个数不同的方法
	  return a;
  }
  public static int add(int a,double b){//定义一个成员方法
	  return 1;
  }
  //这个方法与前一个方法参数次序不同
  public static int add(double a,int b ){
	  return 1;
  }
	public static void main(String[] args) {
		System.out.println("调用 add(int ,int )方法: "+add(1,2));
		System.out.println("调用 add(double ,double )方法: "+ add((int)2.1,3.3));
		System.out.println("调用 add(int)方法: "+add(1));
	}

}
