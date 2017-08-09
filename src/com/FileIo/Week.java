package com.FileIo;

public enum Week {
	MONDAY("MON"),TUESDAY("TUES"),WENDNESDAT("WED"),THURSDAY("THUR"),
	FRIDAY("FRI"),SATURDAY("SAT"),SUNDAY("SUN");
	//必须先定义枚举类型，才能定义方法
	private String abbr;
	private Week(String abbr){
		this.abbr = abbr;
		//声明一个私有的搞糟方法，该方法只能在构造枚举常量时被调用，可以使枚举元素具有指定的缩写信息
		
	}
	public String getAbbr() {
		return abbr;
	}
	
}
