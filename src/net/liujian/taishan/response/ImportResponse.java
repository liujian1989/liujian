package net.liujian.taishan.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import net.liujian.taishan.Taishan;
import net.liujian.taishan.define.Response;
import net.liujian.taishan.entity.Student;

public class ImportResponse implements Response {
	public void render (Resquest request){
		ImportRequest _request =(ImportRequest)request;
		String storeFilePath=_request.getStoreFilePath();
		
		ObjectInputStream oin=null;
		FileInputStream fin=null;
		try{
			fin =new FileInputStream(storeFilePath);
			oin =new ObjectInputStream(fin);
			Object content=oin.readObject();
			if(content instanceof List){
				List<?> fileData=(List<?>) content;
				for (int i=0;i<fileData.size();i++){
					Object item =fileData.get(i);
					if (item instanceof Student){
						Student student =(Student) item;
						Taishan.data.add(student);
					}
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
		e.printStackTrace();
	}
	finally {
		try{
			if(oin!=null){
				oin.close();
			}
			if(fin!=null){
				
			}
		}
		}
	}
	public static void main(String[] args) {
	}

}
