package net.liujian.cheer.demo.ch11;

public class FinalTest {
	private static String value="abc";

	public static void main(String[] args) 
	{
	FinalDemo finalDemo=new FinalDemo();
	System.out.println(finalDemo.getDemoValue());
	System.out.println(finalDemo);//net.liujian.cheer.demo.ch11.FinalDemo@0xfffff
		
		/*
		 * if override toString method;
		 * print toString method's result
		 */
		FinalDemoChild child = new FinalDemoChild();
		child.setDemoValue("def");
		System.out.println(child);
		//System.out.println(value);
		//value="bcd";
		//System.out.println(value);
   }

   }



class FinalDemo
   {
	private String demoValue;
	public void setDemoValue(String demoValue)
	{
		this.demoValue = demoValue;	
	}
	public String getDemoValue()
	{
		return demoValue;
	}
	
    }



class FinalDemoChid extends FinalDemo
{
	public String toString(){
		return getClass().getName()+"[extends net.liujian.cheer.demo.ch11.FinalDemo"+
	}
	
}