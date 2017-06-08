package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai;

public class A {
	public A(){
		System.out.println("A....");
	}
	public void method(){
		System.out.println("method....");
	}
 static  class B extends A{
    	public B(){
    		System.out.println("B....");
    	}
    	public void method(){
    		super.method();   //调用父类方法
    		System.out.println("B method....");
    }
	public  static void main(String[] args) {
		B b=new B();   //子类构建对象，先构建父类后构建子类
		b.method();   //方法调用 永远是先在子类中找 没有的话就去父类中找
    }
    }
}
