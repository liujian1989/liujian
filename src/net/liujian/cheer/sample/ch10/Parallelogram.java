package net.liujian.cheer.sample.ch10;

class Quadrangle {   //四边形类
	public static void draw(Quadrangle q){
		
		//SomeSentence
	}
}
	public  class Parallelogram  extends Quadrangle{
	/*public void main(String args[]) {
		Parallelogram p=new Parallelogram();
		draw(p);
	}
	}
    }*/
		public static void main(String args[]) {
			draw (new Parallelogram() );
			//将平行四边形类对象看作是四边形对象，称为向上转型操作
			Quadrangle q=new Parallelogram();
			//Parallelogram p=q;
			//将父类对象赋予子类对象，这种写法是错的
			//将父类对象赋予子类对象，并强制转换为子类型，这种写法是正确的
			Parallelogram p=(Parallelogram)q;
			}
		}
	