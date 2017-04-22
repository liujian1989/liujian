package net.liujian.cheer.demo.ch09;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		//Integer i = new Integer("10000000000000000");
		//System.out.println(i);
		BigInteger bi = new BigInteger("10000000000000000");
		System.out.println(bi);
		BigInteger result = bi.add(new BigInteger("2000000000000000"));
		System.out.println(result);
		result = bi.multiply(new BigInteger("2000000000000000"));
		System.out.println(result);
		result = bi.divide(new BigInteger("100"));
		System.out.println(result);
	}

}
