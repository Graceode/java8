package com.J2SE;

import java.util.Scanner;

public class LotteryTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Lottery l = new Lottery();
	        Scanner scan = new Scanner(System.in);// 创建扫描器
	        System.out.println("Please input the number of lottery group(s) that you want to generate : ");
	        // 获得用户输入的需要生成的中奖号码个数

	        String groupNum = scan.nextLine();
	        l.generateLottery(groupNum);

	    }

}
