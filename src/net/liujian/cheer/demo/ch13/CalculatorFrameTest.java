package net.liujian.cheer.demo.ch13;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalculatorFrameTest extends JFrame {
	private static final long serialVersionUID = -7478733848061006965L;
	public CalculatorFrameTest(){
		  setTitle("Calculator");
		  setSize(400,400);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setLayout(new BorderLayout());
		  JTextField showField =new JTextField("0");
		  showField.setSize(400,150);
		  add(showField,BorderLayout.NORTH);
		  JPanel center=new JPanel();
		  add(center,BorderLayout.SOUTH);
		  center.setLayout(new GridLayout(6,6,1,1));
		  String[] buttonLabel =new String[]{
				  "Lsh","Rsh","Or","Xar","Not","And",
				  "|","Mcd","CE","C","<-","/",
				  "A","B","7","8","9","*",
				  "C","D","4","5","6","-",
				  "E","F","1","2","3","+",
				  "(",")","+-","0","","=",
		  };
		  for (int i=0;i<36;i++){
			  JButton button =new JButton (buttonLabel[i]);
			  center.add(button);
			  if("".equals(buttonLabel[i])){
				  button.setEnabled(false);
			  }
		  }
	}
	public static void main(String[] args) {
	
    JFrame frame =new  CalculatorFrameTest();
      frame.setVisible(true);
	}

}
