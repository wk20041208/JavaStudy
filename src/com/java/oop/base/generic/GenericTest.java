package com.java.oop.base.generic;

import java.util.ArrayList;
import java.util.List;

//泛型只在编译期间有效
public class GenericTest {
	public static void main(String[] args) {
		List<String> stringArrayList = new ArrayList<>();
		List<Integer> integerArrayList = new ArrayList<>();
		Class classString = stringArrayList.getClass();
		Class classInteger = integerArrayList.getClass();
		if(classString .equals(classInteger)) {
			System.out.println(classString);
			System.out.println(classInteger);
			System.out.println("泛型测试");
		}
		//所以下面两个方法其实是一个方法，并非重载
		
//	    public static void method(List<String> list) {  
//	        System.out.println("invoke method(List<String> list)");  
//	    }  
//
//	    public static void method(List<Integer> list) {  
//	        System.out.println("invoke method(List<Integer> list)");  
//	    }
		
		//在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，
		//此时泛型才会起到本应起到的限制作用。如果不传入泛型类型实参的话，
		//在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
		Generic generic = new Generic("generic");
		Generic g2 = new Generic(false);
		Generic<String> g3 = new Generic<>("use geneic");
		
	}

}


//泛型类
class Generic<T>{
	private T key;
	
	public Generic(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
}

//泛型接口
interface GenericInterface<T>{
	public T print();
	
}

//当实现泛型接口的类，未传入泛型实参时,与泛型类的定义相同，
//在声明类的时候，需将泛型的声明也一起加到类中

class GenericImp1<T> implements GenericInterface<T>{

	@Override
	public T print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
//当实现泛型接口的类，传入泛型实参时：
/**
 * 传入泛型实参时：
 * 定义一个生产器实现这个接口,虽然我们只创建了一个泛型接口Generator<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * 即：Generator<T>，public T print();中的的T都要替换成传入的String类型。
 */
 class GenericImp2 implements GenericInterface<String>{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	 
 }