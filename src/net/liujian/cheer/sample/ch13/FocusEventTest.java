package net.liujian.cheer.sample.ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FocusEventTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FocusEventTest(){
		setSize(250,100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());
		final JLabel label = new JLabel();
		getContentPane().add(label);
		JTextField jt=new JTextField("请单击其他文本框",10);  //创建一个文本框
		JTextField jt2=new JTextField("请单击我",10);      //创建另一个文本框
		cp.add(jt);
		cp.add(jt2);
		jt.addFocusListener(new FocusListener(){
			//组件失去焦点时调用的方法
			@Override
			public void focusLost(FocusEvent args0) {
				JOptionPane.showMessageDialog(null, "文本框失去焦点");
			}
			//组件获取焦点时调用的方法
			@Override
			public void focusGained(FocusEvent args0) {
				// TODO Auto-generated method stub
				
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new FocusEventTest();
	}

}
