package net.liujian.cheer.sample.ch13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition(){
		setTitle("本窗体使用流布局管理器");  //设置窗体标题
		Container c=getContentPane();
		//设置窗体使用流布局管理器，使组建对齐，并且设置组建之间的水平间隔与垂直间隔
		setLayout(new FlowLayout(2,10,10));
		for (int i=0;i<100;i++){   //在容器中循环添加10个按钮
			c.add(new JButton("button"+i));		
		}
		setSize(300,200);            //设置窗体大小
		setVisible(true);          //设置窗体可见
		//设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FlowLayoutPosition();
	}

}
