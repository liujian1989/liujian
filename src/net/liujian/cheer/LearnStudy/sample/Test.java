package net.liujian.cheer.LearnStudy.sample;

public class Test {
	
	public static void main(String[] args) {
     Dog d=new Dog();
	 d.play();
	 System.out.println("====================");
	 Penguin p=new Penguin();
	 p.plays();
	}
    }
   class Pet{
	   String name;
	   String sex;
	   int health;
	   String love;
	   String pingzhong;
   }
  
   class Dog{
	public void play(){
		Pet p =new Pet();
		p.name="旺财";
	    p.health=199;
	    p.love="108";
	    p.pingzhong="拉布拉多犬";
	    p.sex="公";
		System.out.println("名字:"+p.name+"\n"+"健康值:"+p.health+"\n"+"亲密度:"+p.love+"\n"+"品种:"+p.pingzhong+"\n"+"性别:"+p.sex);
	}
	}
class Penguin{
     public void plays(){
		Pet a =new Pet();
		a.name="花花";
	    a.health=189;
	    a.love="128";
	    a.pingzhong="南极";
	    a.sex="母";
		System.out.println("名字:"+a.name+"\n"+"健康值:"+a.health+"\n"+"亲密度:"+a.love+"\n"+"品种:"+a.pingzhong+"\n"+"性别:"+a.sex);
	}

}	
