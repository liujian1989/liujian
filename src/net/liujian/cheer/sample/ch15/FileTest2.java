package net.liujian.cheer.sample.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest2 {
	public static void main(String[] args) {
		File file=new File("word.txt");   //創建文件對象
		try{                              //捕捉異常
			//創建FileOutputStream 對象
			FileOutputStream out =new FileOutputStream(file);
			//創建byte型數組
			byte buy[]="我有一隻小毛驢，我從來也不騎。".getBytes();
			out.write(buy);                 //將數組中的信息寫入到文件中
			out.close();                   //將流關閉
		}catch(Exception e){              //catch語句處理異常信息
			e.printStackTrace( );         //輸出異常信息
			
		}try {                            
			//創建FileInputStream 類對象
			FileInputStream in=new FileInputStream(file);
			byte byt[]=new byte[1024];      //創建byte數組
			int len=in.read(byt);            //從文件中讀取信息
			//將文件中的信息輸出
			System.out.println("文件中的信息是: "+new String(byt,0,len));
			in.close();                     //關閉流
		}catch (Exception e){
			e.printStackTrace( );
		}
		
	}

}
