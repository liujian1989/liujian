package net.liujian.taishan.define;


import net.liujian.taishan.Taishan;

public class Processor {
	private Request request;
	private Response response;
	public Processor(Request request ,Response response){
		this.request =request;
		this.response=response;
	}
	public void handle(){
		if(request.input()){
			response.render(request);
		}else{
			Taishan.commandMap.get(Taishan.DEFAULT_COMMAND).handle();
		}
	}
}
