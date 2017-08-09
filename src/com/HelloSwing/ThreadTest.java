package com.HelloSwing;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadState state = new ThreadState();
		//������ʵ����һ��ThreadState����
		Thread thread = new Thread(state);
		////���������Ϊstate��ThreadState����������Thread����
		System.out.println("Create new thread:"+thread.getState());
		//ʹ��getState()����������̵߳�״̬�����������
		thread.start();
		//ʹ��thread�����start()�����������µ��߳�
		System.out.println("start the thread:"+thread.getState());
        //����̵߳�״̬
		Thread.sleep(100);
		System.out.println("wait foe A monment(time):"+thread.getState());
		//����̵߳�״̬
		Thread.sleep(1000); 
        //ʹ��ǰ����߳�����1000���룬�Ӷ�ʹ�µ��߳�����waitForever()����

        System.out.println("Waiting for a moment: " + thread.getState());
        //����̵߳�״̬

        state.notifyNow(); 
        // ����state��notifyNow()����
        System.out.println("Wake up the thread:"+thread.getState());
      //����̵߳�״̬
        Thread.sleep(1000); 
        //ʹ��ǰ�߳�����1000���룬ʹ���߳̽���

        System.out.println("Terminate the thread: " + thread.getState());
        //����̵߳�״̬
	}

}
