package net.liujian.cheer.demo.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ExternalizableTest {
	public static final DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) throws Exception {
		User u=new User();
		u.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		u.setName("zhangsan");
		u.setBirthday(df.parse("1989-04-05"));
		System.out.println("Varrible [u] ->"+u);
		//File.separatorChar
		ObjectOutputStream out=null;
		FileOutputStream outFile=null;
		try{
		outFile=new FileOutputStream("D:"+File.separatorChar+"cheer2017/Test0/object.txt");
		out =new ObjectOutputStream(outFile);
		out.writeObject(u);
		out.flush();
		}finally{
			if(outFile!=null){
				outFile.close();
			}
			if(out!=null){
				out.close();
			}
		}
		
		
		ObjectInputStream in=null;
		FileInputStream inFile=null;
		try{
		inFile=new FileInputStream("D:"+File.separatorChar+"cheer2017/Test0/object.txt");
		in =new ObjectInputStream(inFile);
		Object _p=in.readObject();
		if(_p instanceof Person){
			@SuppressWarnings("unused")
			User __p=(User) _p;
			System.out.println("Varrible [__p] ->"+__p);
		}
		}finally{
			if(inFile!=null){
				inFile.close();
			}
			if(in!=null){
				in.close();
			}
		}
	}

}

class User implements java.io.Externalizable{
private static final long serialVersionUID = 7998596684191773558L;
private String id;
private String name;
private Date birthday;
private String password;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirthday() {
	return birthday;
}

public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public void setPassword(String password){
	this.password =password;
}
public String getPassword() {
	return password;
}
public String toString(){
	StringBuilder sb=new StringBuilder(1024);
	sb.append(getClass().getName()).append("[\n").append("id=").append(getId()).append("\n")
			.append("name=").append(getName()).append("\n").append("birthday=").append(getBirthday())
			.append("\n").append("password=").append(getPassword()).append("\n").append("]");
	return sb.toString();
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(getId());
	out.writeObject(getName());
	out.writeObject(getBirthday());
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	setId((String)in.readObject());
	setName((String)in.readObject());
	setBirthday((Date)in.readObject());
}


}