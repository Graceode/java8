package com.J2SE;

public class DoubleCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s_1 = "123.321";
		String s_2 = "567.765";
		String s_3 = "ABC";
		String s_4 = "abc";
		System.out.println("ABC��Сд�ǣ� "+s_3.toLowerCase());
		System.out.println("abc�Ĵ�д��"+s_4.toUpperCase());
		//��Ȼ�������123.321��567.765��������ֵ�����ǡ�һ�仰��
		//��Ҳ�����Զ�����Щ����
		Double num_1 = Double.parseDouble(s_1);
		Double num_2 = Double.parseDouble(s_2);
		//parseDouble(String s)����Double�����Դ��Ľ��ַ����е�����ת��Ϊdouble���͵ķ�����
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
			//compareTo(Double anotherDouble)Ҳ��Double���ṩ��һ��������
			//���ڱȽ�����Double�������ݵĴ�С������ֵΪint���ͣ�-1��0��1�ֱ����С�ڡ����ںʹ��ڡ�
		}
	}

}
