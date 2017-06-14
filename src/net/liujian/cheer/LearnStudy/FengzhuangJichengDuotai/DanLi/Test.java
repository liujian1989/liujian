package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai.DanLi;

public class Test {
	private String name ="abc";
	private String address="2";
	private String type="3";
	public Test(){
		for (int i=0;i<10000;i++){
			name ="abc";
		}
	}
	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		for (int i=0;i<100000;i++){
		new Test();
	}
		System.out.println(System.currentTimeMillis()-time);
	}

}
