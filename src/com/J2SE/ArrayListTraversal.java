package com.J2SE;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();	
		//�����б�list
		for (int i =0; i < 10; i++){
			list.add(i);
			//ʹ��add()������ͨ��forѭ����list������10��Ԫ��
			
		}
	System.out.println("Items in the list:");
	System.out.println(list);
	//����б���ȫ����Ԫ��
	System.out.println("Item in the list with odd index:");
	for (int i = 1;i<list.size();i+=2){
		// ����б������Ϊ������Ԫ�أ�ע�� i += 2 ���÷�
		System.out.println(list.get(i));
		//ʹ��get������list��ȡ��Ԫ��
	}
	System.out.println("Item in the list with evenindex:");
	for (int j = 0;j<list.size();j+=2){
		// ����б������Ϊż����Ԫ�أ�ע�� i += 2 ���÷�
		System.out.println(list.get(j)+ " ");
		//ʹ��get������list��ȡ��Ԫ��
	}
	
	}

}
