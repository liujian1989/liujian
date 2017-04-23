package net.liujian.cheer.demo.ch10;

public class EqualsTest {
private Long longValue;
private Integer intValue;
private Character charValue;
private Double doubleValue;

  public Long getLongValue(){
	 return longValue;
}
   public void setLongValue(Long longValue){
	     this.longValue = longValue;
   }
   public Integer getIntValue(){
	   return intValue;
   }
    public void setInValue(Integer intValue){
    	this.intValue = intValue;
    }
	public static void main(String[] args) {
		EqualsTest test01 = new EqualsTest();
		EqualsTest test02 = new EqualsTest();
		System.out.println(test01);
		System.out.println(test02;
		if (test01==test02){
			System.out.println(test01==test02);
			
		}else{
			System.out.println(test01!=test02);
		}

	}

}
