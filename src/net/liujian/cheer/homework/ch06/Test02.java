package net.liujian.cheer.homework.ch06;

public class Test02 {

	public static void main(String[] args) {
		
      int [][]i={{123,131,3123,12312,21},//��ά���������������forѭ��
    		     {23561,223,12},
    		     {1231},
    		     {124531,56215,72653},
    		     {223,2412,451,5,13}};
      for (int k=0;k<i.length;k++){      //��������
    	  for(int u=0;u<i[k].length;u++){    //��������
    		  System.out.print(i[k][u]+"  ");
    	  }
    	  System.out.println();
      }
      
      
      
      for(int[]r:i){
    	  for(int c:r){
    		  System.out.print(c+"  ");
    	  }
    	  System.out.println();
      }
	}

}
