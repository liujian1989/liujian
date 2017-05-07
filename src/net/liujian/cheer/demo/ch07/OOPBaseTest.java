package net.liujian.cheer.demo.ch07;
import java.util.Date;
public class OOPBaseTest {

	public static void main(String[] args) {
		Student s=new Student();
		s.printInfo();
		
		s.id="3209251#####0405005X";
		s.setName("liujian");
		s.birthday=new Date();
		s.printInfo();
	}

}
class Student{
	public String id;
	public String name;
	private Date birthday;
	 
	public String getId(){
		return id;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	public String getName(){
		return name;
	}
	public Date getBirthday(){
		return birthday;
	}
	
	private void setId(String id){
		this.id=id;
	}
	
	private void abc(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Birthday: "+birthday);
	}
		public void printInfo(){
			abc();
		}
		
	
}
