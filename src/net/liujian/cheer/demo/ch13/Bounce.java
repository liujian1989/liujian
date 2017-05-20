package net.liujian.cheer.demo.ch13;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bounce {

	public static void main(String[] args) {
   JFrame frame=new BounceFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
	}
}
class BounceFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7867360031910557846L;
	//private static final int DELAY=20;
	private static final int STEPS=1000;
	private BallComponent comp;
	public BounceFrame(){
		setTitle("Bounce");
		comp =new BallComponent();
		add(comp,BorderLayout.CENTER);
		JPanel buttonPanel =new JPanel();
		addButton(buttonPanel,"Start",new ActionListener(){
			@Override
		})
		
	}
	
}
