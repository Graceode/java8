package com.J2SE;

import java.util.Arrays;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		Arrays.fill(array, 8);
		//����һ������Ϊ5����������array
		//������������Ԫ�ظ�ֵΪ8
		for(int i = 0;i<6;i++){
			//�ñ����ķ�ʽ��������������Ԫ�أ�ע��˴��Ŀ��������� i������
			System.out.println("array["+ i +"]=" +array[i]);
			//�±꽫�����ӵ�5����Ȼ�ǳ���������array�ķ�Χ��0��4���������ڵ�6��ѭ��ǰ�׳��쳣

		}
	}

}
