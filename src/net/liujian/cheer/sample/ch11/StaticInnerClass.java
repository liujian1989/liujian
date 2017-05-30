package net.liujian.cheer.sample.ch11;

public class StaticInnerClass {
int x=100;
static class Inner{
	void doitInner(){
		//System.out.println("外部类"+x);//调用外部类的成员变量x
	}
}
	public static void main(String[] args) {
		System.out.println("a");

	}

}
