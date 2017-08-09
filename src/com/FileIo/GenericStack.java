package com.FileIo;

import java.util.LinkedList;

public class GenericStack<T> {
	//定义一个参数类型为T的泛型类
	
	private LinkedList<T> stackContainer = new LinkedList<T>();
	public void push(T t){
		//自定义一个入栈的方法，其中调用了addFirst()方法
		//addFirst()方法可以在栈的顶端加入元素
		stackContainer.addFirst(t);
	}
	public T pop(){
		//定义一个出栈的方法，其中调用了removeFirst()方法
		
		////removeFirst()方法可以将栈顶端的元素移除并取出作为返回值
		return stackContainer.removeFirst();
		
	}
	public boolean isEmpty(){
		return stackContainer.isEmpty();
		//判断是否是空栈的方法
		
	}

}
