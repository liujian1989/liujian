package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai;

public class Xiaohuozi {
	private String sex;     //用方法操作属性
	private int age;
	private boolean state;
	private String[] phones;
	
	public void setPhones(String [] phone){
		this.phones=phones;
	}
	public String[] getPhone(){
		return phones;
	}
	public String getPhone(int index){
		return phones[index];
	}
	public void setPhone(int index,String phone){
		this.phones[index]=phone;
	}
	
	
	public void setState(boolean state){
		this.state=state;
	}
	
	public boolean isState(){  //布尔类型返回值为is
		return state;
	}
	
	
	
	public void setAge(int age ){
		if (age >=1 && age <=150){
			this.age=age;
		}else{
		System.out.println("age年龄过大或者过小，不能赋值！");
	}
	}
	
	public int getAge(){
		return age;
	}
	
	
	
	
	
	
	public void setSex(){      //封装
		
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	
	
}
