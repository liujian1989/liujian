package net.liujian.cheer.demo.ch04;


public class BreakTest {
	
	
	public static void main(String[] args){
		int[] array = new int[]{
			1,2,3,4,5,6,7,8,9,10	
		};
		for(int value:array){
			if(value == 5){
				break;
			}
			System.out.println(value);
		}
	}
	
}