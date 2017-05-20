package net.liujian.cheer.demo.ch13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerTest extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = -5905712514689969116L;
    public ActionListenerTest (){
	setTitle("Action Listener Test");
	setSize(200,200);
	JButton exit =new JButton();
	exit.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("You click exit button");
			System.exit(0);
		}
	    });
	   add(exit);
        }
public static void main(String[] args){
	JFrame frame =new ActionListenerTest();
	 frame.setVisible(true);
       }
       }
 