package net.liujian.cheer.demo.ch13;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.liujian.cheer.demo.ch13.MyIcon;
public class SwingBaseTest extends JFrame {
	static final long serialVersionUID =8702344263219784655L;
public SwingBaseTest(){
	setSize(300,200);
	setTitle("My JFrame");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	//new MyDailog(this);
	JLabel welcome=new JLabel("Hello, Swing, Wclcome");
	JLabel icon =new JLabel(new  MyIcon());
	//add(welcome);
	add(icon);
	pack();
    }
	public static void main(String[] args) {
     new SwingBaseTest();
	}
    }
  class MyJDailog extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = -568983638841422246L;
	public MyJDailog(JFrame frame){
		setTitle("My Dialog");
		setSize(100,60);
		setVisible(true);
	}
    }   
class MyIcon implements Icon{
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.drawOval(0, 0, 25, 25);
	}
	@Override
	public int getIconWidth() {
		return 30;
	}
	@Override
	public int getIconHeight() {
		return 30;
	}
    }

