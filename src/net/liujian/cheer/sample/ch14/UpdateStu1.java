package net.liujian.cheer.sample.ch14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStu1 {
	public static void main(String[] args) {
		Map<String,String> map =new HashMap<>();  //创建Map实例
		map.put("01","李同学");          //向集合中添加对象
		map.put("02", "魏同学");
		Set<String> set=map.keySet();     //构建Map集合中所有key对象的集合
		Iterator <String> it =set.iterator();  //创建集合迭代器
		System.out.println("key集合中的元素: ");
		while(it.hasNext()){
			System.out.println(it.next());
	}
	Collection<String> coll=map.values();     //构建Map集合中所有values值的集合
	it =coll.iterator();
	System.out.println("values集合中的元素: ");
	while (it.hasNext()){
		System.out.println(it.next());
	}
   }
}