package net.liujian.cheer.sample.ch09;
import java.text.DecimalFormat;
public class DecimalFormatSimpleDemo {
static public void SimpleFormat(String pattern,double value){
	DecimalFormat myFormat = new DecimalFormat(pattern);
	String output=myFormat.format(value);
	System.out.println(value+" "+pattern+" "+output);
}
//使用applyPattern()方法对数字进行格式化
static public void UseApplyPatternMethodFormat(String pattern,double value){
	DecimalFormat myFormat = new DecimalFormat();
	myFormat.applyPattern(pattern);
	System.out
	      .println(value+" "+pattern+" "+myFormat.format(value));
}
	public static void main(String[] args) {
		SimpleFormat("###,###.###",123456.789);
		SimpleFormat("00000000.###kg",123456.789);
		SimpleFormat("000000.000",1230.78);
		UseApplyPatternMethodFormat("#.###%",0.789);
		UseApplyPatternMethodFormat("###.##",123456.789);
		UseApplyPatternMethodFormat("0.00\u2030",0.789);
	}

}
