package net.liujian.cheer.demo.ch07;
import java.util.Arrays;

public class StaticTest {

	public static int count =0;
	private static double PI;
	
	public StaticTest(){
		System.out.println("new StaticTest called.");
		 count ++;
	}
	public static void main(String[] args){
       StaticTest.PI = 3.14;
		
		StaticTest t = new StaticTest();
		
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		System.out.println("count new method call " +StaticTest.count+ " times ");
		}
	}


