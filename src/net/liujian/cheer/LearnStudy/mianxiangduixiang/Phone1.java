package net.liujian.cheer.LearnStudy.mianxiangduixiang;

public class Phone1 {
     String osname;
     String name;
     String size;
     
     void callPhone(){
    	 System.out.println("我正在拨通电话");
     }
     
     void sendSms(){
    	 System.out.println("正在发短信给家人");
     }
     
	public static void main(String[] args) {
		Phone1 p1= new Phone1();
		Phone1 p2= new Phone1();
		p1.osname="android 5.0 ";
		p1.name="华为M5 ";
		p1.size="16G";
	
		p2.osname=" IOS";
		p2.name="Apple Phone 7 ";
		p2.size="64G";
		
		System.out.println(p1.osname);
		System.out.println(p1.name);
		System.out.println(p1.size);
		p1.callPhone();
		p1.sendSms();
		
		System.out.println(p2.osname);
		System.out.println(p2.name);
		System.out.println(p2.size);
		p2.callPhone();
		p2.sendSms();
	}

}
