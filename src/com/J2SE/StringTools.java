package com.J2SE;

import java.util.Scanner;

public class StringTools {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String();
		String b = new String();
		String c = new String();
		//����3���ַ�������
		Scanner scan = new Scanner(System.in);//����ɨ����
		System.out.println("please input a sentence with 10 more letters include spaces:");
		//����û�����İ����ո���ַ���
		a = scan.nextLine();
		//�������ϵ����븳���ַ���a��
		b = a.trim();
		//��a��ͷ����β���Ŀո�ȥ������ֵ��b��
		if(b.equals("shiyanlou"))
			c = b.substring(0,6);
		else{
			c = "";
			//���b�ַ���Ϊshiyanlou,��ȡ��0������6���ַ���Ϊ�ִ�����ֵ��c
			//���b�ַ�����Ϊshiyanlou,��c��ֵΪ��
			
		}
		System.out.println("a :"+a);
		System.out.println("the length of a is :"+a.length());
		System.out.println("b:"+b);
		System.out.println("the length of b is:"+b.length());
		System.out.println("c :"+c);
		System.out.println("the length of c is"+c.length());
		
	}

}
