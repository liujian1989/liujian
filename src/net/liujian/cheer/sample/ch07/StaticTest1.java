package net.liujian.cheer.sample.ch07;

public class StaticTest1 {
static double PI = 3.1415;
static int id;
public static void method1(){
	// do something 
}
public void method2(){
	System.out.println(StaticTest1.PI);
	System.out.println(StaticTest1.id);
	StaticTest1.method1();
}
	}


