package net.liujian.cheer.sample.ch05;

public class General {

	public static void main(String[] args) {
		String str =String.format("%d", 400/2);//�������ʮ���Ƹ�ʽ��ʾ
		String str2 =String.format("%b", 3>5);//�������boolean��ʾ
		String str3=String.format("%x", 200);//�������ʮ�����Ƹ�ʽ��ʾ
        System.out.println("400��һ����: "+str);
        System.out.println("3>5��ȷ��: "+str2);
        System.out.println("200��ʮ����������: "+str3);

	}

}
