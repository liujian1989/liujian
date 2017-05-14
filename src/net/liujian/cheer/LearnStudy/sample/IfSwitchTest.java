package net.liujian.cheer.LearnStudy.sample;
import java.util.Scanner;
public class IfSwitchTest {

	public static void main(String[] args) {
		double d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入消费金额:");
		double a=sc.nextDouble();
      if(a>=50){
    	  System.out.println("满足换购条件！");
    	  System.out.println("是否参见换购活动(y/n)");
    	  String b=sc.next();
    	  if(b.equals("y")){
    		  System.out.println("请选择需要换购的商品:");
    		  String c=sc.next();
    		  switch (c){
    			  case "1":
    				  System.out.println("满50元，加2元换购百事可乐饮料一瓶！");
 
    				  break;
    			  case "2":
    				  System.out.println("满100元，加3元换购500ml可乐饮料一瓶！");
    				  break;
    			  case "3":
    				  System.out.println("满100元，加10元换购5公斤面粉一袋！");
    				  break;
    			  case "4":
    				  System.out.println("满200元，加10元换购一个苏泊尔炒菜锅！");
    				  break;
    			  case "5":
    				  System.out.println("满200元，加20元换购欧莱雅爽肤水一瓶！");
    				  break;
    		  }
    	  }else{
    		       System.out.println("不换购！");
    	  }
    	  }else{
    		  System.out.println("不具备换购条件！");
    	  }
      }  
	            
	}


