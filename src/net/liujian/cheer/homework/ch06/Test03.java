package net.liujian.cheer.homework.ch06;

public class Test03 {

	public static void main(String[] args) {
		int [][] i={{123,123,12,41,31},
				   {1,3,24,12},
				   {234,412,412,413},
				   {67,1354,5125,5134}};
		//����һ�¶�ά��������ǳ���
		int length=0;
		for (int a =0;a<i.length;a++){
			length+=i[a].length;
		}
		//for (int [] a:i){
		//	length+=a.length;
		//}
		
         int [] h=new int[length];//���ն�ά����ĳ�������һ��һά����
	         int index = 0;
			  for(int[] u:i){//�Ѷ�ά�������ݵ��뵽һά������׼������
				for(int k:u){
					h[index++]=k;
				}
			}
			  ///ð������
			  for (int a=0;a<h.length-1;a++){
				  for(int u =h.length-1;u>a;u--){
					  if (h[u]<h[u-1]){
						  int j=h[u];
						  h[u-1]=j;
					  }

				  }
			  }
			  ///������õ������ٻ�ԭ��ԭ����������ȥ
			  index=0;
			  for(int g=0;g<i.length;g++){
				  for(int j=0;j<i[g].length;j++){
					  i[g][j]=h[index++];//ȡ��һά��������ݽ�����ά����
					 
				  }
				  
			  }
			 //��ӡ����
			  for (int[]u:i){
				  for(int k:u){
					 System.out.print (k+"  ");
				  }
				  System.out.println ("");
			  }
	}

}
