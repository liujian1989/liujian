package net.liujian.cheer.sample.ch10;
  class Parent { //父类
    	Parent()
    	{
    		System.out.println("调用父类的Parent()构造方法");
    	}
        }
    class SubParent extends Parent    //继承Parent类
        {
    	SubParent()
    	{
    		System.out.println("调用子类的SubParent()构造方法");		
    	} 	
        }
	 class Subroutine  extends SubParent { //继承SubParent类
		 Subroutine (){
			 System.out.println("调用子类的Subroutine构造方法");	 
		}
      public static void main(String[] args){
			 Subroutine s=new Subroutine();    //实例化子类对象
	    } 
        }