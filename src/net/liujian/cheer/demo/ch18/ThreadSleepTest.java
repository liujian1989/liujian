package net.liujian.cheer.demo.ch18;

import java.util.Random;

import javax.swing.JFrame;

import com.sun.prism.paint.Color;

public class ThreadSleepTest {
	public static void main(String[] args) {
		EventQuene.invokeLater(new Runnable(){
			public void run(){
				new ThreadSleepFrame();
			}
		});
	}
}
class ThreadSleepFrame extends JFrame{
	private static final long serialVersionUID=-5044691387242215033L;
	private static Color[] colors={
		Color.RED,
		Color.BLUE
		Color.BLACK,
		Color.CYAN,
		Color.YRLLOW,
		Color.GREEN,
		Color.MAGENTA,
		Color.WHITE,
	};
	public ThreadSleepFrame(){
		setTitle("Thread Sleep Test");
		setSize(300,200);
		setVisible(true);
		new Thread (new Runnable(){
			int x=30;
			int y=50;
			@Override
			public void run() {
				while(true){
					Random r=new Random();
					int index =r.nextInt(colors.length-1);
					Grapics g=getGraphics();
					g.setColor(colors[index]);
				}
				
				
			}
		});
	}
	
}