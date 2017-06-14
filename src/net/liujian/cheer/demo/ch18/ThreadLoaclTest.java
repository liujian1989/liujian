package net.liujian.cheer.demo.ch18;

public class ThreadLoaclTest {
	
	private static ThreadLoacl<User> userThreadLoacl
	private static int[] ids=new int[100];
	
	static {
		for(int i=0;i<100;i++){
			ids[i]=i;		}
	}
	
	
	

	public static void main(String[] args) {
		for (int i=1;i<100;i++){
			final int index=i;
		new Thread(new Runnable(){

			@Override
			public void run() {
			User user =new User();
			user.setName("tester"+index);
			a();
			b();
			c();
			d();
			}
			
		});
	}
	}
private static void a(){
	User currentUser=userThreadLoacl.get();
	System.out.println(currentUser.getName()+"Called a nethod...");
	try{
		Thread.sleep(10);
	}catch(InterruptedException e){
	}
}
private static void b(){
	User currentUser=userThreadLoacl.get();
	System.out.println(currentUser.getName()+"Called b nethod...");
	try{
		Thread.sleep(10);
	}catch(InterruptedException e){
	}
}
private static void c(){
	User currentUser=userThreadLoacl.get();
	System.out.println(currentUser.getName()+"Called c nethod...");
	try{
		Thread.sleep(10);
	}catch(InterruptedException e){
	}
}
private static void d(){
	User currentUser=userThreadLoacl.get();
	System.out.println(currentUser.getName()+"Called d nethod...");
	try{
		Thread.sleep(10);
	}catch(InterruptedException e){
	}
}
}