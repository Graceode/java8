package com.J2SE;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> phonebook = new HashMap<String, String>();
		//创建一个HashMap 对象，名称为phonebook
		Scanner scan = new Scanner(System.in);// 创建扫描器用于获取用户的输入
		String keyword = new String();
		// 创建一个名为keyword的字符串用于存放用户输入的关键词
		phonebook = initPhoneBook(phonebook);
		// 利用自写的initPhoneBook方法为电话簿装入数据，完成其初始化的步骤
		System.out.println("Please input a name that you want to search : ");
		keyword = scan.nextLine();
		while (keyword.isEmpty()){
			System.out.println("please input a name!");
			keyword = scan.nextLine();
		}
		System.out.println("The result is : ");
		System.out.println(queryPhone(phonebook,keyword));
		//这里调用了自写的queryPhone（）方法
		scan.close();
		
	}

	private static String queryPhone(HashMap<String, String> phonebook, String keyword) {
		// TODO Auto-generated method stub
		String result = new String();
		result = phonebook.get(keyword);
		// 使用get()方法查询keyword所对应的电话号码，并赋给result
        // put()方法中，参数为关键词key，返回值为其对应的值value，未找到对应值时，返回值为null
		if(result == null)
			return "Can not find this user.";
		return result;
	}

	private static HashMap<String, String> initPhoneBook(HashMap<String, String> phonebook) {
		// TODO Auto-generated method stub
		// 该方法用于完成指定HashMap的初始化，为其装入一些号码数据，你也可以自定义这些数据
		phonebook.put("steve", "1302123456");
		phonebook.put("Bob", "1435123456");
		phonebook.put("Peter", "13145123456");
		// 使用put()方法将姓名与电话号码相关联，存放在名为phonebook的HashMap中
        // put()方法中，第一个参数为关键词key，第二个参数为其对应的值value
		return phonebook;
		//返回修改后的phonebook
	}

}
