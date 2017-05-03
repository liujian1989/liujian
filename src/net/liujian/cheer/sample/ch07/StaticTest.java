package net.liujian.cheer.sample.ch07;
 public class  StaticTest{
final static double PI=3.1415;
    static int id;
     public static void method1(){
    	 //do Something
     }
     public void method2(){
    	 System.out.println(StaticTest.PI);
    	 System.out.println(StaticTest.id);
    	 StaticTest.method1();
     }
     }
