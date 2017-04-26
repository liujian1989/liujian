package net.liujian.cheer.homework.ch06;

public class Test03 {

	public static void main(String[] args) {
		int [][] i={{123,123,12,41,31},
				   {1,3,24,12},
				   {234,412,412,413},
				   {67,1354,5125,5134}};
		//计算一下二维数组的真是长度
		int length=0;
		for (int a =0;a<i.length;a++){
			length+=i[a].length;
		}
		//for (int [] a:i){
		//	length+=a.length;
		//}
		
         int [] h=new int[length];//按照二维数组的长度申请一个一维数组
	         int index = 0;
			  for(int[] u:i){//把二维数组内容导入到一维数组中准备排序
				for(int k:u){
					h[index++]=k;
				}
			}
			  ///冒泡排序
			  for (int a=0;a<h.length-1;a++){
				  for(int u =h.length-1;u>a;u--){
					  if (h[u]<h[u-1]){
						  int j=h[u];
						  h[u-1]=j;
					  }

				  }
			  }
			  ///把排序好的数据再还原到原来的数组中去
			  index=0;
			  for(int g=0;g<i.length;g++){
				  for(int j=0;j<i[g].length;j++){
					  i[g][j]=h[index++];//取出一维数组的数据交给二维数组
					 
				  }
				  
			  }
			 //打印内容
			  for (int[]u:i){
				  for(int k:u){
					 System.out.print (k+"  ");
				  }
				  System.out.println ("");
			  }
	}

}
