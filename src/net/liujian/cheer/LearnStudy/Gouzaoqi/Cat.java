package net.liujian.cheer.LearnStudy.Gouzaoqi;

public class Cat
    {	
	String name;
	int age;
	Cat()
	{
		this("波斯猫",1);
		System.out.println("1");
	}
	Cat(String name)
	{
		this(name,1);
		System.out.println("2");
	}
	Cat(String name,int age)
	{
		System.out.println("3");
		this.name=name;
		this.age=age;
		System.out.println("4");
	}
	public static void main(String[] args)
	{
		new Cat();
		new Cat("小花");	
	}
    }
