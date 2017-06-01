package net.liujian.cheer.sample.ch13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition(){
		Container c=getContentPane();
		//设置容器使用网格布局管理器，设置7行3列的网格
		setLayout(new GridLayout(7,3,5,5));
		for(int i=0;i<20;i++){
			c.add(new JButton("button"+i));   //循环添加按钮
		}
			setSize(300,200);
			setTitle("这是一个使用网格布局管理器的窗体");
			setVisible(true);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridLayoutPosition();
	}

}
