package net.liujian.cheer.LearnStudy.sample;

import java.util.Scanner;

public class Huangou {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入消费金额:");
		double a=sc.nextDouble();
      if(a>=50){
    	  System.out.println("1.满50元，加2元换购百事可乐饮料一瓶！");
    	  System.out.println("2.满100元，加3元换购500ml可乐饮料一瓶！");
    	  System.out.println("3.满100元，加10元换购5公斤面粉一袋！");
    	  System.out.println("4.满200元，加10元换购一个苏泊尔炒菜锅！");
    	  System.out.println("5.满200元，加20元换购欧莱雅爽肤水一瓶！");
    	  System.out.println("请选择需要换购的商品:");
    		  int b=sc.nextInt();
    		  boolean d=false;
    		  switch (b){
    			  case 1:
    				  if (a>=50){
    			     System.out.println("换购成功,百事可乐饮料一瓶！"); 
    			     System.out.println("消费的总金额是: "+(a+2));
    				  }
    				  break;
    			  case 2:
    				  if (a>=50){
    			     System.out.println("换购成功,500ml可乐饮料一瓶！"); 
    			     System.out.println("消费的总金额是: "+(a+3));
    				  }
    				  break;
    			  case 3:
    				  if (a>=50){
    			     System.out.println("换购成功,5公斤面粉一袋！"); 
    			     System.out.println("消费的总金额是: "+(a+10));
    				  }
    				  break;
    			  case 4:
    				  if (a>=50){
    			     System.out.println("换购成功,一个苏泊尔炒菜锅！"); 
    			     System.out.println("消费的总金额是: "+(a+2));
    				  }
    				  break;
    			  case 5:
    				  if (a>=50){
    			     System.out.println("换购成功,欧莱雅爽肤水一瓶！"); 
    			     System.out.println("消费的总金额是: "+(a+20));
    				  }
    				  break;
    			  case 0:
    				  System.out.println("不换购！");
    				  break;
    		          }
    		          }else{	
    		        	  System.out.println("消费金额不满足50元，不能参加活动！"); 
     			          System.out.println("消费的总金额是: "+a);		           
                      }
                      }
                      }
	                           
      
   