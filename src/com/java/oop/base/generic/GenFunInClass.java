package com.java.oop.base.generic;

public class GenFunInClass {
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		Person person = new Person();
		GenericIn<Fruit> gen = new GenericIn<>();
	}
}


class Fruit{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "fruit";
	}
	
}
class Apple extends Fruit{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "apple";
	}
	
}
class Person{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "person";
	}
	
}
class GenericIn<T>{
	public void show(T t) {
		System.out.println(t.toString());
	}
      //�ڷ�������������һ�����ͷ�����ʹ�÷���E�����ַ���E����Ϊ�������͡�����������T��ͬ��Ҳ���Բ�ͬ��
    //���ڷ��ͷ�����������ʱ�����������<E>����˼�ʹ�ڷ������в�δ�������ͣ�������Ҳ�ܹ���ȷʶ���ͷ�����ʶ��ķ��͡�
	public <E> void show2(E t) {
		System.out.println(t.toString());
	}
	//�ڷ�������������һ�����ͷ�����ʹ�÷���T��ע�����T��һ��ȫ�µ����ͣ������뷺������������T����ͬһ�����͡�
    public <T> void show_2(T t){
        System.out.println(t.toString());
    }
    //��ľ�̬�����޷�������ķ��ͣ�����������������Ǵ���ģ���̬����Ҫʹ�÷��ͣ��轫����������ɷ��ͷ���
//    public static void testGenericStatic(T t) {
//    	
//    }
    public static <T> void testGenericStatic(T t) {
    	
    }

    
}
