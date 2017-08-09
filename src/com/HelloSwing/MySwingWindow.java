package com.HelloSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//此处通过继承JFrame类来使我们自己的MySwingWindow具有窗体的一些属性和方法
	public MySwingWindow(){
		//在窗体的构造方法中设置窗体的各项属性
		super();//使用 super() 来引用父类的成分，用 this 来引用当前对象
		this.add(getLabel(),null);
		this.add(getJTextField(), null);
		this.add(getJButton(),null);
        

        this.setSize(400, 300);
        //设置窗体的大小
        this.getContentPane().setLayout(null);
        //返回此窗体的 contentPane 对象，设置其布局
        //这一句不太懂的话也不用担心，先写着
        this.setTitle("My First Swing Window");
        this.setState(MAXIMIZED_HORIZ);
        //设置窗体的标题
	}
	private JLabel myLabel;
	private JLabel getLabel(){
		if(myLabel == null){
			myLabel =new JLabel();
			myLabel.setBounds(5, 10, 250, 30);
			myLabel.setText("HELLO ! WELCOME TO SHIYANLOU.COM");
			myLabel.setIcon(null);
		}
		return myLabel;
		
	}
	private JTextField myTextField;

	private JTextField getJTextField() {
	    //此处的返回值类型为JTextField

	    if(myTextField == null) {
	    //加上这个判断是为了防止出错

	        myTextField = new JTextField();
	        //实例化myTextField对象

	        myTextField.setBounds(5, 45, 200, 30);
	        //设置它的位置和尺寸

	        myTextField.setText("Shi Yan Lou");
	        //设定它要显示的字符串

	    }

	    return myTextField;
	    //返回这个实例
	}
	private JButton myButton;

	private JButton getJButton() {
	    //此处的返回值类型为JButton 

	    if(myButton == null) {

	        myButton = new JButton();
	        //实例化myTextField对象
	        myButton.setBounds(5, 80, 100, 40);
	        //设置它的位置和尺寸
	        myButton.setText("Click me!");
	        //设定它要显示的字符串
	        myButton.addActionListener(new ActionListener() {
	            //为其添加一个事件监听，从而使这个按钮可以响应用户的点击操作
	            //ActionListener是用于接收操作事件的侦听器接口。
	            //对处理操作事件感兴趣的类可以实现此接口，而使用该类创建的对
	            //可使用组件的 addActionListener 方法向该组件注册。
	            //在发生操作事件时，调用该对象的 actionPerformed 方法。

	            public void actionPerformed(ActionEvent e) {
	                //该方法会在发生操作时被调用，我们要做的事情就可以写在这里面
	                //比如我们下面要做的事情就是改变之前两个控件里面的文字颜色和背景色

	                myLabel.setForeground(Color.RED);
	                //设置此组件的前景色。
	                myTextField.setForeground(Color.green);
	                myTextField.setBackground(Color.BLUE);
	                //设置此组件的背景色。
	            }
	        });
	    }

	    return myButton;
	    //返回这个实例
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySwingWindow  window = new MySwingWindow ();
		window.setVisible(true);
	}

}
