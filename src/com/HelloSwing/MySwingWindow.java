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
	//�˴�ͨ���̳�JFrame����ʹ�����Լ���MySwingWindow���д����һЩ���Ժͷ���
	public MySwingWindow(){
		//�ڴ���Ĺ��췽�������ô���ĸ�������
		super();//ʹ�� super() �����ø���ĳɷ֣��� this �����õ�ǰ����
		this.add(getLabel(),null);
		this.add(getJTextField(), null);
		this.add(getJButton(),null);
        

        this.setSize(400, 300);
        //���ô���Ĵ�С
        this.getContentPane().setLayout(null);
        //���ش˴���� contentPane ���������䲼��
        //��һ�䲻̫���Ļ�Ҳ���õ��ģ���д��
        this.setTitle("My First Swing Window");
        this.setState(MAXIMIZED_HORIZ);
        //���ô���ı���
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
	    //�˴��ķ���ֵ����ΪJTextField

	    if(myTextField == null) {
	    //��������ж���Ϊ�˷�ֹ����

	        myTextField = new JTextField();
	        //ʵ����myTextField����

	        myTextField.setBounds(5, 45, 200, 30);
	        //��������λ�úͳߴ�

	        myTextField.setText("Shi Yan Lou");
	        //�趨��Ҫ��ʾ���ַ���

	    }

	    return myTextField;
	    //�������ʵ��
	}
	private JButton myButton;

	private JButton getJButton() {
	    //�˴��ķ���ֵ����ΪJButton 

	    if(myButton == null) {

	        myButton = new JButton();
	        //ʵ����myTextField����
	        myButton.setBounds(5, 80, 100, 40);
	        //��������λ�úͳߴ�
	        myButton.setText("Click me!");
	        //�趨��Ҫ��ʾ���ַ���
	        myButton.addActionListener(new ActionListener() {
	            //Ϊ�����һ���¼��������Ӷ�ʹ�����ť������Ӧ�û��ĵ������
	            //ActionListener�����ڽ��ղ����¼����������ӿڡ�
	            //�Դ�������¼�����Ȥ�������ʵ�ִ˽ӿڣ���ʹ�ø��ഴ���Ķ�
	            //��ʹ������� addActionListener ����������ע�ᡣ
	            //�ڷ��������¼�ʱ�����øö���� actionPerformed ������

	            public void actionPerformed(ActionEvent e) {
	                //�÷������ڷ�������ʱ�����ã�����Ҫ��������Ϳ���д��������
	                //������������Ҫ����������Ǹı�֮ǰ�����ؼ������������ɫ�ͱ���ɫ

	                myLabel.setForeground(Color.RED);
	                //���ô������ǰ��ɫ��
	                myTextField.setForeground(Color.green);
	                myTextField.setBackground(Color.BLUE);
	                //���ô�����ı���ɫ��
	            }
	        });
	    }

	    return myButton;
	    //�������ʵ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySwingWindow  window = new MySwingWindow ();
		window.setVisible(true);
	}

}
