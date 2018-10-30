package com.java.oop.base.thread;

//让父线程等待子线程结束之后才能继续运行。

public class ThreadJoin {

}

//在 ParentChild.run() 中，通过 ChildThread ch = new ChildThread(); 新建 ch 子线程（此时 child 处于 NEW 状态）；

//然后再调用 ch.start()（child 转换为 RUNNABLE 状态）；

//再调用 ch.join()。
class PerentThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ChildThread ch = new ChildThread();
		ch.start();
		try {
			ch.join();//父线程会等待子线程结束之后再运行
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class ChildThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}
