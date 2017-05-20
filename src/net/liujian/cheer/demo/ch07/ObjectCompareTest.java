package net.liujian.cheer.demo.ch07;
public class ObjectCompareTest {
   public static void main(String[] args){
	   CopmpareDemo demo1 = new CopmpareDemo(); 
		
		CopmpareDemo cloneObject = demo1.clone();
	   demo1.setValue(101);
	   System.out.println(demo1.getValue());

		System.out.println(cloneObject.getValue());
		
	}
}

 class CopmpareDemo implements Cloneable {
	 private int value =1000;
	 public CopmpareDemo (){
	 }
	 public void CompareDemo(int value) {
			this.value = value;
		}
		
		public void setValue(int value){
			this.value = value;
		}
		public int getValue(){
			return value;
		}
		
		public boolean equals(CopmpareDemo obj) {
			return this.value == obj.value;
		}
		
		public CopmpareDemo clone() {
			try{
				Object obj = super.clone();
				
				if(obj instanceof CopmpareDemo){
					return  (CopmpareDemo)obj;
				}
				
			}catch(CloneNotSupportedException e){
				
			}
			return null;
		}
		
	}




