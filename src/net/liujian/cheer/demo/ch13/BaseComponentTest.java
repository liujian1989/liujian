package net.liujian.cheer.demo.ch13;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BaseComponentTest extends JFrame {
    public BaseComponentTest(){
    	setTitle("Component Test");
    	setSize(600,600);
    	
    	setLayout(new GridLayout(10,1,5,5));
    	JPanel radioGroup =new JPanel();
    	
    	add(radioGroup);
    	radioGroup.setLayout(new FlowLayout());
    	ButtonGroup sexButtonGroup=new ButtonGroup();
    	
    	JRadioButton manRadio =new JRadioButton("男");
    	JRadioButton womanRadio =new JRadioButton("女");
    	
    	sexButtonGroup.add(manRadio);
    	sexButtonGroup.add(womanRadio);
    	
    	radioGroup.add(manRadio);
    	radioGroup.add(womanRadio);

    	JRadioButton hanRadio =new JRadioButton("汉");
    	JRadioButton noHanRadio =new JRadioButton("非汉");
    	ButtonGroup nationBttonGroup =new ButtonGroup();
    	radioGroup.add(hanRadio);
    	radioGroup.add(noHanRadio);
    	
    	JPanel checkoxBGroupPanel =new JPanel();
    	add(checkoxBGroupPanel);
    	checkoxBGroupPanel.setLayout(new FlowLayout());
    	ButtonGroup favButtonGroup=new ButtonGroup();
    	
    	JCheckBox sportCheckBox =new JCheckBox("运动");
    	JCheckBox bookCheckBox =new JCheckBox("阅读");
    	
    	checkoxBGroupPanel.add(sportCheckBox);
    	checkoxBGroupPanel.add(bookCheckBox);
    	JPanel downListPanel=new JPanel();
    	add(downListPanel);
    	downListPanel.setLayout(new FlowLayout());
    	JComboBox dropdown =(new JComboBox(new Object[]{"1","2","3","4"}));
    	
    }
	public static void main(String[] args) {
	JFrame frame=new BaseComponentTest();
	frame.setVisible(true);

	}

    }
