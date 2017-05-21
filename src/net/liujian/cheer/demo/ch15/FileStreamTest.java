package net.liujian.cheer.demo.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamTest {

	public static void main(String[] args) throws Exception {
		File f = new File("D:/cheer2017/Test/def.txt");
		FileOutputStream out = new FileOutputStream(f);
		String content = "Welcome 输入！";
		out.write(content.getBytes());
		out.flush();
		out.close();
		
		FileInputStream in = new FileInputStream(f);
		byte[] _content =new byte[in.available()];
		in.read(_content);
		
		String readContent =new String(_content);
		System.out.println(readContent);
		in.close();

	}

}
