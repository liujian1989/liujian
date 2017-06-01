package net.liujian.cheer.sample.ch13;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutPosition extends JFrame {
	//定义组件摆放位置的数组
	String[] border ={BorderLayout.CENTER,BorderLayout.NORTH,
			BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String[] buttonName={"center button","north button",
			"south button","west button","east button"};
	public BorderLayoutPosition(){
		setTitle("这个窗体使用边界布局管理器");
		Container c=getContentPane();    //定义一个容器
		setLayout(new BorderLayout());  //设置容器为边界布局管理器
		for (int i=0;i<border.length;i++){
			//在容器中添加按钮，并设置按钮布局
			c.add(border[i],new JButton(buttonName[i]));
		}
		setVisible(true);            //使窗体可见
		setSize(350,200);             //设置窗体大小
		//设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayoutPosition();

	}

}
