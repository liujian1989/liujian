package net.liujian.cheer.LearnStudy.Gouzaoqi;

public class T3 {

     public static void  main (String[] args){
    	 //System.out.println (A.NAME);//静态常量和类不在一个内存范围内
    	// System.out.println (A.address);
    	// A a;//只是声明 没有用处 不会促使这个类加载起来
    	 //A.method();//会加载类
    	// Class.forName("Gouzaoqi.A"); //就是加载类
    	 new A();//new 对象 肯定会把类加载起来
     }

}
