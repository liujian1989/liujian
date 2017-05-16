package net.liujian.cheer.LearnStudy.Gouzaoqi;

public class Stu {
       Stu(){
    	   System.out.println("我是构造器！");
       }
       Stu(String name){
    	   System.out.println("String >>"+name);
       }
       Stu(String name,String address){
    	   System.out.println("String >>"+name+">>"+address);
       }
	String name;
	String address;
	public static void main (String[] args){
		Stu stu1=new Stu();
		Stu stu2=new Stu("张三");
		Stu stu3=new Stu("张三","湖南长沙");
		

	}
}
