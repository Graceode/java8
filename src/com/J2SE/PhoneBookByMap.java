package com.J2SE;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> phonebook = new HashMap<String, String>();
		//����һ��HashMap ��������Ϊphonebook
		Scanner scan = new Scanner(System.in);// ����ɨ�������ڻ�ȡ�û�������
		String keyword = new String();
		// ����һ����Ϊkeyword���ַ������ڴ���û�����Ĺؼ���
		phonebook = initPhoneBook(phonebook);
		// ������д��initPhoneBook����Ϊ�绰��װ�����ݣ�������ʼ���Ĳ���
		System.out.println("Please input a name that you want to search : ");
		keyword = scan.nextLine();
		while (keyword.isEmpty()){
			System.out.println("please input a name!");
			keyword = scan.nextLine();
		}
		System.out.println("The result is : ");
		System.out.println(queryPhone(phonebook,keyword));
		//�����������д��queryPhone��������
		scan.close();
		
	}

	private static String queryPhone(HashMap<String, String> phonebook, String keyword) {
		// TODO Auto-generated method stub
		String result = new String();
		result = phonebook.get(keyword);
		// ʹ��get()������ѯkeyword����Ӧ�ĵ绰���룬������result
        // put()�����У�����Ϊ�ؼ���key������ֵΪ���Ӧ��ֵvalue��δ�ҵ���Ӧֵʱ������ֵΪnull
		if(result == null)
			return "Can not find this user.";
		return result;
	}

	private static HashMap<String, String> initPhoneBook(HashMap<String, String> phonebook) {
		// TODO Auto-generated method stub
		// �÷����������ָ��HashMap�ĳ�ʼ����Ϊ��װ��һЩ�������ݣ���Ҳ�����Զ�����Щ����
		phonebook.put("steve", "1302123456");
		phonebook.put("Bob", "1435123456");
		phonebook.put("Peter", "13145123456");
		// ʹ��put()������������绰������������������Ϊphonebook��HashMap��
        // put()�����У���һ������Ϊ�ؼ���key���ڶ�������Ϊ���Ӧ��ֵvalue
		return phonebook;
		//�����޸ĺ��phonebook
	}

}
