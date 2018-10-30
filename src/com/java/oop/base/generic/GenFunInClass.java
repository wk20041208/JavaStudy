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
      //在泛型类中声明了一个泛型方法，使用泛型E，这种泛型E可以为任意类型。可以类型与T相同，也可以不同。
    //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
	public <E> void show2(E t) {
		System.out.println(t.toString());
	}
	//在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
    public <T> void show_2(T t){
        System.out.println(t.toString());
    }
    //类的静态方法无法访问类的泛型，下面这个函数定义是错误的，静态方法要使用泛型，需将方法本身定义成泛型方法
//    public static void testGenericStatic(T t) {
//    	
//    }
    public static <T> void testGenericStatic(T t) {
    	
    }

    
}
