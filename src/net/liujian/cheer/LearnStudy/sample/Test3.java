package net.liujian.cheer.LearnStudy.sample;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args)
	{
		Ren r=new Ren("刘建","男",28);
		r.play();
	}	
    }
   abstract  class Person
    {
	String name;
	String sex;
	int age;
	 public abstract void play();
     }
	class Ren extends Person
	{
    public Ren(String name,String sex,int age)
	{
	this.name=name;
	this.sex=sex;
	this.age=age;
	}
	public void play(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名: ");
		String a=sc.next();
		System.out.println("请选择性别: 1.男,2.女");
			int b=sc.nextInt();
			
	System.out.println("名字:"+name+"\n"+"性别:"+sex+"\n"+"年龄:"+age);
	System.out.println("我是一个好人！");
	}
	}