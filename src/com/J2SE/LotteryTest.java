package com.J2SE;

import java.util.Scanner;

public class LotteryTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Lottery l = new Lottery();
	        Scanner scan = new Scanner(System.in);// ����ɨ����
	        System.out.println("Please input the number of lottery group(s) that you want to generate : ");
	        // ����û��������Ҫ���ɵ��н��������

	        String groupNum = scan.nextLine();
	        l.generateLottery(groupNum);

	    }

}
