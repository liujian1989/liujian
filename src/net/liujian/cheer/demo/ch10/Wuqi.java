package net.liujian.cheer.demo.ch10;
public class Ak47 extends Wuqi{
    public void openFire(){
    	System.out.println(getClass().getName()+"openFire......");
    }
	public static void main(String[] args) {
		Wuqi _ak47 = new Ak47();
		Wuqi _tank=new Tank();

		_ak47.openFire();
		_tank.openFire();
		
	}

}
