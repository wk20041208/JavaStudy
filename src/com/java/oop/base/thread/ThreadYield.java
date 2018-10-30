package com.java.oop.base.thread;


/*
 * Thread.yield( )方法：

使当前线程从执行状态（运行状态）变为可执行态（就绪状态）。cpu会从众多的可执行态里选择，也就是说，当前也就是刚刚的那个线程还是有可能会被再次执行到的，并不是说一定会执行其他线程而该线程在下一次中不会执行到了。

用了yield方法后，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
 * */
public class ThreadYield {
	public static void main(String[] args) {
		YieldThread yt1 = new YieldThread("yt1");
		YieldThread yt2 = new YieldThread("yt2");
		yt1.start();
		yt2.start();
	}

}

class YieldThread extends Thread{
	
	public YieldThread(String name) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 50;i++) {
			System.out.println("" + this.getName() + "-- "+ i);
			if(i == 10) {
				Thread.yield();
			}
		}
	}
	
}
