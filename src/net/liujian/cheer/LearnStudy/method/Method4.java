package net.liujian.cheer.LearnStudy.method;

public class Method4 {

	static int add(int i){
		if (i==1){
			return 1;
		}return i+add(i-1);
	}
	
	
	
	
	public static void main(String[] args) {
		//方法的递归（嵌套调用）
       int sum= add(3);//3+2+1
       System.out.println("sum="+sum);
	}

}
