package net.liujian.cheer.sample.ch05;
import java.util.Date;//����java.util.Date��
public class Eval {   //�½���

	public static void main(String[] args) {    //������
		Date date = new Date();    //����Date����date
		String year = String.format("%tY", date);  //��date���и�ʽ��
		String month = String.format("%tB",date);
		String day =String.format("%td",date);
		System.out.println("������: "+year+"��");//�����Ϣ
		System.out.println("������: "+month);
		System.out.println("������: "+day+"��");
	}

}
