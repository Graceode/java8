package com.J2SE;

public class CatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		System.out.println("I am try block");
		Class.forName("");
		//����һ���յ�Class����������������δ�����쳣��
		System.out.println("Bye! Try block");
		
	}catch(ClassNotFoundException e){
		
		System.out.println("I am a catch block");
		e.printStackTrace();
		//printStackTrace()�����������������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
		System.out.println("GoodBye! Catch block.");
	}finally{
		System.out.println("I am finally block");
	}
	}

}
