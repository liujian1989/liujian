package net.liujian.cheer.demo.ch15;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		//System.out.println("\n");
		//System.out.println("\t");
		File f=new File("D:/cheer2017/Test0");
		//File f0=new File("D://cheer2017//Test");//只能在Window系统里用
        //"/"  "\\"
		if(f.exists()){
		if (f.isDirectory()){
			System.out.println("is folder");
		}else{
			System.out.println("is file");
		}
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
	}else{
		System.out.println("The Folder or File not exits !");
		boolean created = f.mkdir();
		System.out.println("File is created ? "+created );
	}

}
}