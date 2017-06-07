package net.liujian.taishan.response;

import net.liujian.taishan.Taishan;
import net.liujian.taishan.define.Request;
import net.liujian.taishan.define.Response;
import net.liujian.taishan.request.AddRequest;


public class AddResponse implements Response {

	@Override
	public void render(Request request) {
		AddRequest addRequest = (AddRequest) request;
		Taishan.data.add(addRequest.getFill());
		System.out.println("学生信息增加成功！");
		Taishan.commandMap.get(Taishan.DEFAULT_COMMAND).handle();
	}

}
