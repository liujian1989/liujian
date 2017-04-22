package net.liujian.cheer.demo.ch09;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateTest {

	public static void main(String[] args) throws Exception{
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		//date = new Date(2017,4,1);//月份从0开始
		System.out.println(date);
		
		java.text.DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:aa");
		System.out.println(df.format(new Date()));
		
		Date _date = df.parse("22/04/2017 16:30:31");
		System.out.println(df.format(_date));
		Calendar c =Calendar.getInstance();
		
		//Calendar gc =new GregorianCalendar();
		
		c.setTime( _date);
		c.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println();
	}

	}


