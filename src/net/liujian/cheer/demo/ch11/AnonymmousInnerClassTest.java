package net.liujian.cheer.demo.ch11;

public class AnonymmousInnerClassTest {

	public static void main(String[] args) {
	Wuqi ak47=new Wuqi(){
		
		public void openFire(){
			System.out.println("");
		}
		
	};
	Wuqi tank= new Wuqi{
		public void openFire(){
			System.out.println("");
	}
	};
    
}
