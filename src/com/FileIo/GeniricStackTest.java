package com.FileIo;

public class GeniricStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> stack = new GenericStack<String>();
		//�����ڴ���GenericStack����ʱ������String���ͣ��������ջ����ֻ�ܴ���ַ���Ԫ��
        //������һ��GenericStack��������Ϊstack
		System.out.println("Now add some words intoo stack");
		stack.push("shiyanlou");
		System.out.println("word - 'shiyanlou'added.");
		stack.push("onlinelearning");
		System.out.println("word - 'onlinelearning'added.");
		//�������Ԫ�ص�ջ����ȥ���Ƚ��ȳ�ԭ��
		System.out.println("Now pop words from stack.");
		while(!stack.isEmpty()){
			String s = (String)stack.pop();
			 //ֻҪջ��Ϊ�գ���ȡ�����е�Ԫ�ز���ӡ����
			 //����Ϊ��ȷ����һ��ִ�е���ȷ���õ���ǿ������ת��
			System.out.println("word -" + s + "has been taken out");
		}
	}

}
