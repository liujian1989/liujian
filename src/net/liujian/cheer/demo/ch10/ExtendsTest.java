package net.liujian.cheer.demo.ch10;
import java.util.Date;
public class ExtendsTest {

	public static void main(String[] args) {
		
   // Long current = System.currentTimeMillis();
    //System.out.println(current);
		/***Person p = new Person();
		System.out.println(p);
		p.id = "p00001";
		Teacher t = new Teacher();
		System.out.println(t);
		t.id = "t00001";
	}
      
}
class Person{
	public String id;
	private String name;
	private Date birthday;
	public Person(){
		//System.out.println(¡°new Person called¡±);
		this.name="pName01";
		this.birthday=new Date();
	}
	
}
class Teacher extends Person{
	public Teacher(){
		System.out.println(¡°new Teacher called¡±);
		t.id="t00001";
		this.id = "320105XXXXXXXX819";
	}
}
*******/
		DateFormat df =new SimpleDateFormat("yyyy-MM-DD");
		Person p = new Person();
		p.setId("p00001");
		p.setName("pName00001");
		p.setBirthday(df.parse("1990-12-24"));
		
		System.out.println(p);
		
		
class Person{
	private String id;
	private String name;
	private Date birthday;
	public Person(){
		
	}
	public String getId(){
	return this.id;	
	}
	public void setId(String id);
	  this.id=id;
	}
    public String getName(){
	}
    public void setName(String name);
    return this.name;
}
	public Date getBirthday(){
		return this.birthday;
	}
	public void setBirthday(Date birthday);
	 this.birthday = birthday;
	 public String toString(){
		 StringBuilder sb = new StringBuilder(1024);
		 sb.append(super.toString()).
		 sb.append(getClass().getName()).append
		 sb.append("Teacher[id= ").append(getId());
		 append(",name =").append(getName());
		 append(",birthday =").append(getBirthday());
		 append("]");
		 return sb.toString();
	 }
}
}
//class Teacher extends Person{
	//public Teacher(){
		//System.out.println(¡°new Teacher called¡±);
		//t.id="t00001";
		//this.id = "320105XXXXXXXX819";
	
   //}