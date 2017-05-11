package net.liujian.cheer.LearnStudy.sample;
import java.util.Scanner;
public class Caiquan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("猜拳游戏");
		System.out.println("1.石头，2.拳头,3.布");
		
		int a =sc.nextInt();//键盘读取
		int b = (int)(Math.random()*3+1);//电脑随机数
		String a1="你的出拳";
		switch(a){
			case 1:
				  a1="石头";
				  break;
			case 2:
				  a1="剪刀";
				  break;
			case 3:
				  a1="布";
				  break;
			case 0:
				System.out.println("游戏结束!");
				System.exit(0);
		}
		
		String b1="系统出的拳";
		switch(b){
			case 1:
				  b1="石头";
				  break;
			case 2:
				  b1="剪刀";
				  break;
			case 3:
				  b1="布";
				  break;
		}
		if (a==b){
			System.out.println("我出的是:"+a1+","+"系统出的: "+b1);
			System.out.println("平局！");
			}else if((a==1 && b==2) || (a==2 && b==3) || (a==3 && b==1)){
				System.out.println("我出的:"+a1+"系统出的: "+b1);
				System.out.println("我赢了！");
			}else {
				System.out.println("我出的:"+a1+"系统出的: "+b1);
				System.out.println("我赢了！");
			}
		System.out.println("退出游戏请按"+"0");
		}
	}
}
