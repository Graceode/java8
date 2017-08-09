package com.J2SE;

import java.util.Scanner;

public class StringTools {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String();
		String b = new String();
		String c = new String();
		//创建3个字符串对象
		Scanner scan = new Scanner(System.in);//创建扫描器
		System.out.println("please input a sentence with 10 more letters include spaces:");
		//获得用户输入的包括空格的字符串
		a = scan.nextLine();
		//将键盘上的输入赋到字符串a中
		b = a.trim();
		//将a中头部和尾部的空格去掉，赋值到b中
		if(b.equals("shiyanlou"))
			c = b.substring(0,6);
		else{
			c = "";
			//如果b字符串为shiyanlou,则取第0个到第6个字符作为字串，赋值到c
			//如果b字符串不为shiyanlou,则c的值为空
			
		}
		System.out.println("a :"+a);
		System.out.println("the length of a is :"+a.length());
		System.out.println("b:"+b);
		System.out.println("the length of b is:"+b.length());
		System.out.println("c :"+c);
		System.out.println("the length of c is"+c.length());
		
	}

}
