package net.liujian.cheer.demo.ch04;
import java.io.IOException;
import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) throws IOException{
		Scanner scanner =new Scanner (System.in);
		System.out.println("Input Score:");
		int score = scanner.nextInt();
		
		
		switch (score){//只能处理1.6以前的int|byte|
		case 60:
			 System.out.println("Leval 1");
			 break;
				case 70:
					 System.out.println("Leval 2");
					 break;
						case 80:
							 System.out.println("Leval 3");
							 break;
								case 90:
									 System.out.println("Leval 4");
									 break;
										case 100:
											 System.out.println("Leval 5");
											 break;
											 default:
												 System.out.println("Leval 0");
	}
	}

}
