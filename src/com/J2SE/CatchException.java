package com.J2SE;

public class CatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		System.out.println("I am try block");
		Class.forName("");
		//声明一个空的Class对象用于引发“类未发现异常”
		System.out.println("Bye! Try block");
		
	}catch(ClassNotFoundException e){
		
		System.out.println("I am a catch block");
		e.printStackTrace();
		//printStackTrace()的意义在于在命令行打印异常信息在程序中出错的位置及原因
		System.out.println("GoodBye! Catch block.");
	}finally{
		System.out.println("I am finally block");
	}
	}

}
