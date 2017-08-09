package com.HelloSwing;

public class CreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread1 = new Thread1();
		//声明一个Thread1对象，这个Thread1类继承自Thread类的

		Thread thread2 = new Thread(new Thread2());
		//再次用到了匿名内部类
		thread1.start();
		thread2.start();
		//启动线程

	}

}
          class Thread1 extends Thread{
        	//在run()方法中放入线程要完成的工作

              //这里我们把两个线程各自的工作设置为打印100次信息
        	  public void run(){
        		  for(int i = 0;i < 100;++i){
        			  System.out.println("Hello! this is " + i);
        		  }
        	  }
          }
          class Thread2 implements Runnable{
        	  //与Thread1不同，如果当一个线程已经继承了另一个类时，
        	 //就建议你通过实现Runnable接口来构
        	  public void run(){
        		  for(int j = 0; j<100;++j){
        			  System.out.println("thank,there is "+j);
        		  }//在这个循环结束后，线程便会自动结束
        	  }
          }