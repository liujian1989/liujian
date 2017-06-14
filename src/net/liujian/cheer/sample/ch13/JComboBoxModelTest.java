package net.liujian.cheer.sample.ch13;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class JComboBoxModelTest extends JFrame {
	JComboBox<String> jc=new JComboBox<>(new MyComboBox());  //此处应用了JDK7的新特性
	JLabel jl=new JLabel("请选择证件:");
	public JComboBoxModelTest(){
		setSize(new Dimension(160, 180));
		setVisible(true);
		setTitle("在窗口中设置下拉列表框");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jl);
		cp.add(jc);
	}
	public static void main(String[] args) {
		new JComboBoxModelTest();
	}

}
@SuppressWarnings("serial")
class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
	String selecteditem=null;
	String[] test={"身份证","军人证","学生证","工作证"};
	public String getElementAt(int index){    //根据索引返回值
		return test[index];
	}

	@Override
	public int getSize() {        //返回下拉列表框中项目的数目
		return test.length;
	}

	@Override
	public void setSelectedItem(Object item) { //设置下拉列表框项目
		selecteditem =(String)item;
		
	}

	@Override
	public Object getSelectedItem() {     //获取下拉列表框中的项目
		return selecteditem;
	}
	public int getIndex() {
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}