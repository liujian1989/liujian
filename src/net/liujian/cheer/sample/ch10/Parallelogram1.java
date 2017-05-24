package net.liujian.cheer.sample.ch10;


class Quadrangle{
	public static void draw(Quadrangle q){
			//SomeSentence
	}
}
class Square extends Quadrangle{
	//SomeSentence
}
class Anything{
	//SomeSentence
}

public class Parallelogram1 extends Quadrangle  {

	public static void main(String[] args) {
		Quadrangle q =new Quadrangle ();  //实例化父类对象
//判断父类对象是否为Parallelogram1子类的一个实例
		if(q instanceof Parallelogram1){
			Parallelogram1 p=(Parallelogram1) q; //向下转型操作
		}
		//判断父类对象是否为Square子类的一个实例
		if(q instanceof Square){
			Square s=(Square) q;    //进行向下转型操作
		}
		//由于q对象不为Anything类的对象，所以这条语句是错误的
		//System.out.println(q instenceof Anything);
		
	}

}
