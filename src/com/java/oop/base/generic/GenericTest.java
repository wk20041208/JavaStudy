package com.java.oop.base.generic;

import java.util.ArrayList;
import java.util.List;

//����ֻ�ڱ����ڼ���Ч
public class GenericTest {
	public static void main(String[] args) {
		List<String> stringArrayList = new ArrayList<>();
		List<Integer> integerArrayList = new ArrayList<>();
		Class classString = stringArrayList.getClass();
		Class classInteger = integerArrayList.getClass();
		if(classString .equals(classInteger)) {
			System.out.println(classString);
			System.out.println(classInteger);
			System.out.println("���Ͳ���");
		}
		//������������������ʵ��һ����������������
		
//	    public static void method(List<String> list) {  
//	        System.out.println("invoke method(List<String> list)");  
//	    }  
//
//	    public static void method(List<Integer> list) {  
//	        System.out.println("invoke method(List<Integer> list)");  
//	    }
		
		//��ʹ�÷��͵�ʱ��������뷺��ʵ�Σ������ݴ���ķ���ʵ������Ӧ�����ƣ�
		//��ʱ���ͲŻ��𵽱�Ӧ�𵽵��������á���������뷺������ʵ�εĻ���
		//�ڷ�������ʹ�÷��͵ķ������Ա������������Ϳ���Ϊ�κε����͡�
		Generic generic = new Generic("generic");
		Generic g2 = new Generic(false);
		Generic<String> g3 = new Generic<>("use geneic");
		
	}

}


//������
class Generic<T>{
	private T key;
	
	public Generic(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
}

//���ͽӿ�
interface GenericInterface<T>{
	public T print();
	
}

//��ʵ�ַ��ͽӿڵ��࣬δ���뷺��ʵ��ʱ,�뷺����Ķ�����ͬ��
//���������ʱ���轫���͵�����Ҳһ��ӵ�����

class GenericImp1<T> implements GenericInterface<T>{

	@Override
	public T print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
//��ʵ�ַ��ͽӿڵ��࣬���뷺��ʵ��ʱ��
/**
 * ���뷺��ʵ��ʱ��
 * ����һ��������ʵ������ӿ�,��Ȼ����ֻ������һ�����ͽӿ�Generator<T>
 * �������ǿ���ΪT����������ʵ�Σ��γ����������͵�Generator�ӿڡ�
 * ��ʵ����ʵ�ַ��ͽӿ�ʱ�����ѽ��������ʹ���ʵ�����ͣ�������ʹ�÷��͵ĵط���Ҫ�滻�ɴ����ʵ������
 * ����Generator<T>��public T print();�еĵ�T��Ҫ�滻�ɴ����String���͡�
 */
 class GenericImp2 implements GenericInterface<String>{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	 
 }