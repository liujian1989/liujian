package net.liujian.cheer.LearnStudy.sample;

public class Test1 {
		public static void main(String[] args) {
		     Dog1 d=new Dog1("旺财","公",100,"0","中华田园犬");
			 d.play();
			 System.out.println("====================");
		
		}
		}
		   class Pet1{
			   String name;
			   String sex;
			   int health;
			   String love;
			   String pinzhong;
		   public void play(){
			   System.out.println("名字:"+name+"\n"+"健康值:"+health+"\n"+"亲密度:"+love+"\n"+"品种:"+pinzhong+"\n"+"性别:"+sex);
			   }
		   }
		   class Dog1 extends Pet1 {
			   public Dog1(String name,String sex,int health,String love,String pinzhong){
				 this.name=name;
				 this.sex=sex;
				 this.health=health;
				 this.love=love;
				 this.pinzhong = pinzhong;  
			   }
			public void play(){
				super.play();
				System.out.println("我是一只中华田园犬！");
			}
			}
	