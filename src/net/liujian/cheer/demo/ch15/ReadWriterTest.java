package net.liujian.cheer.demo.ch15;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReadWriterTest {

	public static void main(String[] args) {
		JFrame f = new TextEditorFrame();
		f.setVisible(true);
	}

}

@SuppressWarnings("serial")
class TextEditorFrame extends JFrame {
	private static File editorFile =new File("D:/cheer2017/Editor.txt");	
	public TextEditorFrame() {
		setTitle("Text Editor");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		final JTextArea content = new JTextArea();
		add(content, BorderLayout.CENTER);
		JButton readerButton = new JButton("读");
		JButton writerButton = new JButton("写");
		
		
		readerButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				FileReader reader=null;
				// TODO Auto-generated method stub
				//System.out.println("读被点击");
				try{
					 reader =new FileReader(editorFile);
					char[]_content=new char[1024];
					int flag=-1;
					StringBuilder sb=new StringBuilder();
					while ((flag = reader.read(_content))!=-1){
						String eachContent=new String(_content,0,flag);
						sb.append(eachContent);
					}
					content.setText(sb.toString());
				}catch (Exception ee){
					
				}finally{
					try{
						if(reader!=null){
							reader.close();
						}
					}catch (Exception ee){
				}
			}
			}
		});
		writerButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				FileWriter writer=null;
				try{
					writer=new FileWriter(editorFile);
					String text=content.getText();
					writer.write(text);
					writer.flush();
				}catch(Exception ee){
					
				}finally{
					try{
						if(writer!=null){
							writer.close();
						}
						
					}catch(Exception eee){
						
					}
				}
				//System.out.println("写被点击");
			}
			
		});
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2));
		southPanel.add(readerButton);
		southPanel.add(writerButton);
		add(southPanel, BorderLayout.SOUTH);
	}

}