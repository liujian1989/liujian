package net.liujian.cheer.demo.ch10.i4f3;

import net.liujian.cheer.demo.ch10.i4f3.Wuqi;
import net.liujian.cheer.demo.ch10.i4f3.TankImpl;
public class InterfaceTest {
	public static void main(String[] args){
		Wuqi _ak47 = new Ak47IImpl();
		TankImpl _tank = new TankImpl();
		
		
		_ak47.openFire();
		_tank.openFire();
		
	}
}
