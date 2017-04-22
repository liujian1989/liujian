package net.liujian.cheer.exercise.ch05;

public class Test502 {
		public static void main(String[] args) { 
			String str = new String("We are students");
			String str2 = new String("I like Java");
			//String newstr = str.substring(1,3);
			//String newstr2 = str2.substring(1,3);
			String newstr = str.substring(2,5);
			String newstr2 = str2.substring(2,5);
			if(newstr.equalsIgnoreCase(newstr2)){
				System.out.println("两个字符相同");
			}
			else{
				System.out.println("两个字符不相同");
			}
			}
		}
			
