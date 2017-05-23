package net.liujian.cheer.demo.ch10;

import net.liujian.cheer.demo.ch10.AK47;
import net.liujian.cheer.demo.ch10.Tank;
import net.liujian.cheer.demo.ch10.Wuqi;

public abstract class Wuqi {
	
	public abstract void openFire();
	
	public static void main(String[] args){
		Wuqi _ak47 = new AK47();
		Wuqi _tank = new Tank();
		
		
		_ak47.openFire();
		_tank.openFire();
		
		
	}
	
	
}
