package net.liujian.cheer.demo.ch10;

public class OverLoadTest {
  private int value ;
  private static double PI=3.14;
  public OverLoadTest(){
	  this(100); /// this.value =100;
  }
	public OverLoadTest(double d){
		System.out.println("new OverLoadTest()");
		this.value = (int) d;
	}
	public double caleCyc(double r){
		return 2*r*PI;
	}
	public double caleArea(double r){
		return r*r*PI;
	}
	
	public String toString(){
		return value+"";
	}
	
	
	public static void main(String[] args) {
		
		OverLoadTest test01 = new OverLoadTest();
		System.out.println(test01.caleCyc(10));
		System.out.println(test01.caleArea(10));
		OverLoadTest test02 = new OverLoadTest(3.1415926);
		System.out.println(test02.caleCyc(10));
		System.out.println(test02.caleArea(10));
	}

}
