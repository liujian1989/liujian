package net.liujian.cheer.demo.ch07;

public class JFrameTest {

	public static void main(String[] args) {
	//new

	}

}
 public class DemoFrame extends JFrame{
	private static final long serialVersionUID = -3546828821114521125L;
	public DemoFrame(){
		this.setTitle("Hello My JFrame");
		this.setSize(400,300);
		this.setDefaulCloseOperation(JFrame.EXIT-ONCLOSE);
	}
}