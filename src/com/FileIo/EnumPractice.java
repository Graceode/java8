package com.FileIo;

public class EnumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Week week : Week.values()){
			System.out.println("The order of " +week + "is"+week.ordinal());
			//ʹ��ordinal()�����鿴ö��Ԫ�ص�˳��
			System.out.println("Compare to Monday:"+week.compareTo(Week.MONDAY));
			//��compareTo()����������ǰö��Ԫ����Week.MONDAY�Ƚ�
			System.out.println("Equal to Mondy ?"+week.equals(Week.MONDAY));
			System.out.println("Equal to MONDAY by ==?"+(week == Week.MONDAY));
			System.out.println("Name:"+week.name());
			System.out.println("Abbreviation :"+week.getAbbr());
			System.out.println("--------------");
		}

	}

}
