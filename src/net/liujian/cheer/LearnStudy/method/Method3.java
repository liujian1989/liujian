package net.liujian.cheer.LearnStudy.method;
//方法重载   方法名一样 参数可以不一样

//局部变量和全局变量
public class Method3 {
	static void  method(int i){
		System.out.println("int:"+i);
	}
	static void  method(short s){
		System.out.println("short:"+s);
	}
	static void  method(byte i){
		System.out.println("byte:"+i);
	}
	
	static void  method(float i){
		System.out.println("float:"+i);
	}
	static void  method(double i){
		System.out.println("double:"+i);
	}
	static void  method(char i){
		System.out.println("char:"+i);
	}

	///吃饭(面条)
	///吃饭(米饭)
	///吃饭(饺子)
	///吃饭(馍馍)
	///吃饭(煎饼)
	///吃饭(饼)
	
	
	///消费(港币)
	///消费(RMB)
	///消费(美元)
	
	
	public static void main(String[] args) {
        char t=8976;
		double u=65;
		short y=76;
		byte s=16;
		//short s=100;
		method(s);
		method(y);
		method(u);
		method(t);
		 /*System.out.println(true);
		 System.out.println('A');
		 System.out.println("abc");
		 System.out.println(12);
		 System.out.println(12f);
		 System.out.println(12.5);*/
		
            for(int i=0;i<100;i++){
            	
            }
            for(int i=0;i<100;i++){
            	
            }
            for(int i=0;i<100;i++){//变量i不影响，在局部内
            	
            }
	}

}
