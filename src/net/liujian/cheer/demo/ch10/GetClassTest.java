package net.liujian.cheer.demo.ch10;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.Format;
import java.text.SimpleDateFormat;

public class GetClassTest {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.getClass().getName());
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.getClass().getName());
		
		Format f = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.getClass().getName());
		
		Object o = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(o.getClass().getName());
		//Object oo = new DecimalFormat("#,oo");
		//formatPrint(o,"2017-04-23");
		//formatPrint(oo,111.222.d);
		
	}
 private static void printDate(Object f,Object date){
	 System.out.println(f.getClass().getName());
	 System.out.println(date.getClass().getName());
	
	 if (sdf.getClass().equals(SimpleDateFormat.class)){
		 System.out.println("getClass:sdf is simpleDateFormat.class");
	 }
	 
	 
	 if (f instanceof DateFormat
			 ||f instanceof SimpleDateFormat){
		 DateFormat formatter = (DateFormat)  f;
		 if(date instanceof String ){
			 String date =(String) date;
		 System.out.println(formatter.parse(date));
	 }
 }
	 else if( f instanceof NumberFormat
			 || DecimalFormat){
		 DecimalFormat formatter= (DecimalFormat)f;
		 if(date instanceof Number ){
			
		 System.out.println(formatter.format(date));
	 }
 }
	 }
 }
 
