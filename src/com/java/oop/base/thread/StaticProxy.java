package com.java.oop.base.thread;

public class StaticProxy {
	public static void main(String[] args) {
		Marry company = new WeddingCompany();
		company.marry();
	}

}

interface Marry{
	void marry();
}

class You implements Marry{

	@Override
	public void marry() {
		// TODO Auto-generated method stub
		System.out.println("我结婚了....");
		
	}
	
}

class WeddingCompany implements Marry{
	private Marry you;
	
	

	public WeddingCompany(Marry you) {
		this.you = you;
	}
	public WeddingCompany() {
		// TODO Auto-generated constructor stub
		this(new You());
	}
	@Override
	public void marry() {
		// TODO Auto-generated method stub
		before();
		you.marry();
		after();
		
		
	}
	public void before() {
		System.out.println("帮助准备婚礼，布置猪窝");
	}
	public void after() {
		System.out.println("闹洞房");
	}
	
}
