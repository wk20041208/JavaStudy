package com.java.oop.base.generic;


//�̳��еķ��ͣ������е����Ͳ���Ҫ>=����
abstract class Father<T>{
	T name;
	public abstract void test(T t);
}

//1������Ϊ���������Լ����������ͣ���������ʱָ����������
class Child extends Father<String>{

	@Override
	public void test(String t) {
		// TODO Auto-generated method stub
		
	}
	
}
//2������Ϊ�����࣬�����ӷ���
class Child2<T> extends Father<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}

//3������ָ���˷��ͣ����Ǹ����޷��ͣ���ʱ���ͱ���������д����ʱ�����еķ��ͻ�ʵ��ΪObject
class Child3<T> extends Father{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
//4������ָ���˷���,(��ʵ�÷����Ѿ��븸�෺���޹أ�ͬ3)�����Ǹ����޷��ͣ���ʱ���ͱ���������д����ʱ�����еķ��ͻ�ʵ��ΪObject
class Child4<E> extends Father{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
//5������ķ���>���෺��
class Child5<T,T1> extends Father<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
	public void test2(T1 t1) {
		
	}
}
//6�����Ͳ���2,��ʱ�����еķ��ͱ����������Ͳ�����ָ��ΪObject
class Child6 extends Father{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	
}



public class GenericInherit {

}
