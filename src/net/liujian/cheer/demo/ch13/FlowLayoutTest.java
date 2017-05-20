package net.liujian.cheer.demo.ch13;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FlowLayoutTest extends JFrame {
public FlowLayoutTest (){
	  setSize(400,300);
	  setTitle("My Base Layout");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setLayout(new FlowLayout(SwingConstants.LEFT,10,10));
	  
	  for (int i=0;i<100;i++){
		  JLabel label =new JLabel("Welcome,Swing !");
		  add(label);
	  }
	  setVisible(true);
}
	public static void main(String[] args) {
		new FlowLayoutTest();

	}

}
