package net.liujian.cheer.demo.ch15;

import java.io.File;
import java.io.FileFilter;

public class FileBrowerTest {

	public static void main(String[] args) {
		File f = new File("D:/");
		if (f.isDirectory()) {
			File[] children = f.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					System.out.println(pathname.getName());
					return pathname.getName().endsWith(".exe");
				}
			});

			System.out.println("Result as Below>>>>>>");

			for (int i = 0; i < children.length; i++) {
				File child = children[i];
				System.out.println(child.getAbsoluteFile());
			}
		}

	}
}
