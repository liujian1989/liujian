package net.liujian.cheer.LearnStudy.mianxiangduixiang;

public class Phone {

	String osname;        //属性
	String size;
	String name;
	void callPhone(){      //方法
		System.out.println("正在拨打电话");	
	}
	void sendSms(){
		System.out.println("正在发短信");	
		Phone p1= new Phone();
		Phone p2= new Phone();
		Phone p3= new Phone();
			p1.osname="安卓";
			p1.name="三星G5";
			p1.size="16G";
		    p1.callPhone();
		    p1.sendSms();
		System.out.println(p1.osname);
		System.out.println(p1.name);
		System.out.println(p1.size);
		p2.osname="IOS";
		p2.name="苹果7";
		p2.size="128G";
	    p2.callPhone();
	    p2.sendSms();
	System.out.println(p3.osname);
	System.out.println(p3.name);
	System.out.println(p3.size);
	p3.osname="Windows";
	p3.name="诺基亚";
	p3.size="32G";
    p3.callPhone();
    p3.sendSms();
System.out.println(p3.osname);
System.out.println(p3.name);
System.out.println(p3.size);
	}

	}
