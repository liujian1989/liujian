package net.liujian.cheer.demo.ch09;
    import java.math.BigDecimal;
   public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal b1= new BigDecimal("11.1111111111111111");
		BigDecimal result =b1.setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.println(result);
		//MathContentext mc = new MathContentext(7,RoundingMode.HALF_UP);
		
		
	}

}
