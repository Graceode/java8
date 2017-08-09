package com.J2SE;

import java.util.Arrays;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		Arrays.fill(array, 8);
		//声明一个长度为5的整形数组array
		//将该数组所有元素赋值为8
		for(int i = 0;i<6;i++){
			//用遍历的方式，输出所有数组的元素，注意此处的控制条件是 i＜　６
			System.out.println("array["+ i +"]=" +array[i]);
			//下标将会增加到5，显然是超出了数组array的范围（0到4），程序将在第6次循环前抛出异常

		}
	}

}
