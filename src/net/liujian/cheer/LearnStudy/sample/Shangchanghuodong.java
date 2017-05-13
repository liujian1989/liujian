package net.liujian.cheer.LearnStudy.sample;
import java.util.Scanner;
public class Shangchanghuodong {
	public static void main(String[] args) {
		double c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入消费金额:");
		double a=sc.nextDouble();
        if (a>=50){
        	   System.out.println("满足条件，请问需要换购吗？");
        	   System.out.println("是否参加换购活动？(y/n)");	   
               String b=sc.next();
               if(b.equals("y")){
            	 System.out.println("请选择换购的物品: ");
            	 String d=sc.next();
                	 switch (d){
                	 case "1":
                		 System.out.println("满50元，加2元换购百事可乐一瓶！");
                		 System.out.println("你此次的消费金额是: "+(c=a+2));
                		 break;
                	 case "2":
                		 System.out.println("满100元，加3元换购500ml百事可乐一瓶！");
                		 System.out.println("你此次的消费金额是: "+(c=a+3));
                		 break;
                	 case "3":
                		 System.out.println("满100元，加10元换购5公斤面粉一袋！");
                		 System.out.println("你此次的消费金额是: "+(c=a+10));
                		 break;
                	 case "4":
                		 System.out.println("满200元，加10元换购苏泊尔炒菜锅一个！");
                		 System.out.println("你此次的消费金额是: "+(c=a+10));
                		 break;
                	 case "5":
                		 System.out.println("满200元，加20元换购欧莱雅爽肤水一瓶！");
                		 System.out.println("你此次的消费金额是: "+(c=a+10));
                		 break;
                	 }
                	 }else{
                		 System.out.println("不换购！");
                	 }
                     }
                     else{
                     System.out.println("消费不满足50元，不能参加换购活动！"); 
            	     }
                     }
	                 }
