package net.liujian.cheer.LearnStudy;
public class Bank {
	public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner(System.in);
       int id =1000;
       int[][] bankDate = new int[100][3];//准备了100个账户空间  
    	boolean runState=true;
    	while(runState){
		//打印欢迎页面部分
	   System.out.println("===============================");
	   System.out.println("");
	   System.out.println("                   小李子银行 v1.0");
	System.out.println("");
	   System.out.println("===============================");
	   System.out.println("\t1.开户\t\t2.存钱");
       System.out.println("\t3.取钱\t\t4.查询\n");
	   System.out.println("\t5.退出\n");
	   System.out.println("请选择:");
	   int selectNum=input.nextInt();//等待客户选择
	   if (selectNum==1){     //开户
		   System.out.println("-----开户-----");
		   System.out.println("账户:"+id);
		   System.out.println("密码:");
		   int mima=input.nextInt();//等待客户输入密码
		   for (int[] zhanghu:bankDate){//循环查看哪个行没有塞数据
			   if (zhanghu[0]==0){//判断某行是否是零
				   zhanghu[0]=id++;//如果是零就把新账户开在这里
				   zhanghu[1]=mima;
				   break;
			   }
		   }   
		   System.out.println("恭喜您，开户成功！");   
		   System.out.println("-------------");    
	   }else if (selectNum==2){  //存钱
		   System.out.println("-----存款----"); 
		   System.out.print("账户:"); 
		   int zhanghu=input.nextInt();   //请他输入账户
		   System.out.print("金额:"); 
		   int jine=input.nextInt();
		   if (jine<=99  || jine>100000){
			   System.out.println("对不起不支持此功能！");   
		   }else {
			   boolean zhaodaolemei =false;
			   for (int[] zhanghu1:bankDate){
				   if(zhanghu1[0]==zhanghu){
					   zhanghu1[2]+=jine;
					   zhaodaolemei=true;
					   break;
				   }
			   }
			   if(!zhaodaolemei){
				   System.out.println("没有此账户！"); 
			   }
		   }	   
	   }else if (selectNum==3){  //取钱
		   System.out.println("-----取款----"); 
		   System.out.print("账户:"); 
		   int zhanghu=input.nextInt();   //请他输入账户
		   System.out.print("密码:"); 
		   int mima=input.nextInt();
		   System.out.print("金额:");
		   int jine=input.nextInt();
		   if (jine<0 || jine>100000){
			   System.out.println("对不起不支持此功能！");   
		   }else {
			   boolean zhaodaolemei=false;
			   for(int[] zhanghu1:bankDate){
				   if(zhanghu1[0]==zhanghu){
					   if(zhanghu1[1]==mima){
						   if(jine<=zhanghu1[2]){
							   zhanghu1[2]-=jine;
							   zhaodaolemei=true;
							   break;
						   }else{
						   System.out.println("余额不足！"); 
					   }				   
				   }else{
					   System.out.println("余额不足！"); 
					   }	   
				   }
			   }
		   if(!zhaodaolemei){
			   System.out.println("没有此账户！"); 
		   }  
		   }
	   }else if (selectNum==4){  //查询
		   System.out.println("-----取款----"); 
		   System.out.print("账户:"); 
		   int zhanghu=input.nextInt();   //请他输入账户
		   System.out.print("密码:"); 
		   int mima=input.nextInt();
		   for(int[] zhanghu1:bankDate){
			   if(zhanghu1[0]==zhanghu){
				   if(zhanghu1[1]==mima){
					   System.out.print("金额:"+zhanghu1[2]+"元");  
					   break;
				   }else{
					   System.out.print("密码错误！"); 
				   }   
			   }	   
		   }    
	   }else if (selectNum==5){
		runState=false;
		
	   }else {
		System.out.println("输入错误！");
    	}
    	}
	    }
        }
