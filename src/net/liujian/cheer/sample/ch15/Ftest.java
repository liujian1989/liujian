package net.liujian.cheer.sample.ch15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ftest extends JFrame {  //創建類，繼承JFrame類     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane =null;         //創建面板對象
	private JTextArea jTextArea =null;         //創建文本域對象
	private JPanel controlPanel =null;         //創建面板對象
	private JButton openButton  =null;         //創建按鈕對象
	private JButton closeButton =null;         //創建按鈕對象
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setVgap(1);
			controlPanel = new JPanel();
			controlPanel.setLayout(flowLayout);
			controlPanel.add(getOpenButton(), null);
			controlPanel.add(getCloseButton(), null);
		}
		return controlPanel;
	}
	private JButton getOpenButton(){
		if (openButton==null){
			openButton=new JButton();
			openButton.setText("寫入文件");            //修改按鈕的提示信息
			openButton.addActionListener(new ActionListener(){
				//按鈕的單擊事件
				public void actionPerformed(ActionEvent e){
					//創建文件對象
					File file =new File("word.txt");
					try{
						//創建FileWriter對象
						FileWriter out=new FileWriter(file);
						//獲取文本域中文本
						String s=jTextArea.getText();
						out.write(s);             //將信息寫入磁盤文件
						out.close();               //將流關閉
					}catch(Exception e1){
						e1.printStackTrace();
					}
				}
			});
		}
		return openButton;
	}
	private JButton getCloseButton(){
		if (closeButton==null){
			closeButton=new JButton();
			closeButton.setText("讀取文件");            //修改按鈕的提示信息
			closeButton.addActionListener(new ActionListener(){
				//按鈕的單擊事件
				public void actionPerformed(ActionEvent e){
					//創建文件對象
					File file =new File("word.txt");
					try{
						//創建FileReader對象
						FileReader in=new FileReader(file);
						char byt[]=new char[1024];   //創建char型數組
						int len=in.read(byt);       //將字節讀入數組
						//設置文本域的現實信息
						jTextArea.setText(new String(byt,0,len));
						in.close();                //關閉流
					}catch(Exception e1){
						e1.printStackTrace();
					}
				}
			});
		}
		return closeButton;
	}
	public Ftest(){
		super();
		initialize();
	}
	private void initialize(){
		this.setSize(300,200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}
	private JPanel getJContentPane(){
		if(jContentPane==null){
			jContentPane=new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJTextArea(),BorderLayout.CENTER);
			jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;	
	}
	public static void main(String[] args) {     //主方法
		Ftest thisClass=new Ftest();            //創建本類對象
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);         //設置該窗體為顯示狀態
	}
}
