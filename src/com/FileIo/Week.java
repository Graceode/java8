package com.FileIo;

public enum Week {
	MONDAY("MON"),TUESDAY("TUES"),WENDNESDAT("WED"),THURSDAY("THUR"),
	FRIDAY("FRI"),SATURDAY("SAT"),SUNDAY("SUN");
	//�����ȶ���ö�����ͣ����ܶ��巽��
	private String abbr;
	private Week(String abbr){
		this.abbr = abbr;
		//����һ��˽�еĸ��㷽�����÷���ֻ���ڹ���ö�ٳ���ʱ�����ã�����ʹö��Ԫ�ؾ���ָ������д��Ϣ
		
	}
	public String getAbbr() {
		return abbr;
	}
	
}
