package net.liujian.cheer.sample.ch05;

public class Division {

	public static void main(String[] args) {
		String str ="192.168.0.1";//�����ַ���
		String[]firstArray = str.split("\\.");//���ա��������зָʹ��ת���ַ���\\����
		String[]secondArray = str.split("\\.",2);//���ա������������ηָʹ��ת���ַ���\\����
		System.out.println("str��ԭֵΪ: ["+str+"]");//���strԭֵ
		System.out.print("ȫ���ָ�Ľ��: ");//���ȫ���ָ�Ľ��
		for (String a:firstArray){
			System.out.print("["+a+"]");
			}
		System.out.println();//����
		System.out.print("�ָ����εĽ��: ");
		for (String a:secondArray){
			System.out.print("["+a+"]");
		}
		System.out.println();
		}

}
