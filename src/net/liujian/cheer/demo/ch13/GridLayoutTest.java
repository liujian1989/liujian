package net.liujian.cheer.demo.ch13;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 924510816678221493L;
private static final String i = null;
public GridLayoutTest(){
	  setTitle("Grid Layout Test !");
	  setSize(400,400);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  setLayout(new GridLayout(6,6,1,1));
	  
	  
	  String [] buttonLael=new String []{
		"" ,"" ,"","","","",
	 };
	  for (int i=0;i<20;i++);
	  JButton button =new JButton (i +"");
	  add(button);
  }
	public static void main(String[] args) {
		JFrame f=new GridLayoutTest();
      f.setVisible(true);
	}

}
