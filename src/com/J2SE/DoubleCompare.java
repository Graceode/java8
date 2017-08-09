package com.J2SE;

public class DoubleCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s_1 = "123.321";
		String s_2 = "567.765";
		String s_3 = "ABC";
		String s_4 = "abc";
		System.out.println("ABC的小写是： "+s_3.toLowerCase());
		System.out.println("abc的大写是"+s_4.toUpperCase());
		//显然，这里的123.321和567.765都不是数值，而是“一句话”
		//你也可以自定义这些数字
		Double num_1 = Double.parseDouble(s_1);
		Double num_2 = Double.parseDouble(s_2);
		//parseDouble(String s)就是Double类中自带的将字符串中的数字转换为double类型的方法。
		System.out.println("number 1 : "+num_1);
		System.out.println("number 2: "+num_2);
		switch (num_1.compareTo(num_2)){
		case -1:
			System.out.println("number 1 is smaller than number 2");
			break;
		case 0:
			System.out.println("number 1 is equal to number 2");
			break;
		case 1:
			System.out.println("number 1 is bigger than number 2");
			break;
			//compareTo(Double anotherDouble)也是Double类提供的一个方法，
			//用于比较两个Double类型数据的大小，返回值为int类型，-1、0、1分别代表小于、等于和大于。
		}
	}

}
