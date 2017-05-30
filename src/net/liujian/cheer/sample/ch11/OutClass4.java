package net.liujian.cheer.sample.ch11;

class OutClass4 {
public OutInterface2 doit(){   //定义doit()方法
	return new OutInterface2 (){  //声明匿名内部类
		private int i=0;
		@SuppressWarnings("unused")
		public int getValue(){
			return i;
		}
	};
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
