package com.FileIo;

public class GeniricStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> stack = new GenericStack<String>();
		//我们在创建GenericStack对象时填入了String类型，表明这个栈里面只能存放字符串元素
        //声明了一个GenericStack对象，名字为stack
		System.out.println("Now add some words intoo stack");
		stack.push("shiyanlou");
		System.out.println("word - 'shiyanlou'added.");
		stack.push("onlinelearning");
		System.out.println("word - 'onlinelearning'added.");
		//添加两个元素到栈里面去，先进先出原则
		System.out.println("Now pop words from stack.");
		while(!stack.isEmpty()){
			String s = (String)stack.pop();
			 //只要栈不为空，就取出其中的元素并打印出来
			 //这里为了确保下一步执行的正确，用到了强制类型转换
			System.out.println("word -" + s + "has been taken out");
		}
	}

}
