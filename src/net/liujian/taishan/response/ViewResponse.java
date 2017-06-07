package net.liujian.taishan.response;

import net.liujian.taishan.Taishan;
import net.liujian.taishan.define.Request;
import net.liujian.taishan.define.Response;
import net.liujian.taishan.entity.Student;



public class ViewResponse implements Response {

	@Override
	public void render(Request request) {
		System.out.println("当前总共有" +Taishan.data.size()+"条学生记录");
		System.out.println("id\t\t\tname\t\tsex\t\tbirthday\t\theight\t\tweight");
		System.out.println("------------------------------------------------------------------------------------");
		for(int i=0;i<Taishan.data.size();i++){
			Student student = Taishan.data.get(i);
			System.out.println(student);
		}
		
	}

}