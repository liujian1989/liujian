package net.liujian.cheer.sample.ch13;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class JButtonTest extends JFrame {
	public JButtonTest(){
		URL url=MyImageIcon.class.getResource("/D:/cheer2017/repository/liujian/src/net/liujian/cheer/sample/ch13/imageButton.jpg");
		Icon icon=new ImageIcon(url);
		setLayout(new GridLayout(3,2,5,5));   //设置网格布局管理器
		Container c=getContentPane();     //创建容器
		for(int i=0;i<5;i++){
			//创建按钮，同时设置按钮文字与图标
			JButton J=new JButton("button"+i,icon);
			c.add(J);                 //在容器中添加按钮
			if (i%2==0){
				J.setEnabled(false);       //设置其中一些按钮不可用
			}
		}
		JButton jb=new  JButton();       //实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(90,30));   //设置按钮与图片相同大小
		jb.setIcon(icon);         
		jb.setHideActionText(true);          
		jb.setToolTipText("图片按钮");             //设置按钮提示信息为文字
		jb.setBorderPainted(false);           //设置按钮边界不显示
		jb.addActionListener(new ActionListener(){    //为按钮添加监听事件
			public void actionPerformed(ActionEvent e){
				//弹出确认对话框
				JOptionPane.showMessageDialog(null,"弹出对话框");
			}
		});
		c.add(jb);
		setTitle("带滚动条的文字编译器");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButtonTest();

	}

}
