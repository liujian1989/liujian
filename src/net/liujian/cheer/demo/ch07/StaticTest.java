package net.liujian.cheer.demo.ch07;

public class StaticTest {

	public static int count =0;
	
	public StaticTest(){
		System.out.println("new StaticTest called.");
		 count ++;
	}
	public static void main(String[] args){
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		t = new StaticTest();
		}
	}


