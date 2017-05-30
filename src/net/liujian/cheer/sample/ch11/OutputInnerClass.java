package net.liujian.cheer.sample.ch11;

public class OutputInnerClass extends ClassA.ClassB { // 继承内部类ClassB
	
	public OutputInnerClass(ClassA a) {
		a.super();
	}
}
class ClassA {
	class ClassB {

	}
}
