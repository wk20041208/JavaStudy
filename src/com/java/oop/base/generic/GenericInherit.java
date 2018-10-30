package com.java.oop.base.generic;


//继承中的泛型，子类中的类型参数要>=父类
abstract class Father<T>{
	T name;
	public abstract void test(T t);
}

//1、子类为具体类无自己新增的类型，但在声明时指定具体类型
class Child extends Father<String>{

	@Override
	public void test(String t) {
		// TODO Auto-generated method stub
		
	}
	
}
//2、子类为泛型类，无增加泛型
class Child2<T> extends Father<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}

//3、子类指定了泛型，但是父类无泛型，此时泛型被擦除，重写方法时父类中的泛型会实现为Object
class Child3<T> extends Father{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
//4、子类指定了泛型,(其实该泛型已经与父类泛型无关，同3)，但是父类无泛型，此时泛型被擦除，重写方法时父类中的泛型会实现为Object
class Child4<E> extends Father{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
//5、子类的泛型>父类泛型
class Child5<T,T1> extends Father<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
	public void test2(T1 t1) {
		
	}
}
//6、泛型擦除2,此时方法中的泛型被擦除，类型参数被指定为Object
class Child6 extends Father{

	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	
}



public class GenericInherit {

}
