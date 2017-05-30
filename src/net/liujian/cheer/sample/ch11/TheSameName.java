package net.liujian.cheer.sample.ch11;

public class TheSameName {
@SuppressWarnings("unused")
private int x;
@SuppressWarnings("unused")
private class Inner{
	private int x=9;
	public void doit(int _x){
		x++;
		this.x++;
		TheSameName.this.x++;
	}
  }
}
