package com.java.oop.base.thread;

public class ThreadStatus {
	public static void main(String[] args) {
		MyThread mth = new MyThread();
		Thread proxy = new Thread(mth,"hh");
		proxy.setName("new name");
		proxy.start();
		System.out.println(proxy.getName());
		System.out.println(proxy.isAlive());
		proxy.setPriority(Thread.MAX_PRIORITY);
		for(int i = 0;i<=5000;i++) {
			System.out.println(proxy.getPriority());
			if(i == 100) {
				mth.stop();
			}
			System.out.println(proxy.isAlive());
		}
	}

 }

class MyThread implements Runnable{
	private boolean flag = true;
	private int num = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag) {
			System.out.println(Thread.currentThread().getName() + "--" + num++);
		}
		
	}
	
	public void stop() {
		this.flag = false;
	}
	
}
