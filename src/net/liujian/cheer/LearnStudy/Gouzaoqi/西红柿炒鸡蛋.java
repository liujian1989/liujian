package net.liujian.cheer.LearnStudy.Gouzaoqi;

public class 西红柿炒鸡蛋 {
     String 鸡蛋;
     String 西红柿;
     String 青椒;
                   西红柿炒鸡蛋()
        {
         this("普通的鸡蛋","普通西红柿","普通青椒");//只能写在第一句代码上
    	 //鸡蛋="普通的鸡蛋";
    	 //西红柿="普通西红柿";
    	 //青椒="普通青椒";
         System.out.println("1");
        }
		西红柿炒鸡蛋(String 鸡蛋)
		{
		 this(鸡蛋,"普通西红柿","普通青椒");
			//this.鸡蛋=鸡蛋;
			//西红柿="普通西红柿";
			//青椒="普通青椒";
		 System.out.println("2");
		}
		西红柿炒鸡蛋(String 鸡蛋,String 西红柿)
		{
			this(鸡蛋,西红柿,"普通青椒");
			//this.鸡蛋=鸡蛋;
			//this.西红柿=西红柿;
			//青椒="普通青椒";
			 System.out.println("3");
		}
		西红柿炒鸡蛋(String 鸡蛋,String 西红柿,String 青椒)
		{
			this.鸡蛋=鸡蛋;
			this.西红柿=西红柿;
			this.青椒=青椒;
			 System.out.println("4");
		}

public static void main(String[] args) 
        {
	     new 西红柿炒鸡蛋 ();
	     new 西红柿炒鸡蛋 ("鸡蛋");
	     new 西红柿炒鸡蛋 ("普通青椒");
	     new 西红柿炒鸡蛋 ("普通西红柿","普通青椒");
	     new 西红柿炒鸡蛋 ("普通鸡蛋","普通西红柿","普通青椒");
        }
        }