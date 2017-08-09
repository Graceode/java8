package com.J2SE;

public class MyAriException extends ArithmeticException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	自定义异常类，该类继承ArithmeticException
	public MyAriException(){
		//实现默认的无参构造方法
	}
	public MyAriException(String msg){
		super(msg);
	}
	 //实现可以自定义输出信息的构造方法，将待输出信息作为参数传入即可
	

}
