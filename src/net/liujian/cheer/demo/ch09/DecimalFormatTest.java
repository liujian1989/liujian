package net.liujian.cheer.demo.ch09;

import java.text.NumberFormat;

import java.text.DecimalFormat;
public class DecimalFormatTest {

	public static void main(String[] args) {

NumberFormat nf = new DecimalFormat("#,###.00");
double value = 1999.9999d;
System.out.println(nf.format(value));

nf = new DecimalFormat("000.00");
value = 99.991d;
System.out.println(nf.format(value));

	}

}
