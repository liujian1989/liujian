package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai.DanLi;

public class Test1 extends Thread{
	public void run(){
		try{
			Thread.sleep(300);
			for(int i=0;i<1000;i++){
				Manager.getManager();
			}
		}catch (InterruptedException e){
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		long time=System.currentTimeMillis();
		Test1[] ts=new Test1[100];
		
		for(int i=0;i<100;i++){
			ts[i]=new Test1();
			ts[i].start();
		}
		for(int i=0;i<100;i++){
			ts[i].join();
		}
		System.out.println(System.currentTimeMillis()-time);
	}

}
