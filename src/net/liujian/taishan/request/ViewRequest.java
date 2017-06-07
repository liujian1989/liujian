package net.liujian.taishan.request;

import net.liujian.taishan.Taishan;
import net.liujian.taishan.define.Request;



public class ViewRequest implements Request {

	@Override
	public boolean input() {
		if(Taishan.data.size()>0){
			return true;
		}else{
			System.out.println("当前没有学生记录，请先增加学生信息！");
			return false;
		}
	}

}
