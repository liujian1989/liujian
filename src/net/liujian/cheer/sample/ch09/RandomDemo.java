package net.liujian.cheer.sample.ch09;
import java.util.Random;
public class RandomDemo {

	public static void main(String[] args) {
		Random r= new Random();//ʵ����һ��Random��
		//�������һ������
	  System.out.println("�������һ������: "+r.nextInt());
	  //�������һ�����ڵ���0��С��10������
	  System.out.println("�������һ�����ڵ���0��С��10������: "+r.nextInt(10));
	  //�������һ�������͵�ֵ
	  System.out.println("�������һ�������͵�ֵ�� "+r.nextBoolean());
	  //�������һ��˫�����͵�ֵ
	  System.out.println("�������һ��˫�����͵�ֵ�� "+r.nextDouble());
	  //�������һ�������͵�ֵ
	  System.out.println("�������һ�������͵�ֵ: "+r.nextFloat());
	  //�������һ�������ܶȸ�˹�ֲ���˫����ֵ
	  System.out.println("�������һ�������ܶȸ�˹�ֲ���˫����ֵ: "+r.nextGaussian());
	}

}
