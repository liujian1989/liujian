package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai.DanLi;

public class Manager {
	private Manager(){           //构造器私有化（在别的地方new不成）
		System.out.println("manager........");
	}
	//懒汉式
	private static  Manager manager=null;
	//排队执行
	public static  synchronized  Manager getManager(){
		if(manager == null){
			manager=new Manager();
		}
		return manager;
	}
/**	//属性 对象
	private static Manager manager=new Manager();
	//方法  得到管理员对象
	public static Manager getManager(){
		return manager;
	}   
	**/                                    //以上是单例三步骤
	public static void main(String[] args) {

	}

}
