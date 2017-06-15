package net.liujian.cheer.sample.ch13;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleEvent extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jb=new JButton("我是按钮，单击我");
	public SimpleEvent(){
		setLayout(null);
		setSize(200,100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.add(jb);
		jb.setBounds(10, 10,100,30);
		jb.addActionListener(new jbAction());
		setVisible(true);
	}
	class jbAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			jb.setText("我被单击了");
		}
	}
	public static void main(String[] args) {
		new SimpleEvent();
	}
}

/***
 * 
 * import java.awt.Container;
import java.awt.event.ActionListener;

import javafx.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SimpleEvent extends JFrame{
	private JButton jb=new JButton("我是按钮，单击我");
			public SimpleEvent(){
				setLayout(null);
				setSize(200,100);
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				Container cp=getContentPane();
				cp.add(jb);
				jb.setBounds(10,10,100,30);
				//为按钮添加一个实现ActionListener接口的对象
				jb.addActionListener(new jbAction());
				setVisible(true);
			}
			//定义内部类实现ActionListener接口
			abstract class jbAction implements ActionListener{//重写actionPerformed()方法
				public void actionPerformed(ActionEvent arg0) {
					jb.setText("我被单击了");
				}
			}
	public static void main(String[] args) {
		new SimpleEvent();
	}

}**///
