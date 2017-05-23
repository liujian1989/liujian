package net.liujian.cheer.javaBiJi.ch04;

public class XY {

	public static void main(String[] args) {
int [][] cords ={{1,2,3},{4,5,6}};      //声明二位数组并赋初始值
for (int x=0;x<cords.length;x++){     //得知有几列
	for (int y=0;y<cords[x].length;y++){  //取得每列的长度
		System.out.println(cords [x][y]);
		//System.out.printf("%2d",cords[x][y]);
		                               }
}

	}

}
