package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai.A1;

public class B extends A1 {
//public B(){
		//super("");  //声明我使用哪个构造器构造对象
		public B(String name ){
			super(name);
	System.out.println("B.....");
	}
	public void method(){
		super.method();
		System.out.println("method.....");
	}
}
