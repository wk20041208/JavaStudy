package com.java.oop.base.thread;

/*
 * sleep()方法是Thread类里面的，主要的意义就是让当前线程停止执行，让出cpu给其他的线程，但是不会释放对象锁资源以及监控的状态，当指定的时间到了之后又会自动恢复运行状态。

wait()方法是Object类里面的，主要的意义就是让线程放弃当前的对象的锁，进入等待此对象的等待锁定池，只有针对此对象调动notify方法后本线程才能够进入对象锁定池准备获取对象锁进入运行状态。
 * */


public class ThreadSleep {

}

class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (ThreadSleep.class) {
			System.out.println("enter thread1....");
			System.out.println("thread1 is waiting...");
			try {
				ThreadSleep.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread1 is going on ....");
			System.out.println("thread1 is over!!!");
		}
		
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (ThreadSleep.class) {
			System.out.println("enter thread2....");
			System.out.println("thread2 is sleep...");
			//只有针对此对象调用notify()方法后本线程才进入对象锁定池准备获取对象锁进入运行状态。
			ThreadSleep.class.notify();
			//区别
            //如果我们把代码：TestD.class.notify();给注释掉，即TestD.class调用了wait()方法，但是没有调用notify()
            //方法，则线程永远处于挂起状态。
            try {
            //sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，
            //但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
            //在调用sleep()方法的过程中，线程不会释放对象锁。
               Thread.sleep(5000);
             } catch (Exception e) {
                e.printStackTrace();
            }
             System.out.println("thread2 is going on....");
             System.out.println("thread2 is over!!!");
		}
		
	}
	
}
