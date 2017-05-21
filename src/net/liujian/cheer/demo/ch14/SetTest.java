package net.liujian.cheer.demo.ch14;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		List list = new ArrayList<>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.size());
		Set set = new HashSet();
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(16);
		set.add(17);
		set.add(19);

		System.out.println(set.size());
	}

}
