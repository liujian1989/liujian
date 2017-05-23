package net.liujian.cheer.demo.ch10.i4f3;

import net.liujian.cheer.demo.ch11.Wuqi;

public class TankImpl implements Wuqi  {

	@Override
	public void openFire() {
		System.out.println(this.getClass().getName() + " openFire...");
	}

}
