package com.J2SE;

public class MyAriException extends ArithmeticException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	�Զ����쳣�࣬����̳�ArithmeticException
	public MyAriException(){
		//ʵ��Ĭ�ϵ��޲ι��췽��
	}
	public MyAriException(String msg){
		super(msg);
	}
	 //ʵ�ֿ����Զ��������Ϣ�Ĺ��췽�������������Ϣ��Ϊ�������뼴��
	

}
