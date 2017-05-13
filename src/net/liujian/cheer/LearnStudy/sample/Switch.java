package net.liujian.cheer.LearnStudy.sample;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("请选择:");
		int a=sc.nextInt();
         switch (a){
              case 1:
            	  System.out.println("拨打爸爸电话！");
            	  break;
              case 2:
            	  System.out.println("拨打妈妈电话！");
            	  break;
              case 3:
            	  System.out.println("拨打爷爷电话！");
            	  break;
              case 4:
            	  System.out.println("拨打奶奶电话！");
            	  break;
            	  default:
            	  System.out.println("没有此号码！");
            	  case 0:
            		  System.out.println("停止拨号！"); 
            		  System.exit(0);  
}
         System.out.println("退出请按: "+"0");
		}
	}

}
