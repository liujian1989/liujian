package net.liujian.cheer.sample.ch09;

public class MathRondom {
	/**
	 * �������ż���ķ���
	 * @param num 1 ��ʼ��Χ����
	 * @param num 2��ֹ��Χ����
	 * @Return ����ķ�Χ��ż��
	 */
	public static int GetEvenNum(double num1,double num2){
		//���� num1~num2֮��������
		int s=(int) num1+(int) (Math.random()*(num2-num1));
		if (s% 2==0){    //�ж�������Ƿ�Ϊż��
			return s;    //����
		}else
			//���������
			return s+1;   //�������1�󷵻�
	}
	public static void main(String[] args) {
		//���ò������������
		System.out.println("����һ��2~32֮���ż��: "+GetEvenNum(2,32));
	}

}
