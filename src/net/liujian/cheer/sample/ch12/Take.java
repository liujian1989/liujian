package net.liujian.cheer.sample.ch12;

public class Take {                                        // 创建类

	public static void main(String[] args) {             // 主方法
		try {                                           // try语句中包含可能出现异常的程序代码
			String str = "lili";                       // 定义字符串
			System.out.println(str + "年龄是: ");       // 输出的提示信息
			int age = Integer.parseInt("20L");       // 数据类型的转换
			System.out.println(age);                // 输出信息
		} catch (Exception e) {                    // catch语句块用来获取异常信息
			e.printStackTrace();                  // 输出异常性质
		}
		System.out.println("program over");     // 输出信息
	}

}
