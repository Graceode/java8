package com.HelloSwing;

public class CreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread1 = new Thread1();
		//����һ��Thread1�������Thread1��̳���Thread���

		Thread thread2 = new Thread(new Thread2());
		//�ٴ��õ��������ڲ���
		thread1.start();
		thread2.start();
		//�����߳�

	}

}
          class Thread1 extends Thread{
        	//��run()�����з����߳�Ҫ��ɵĹ���

              //�������ǰ������̸߳��ԵĹ�������Ϊ��ӡ100����Ϣ
        	  public void run(){
        		  for(int i = 0;i < 100;++i){
        			  System.out.println("Hello! this is " + i);
        		  }
        	  }
          }
          class Thread2 implements Runnable{
        	  //��Thread1��ͬ�������һ���߳��Ѿ��̳�����һ����ʱ��
        	 //�ͽ�����ͨ��ʵ��Runnable�ӿ�����
        	  public void run(){
        		  for(int j = 0; j<100;++j){
        			  System.out.println("thank,there is "+j);
        		  }//�����ѭ���������̱߳���Զ�����
        	  }
          }