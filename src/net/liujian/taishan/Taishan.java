package net.liujian.taishan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import net.liujian.taishan.define.Processor;
import net.liujian.taishan.define.Request;
import net.liujian.taishan.define.Response;
import net.liujian.taishan.entity.Student;
import net.liujian.taishan.request.AddRequest;
import net.liujian.taishan.request.ViewRequest;
import net.liujian.taishan.response.AddResponse;
import net.liujian.taishan.response.ViewResponse;

public class Taishan {
	public static List<Student> data = new ArrayList<Student>();
	public final static Map<String, Processor> commandMap = new HashMap<String, Processor>();
	public final static String DEFAULT_COMMAND = "M";
	public final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		init();
		Processor processor =new Processor(
				new Request(){
					@Override
					public boolean input(){
						return true;
					}
					},
					new Response(){
						@Override
						public void render(Request request){
							System.out.println("在这里你可以输入以下命令");
							System.out.println("V - 查看学生信息");
							System.out.println("A - 增加一个学生信息");
						    //System.out.println("O- 导出学生信息");
							//System.out.println("I - 导入学生信息");
							System.out.println("E - 退出系统");
							while (scanner.hasNextLine()){
							String command =scanner.nextLine();
							Processor _p=commandMap.get(command.toUpperCase());
							if(_p!=null){
								_p.handle();
							}else{
								System.out.println("命令不存在！退到主菜单");
								Processor _m= commandMap.get(DEFAULT_COMMAND);
								_m.handle();
								return;
							}
					       }
						}
					}
					);
					commandMap.put(DEFAULT_COMMAND,processor);
					System.out.println("----------------");
					System.out.println("|欢迎来到泰山系统！ |");
					System.out.println("----------------");
					processor.handle();
}
	private static void init() {
		Processor v=new Processor(new ViewRequest(),new ViewResponse());
		commandMap.put("V", v);
		Processor a=new Processor(new AddRequest(),new AddResponse());
		commandMap.put("A", a);
	}
}