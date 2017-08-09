package com.FileIo;

public class EnumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Week week : Week.values()){
			System.out.println("The order of " +week + "is"+week.ordinal());
			//使用ordinal()方法查看枚举元素的顺序
			System.out.println("Compare to Monday:"+week.compareTo(Week.MONDAY));
			//用compareTo()方法来将当前枚举元素与Week.MONDAY比较
			System.out.println("Equal to Mondy ?"+week.equals(Week.MONDAY));
			System.out.println("Equal to MONDAY by ==?"+(week == Week.MONDAY));
			System.out.println("Name:"+week.name());
			System.out.println("Abbreviation :"+week.getAbbr());
			System.out.println("--------------");
		}

	}

}
