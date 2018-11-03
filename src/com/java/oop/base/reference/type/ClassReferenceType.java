package com.java.oop.base.reference.type;

import java.lang.ref.WeakReference;

//引用分类
/*
 * （1）强引用
    如果一个对象具有强引用的话，垃圾回收器不会回收这个对象，即使内存空间不足的时候也不会回收具有强引用类型的对象，平时通过new创建一个对象赋值给一个变量(Aa = new A())，这种方式就是强引用，强引用类型的对象，在不使用时要赋值为null，才能被垃圾回收器回收。
（2）软引用
    如果一个对象只具有软引用，内存空间足够，垃圾回收器就不会回收它，如果内存空间不足，就会回收这些对象的内存。只要垃圾回收器没有回收软引用类型的对象，程序就一直可以使用该对象。适用于网页缓存、图片缓存，防止内存溢出，在内存充足的时候，缓存对象会一直存在，在内存不足的时候，缓存对象占用的内存会被垃圾收集器回收。
    定义一个HashMap，保存软引用的Bitmap对象，防止oom
（3） 弱引用
    弱引用（WeakReference），具有弱引用的对象的生命周期更短，垃圾回收器在扫描的时候，一旦发现只具有弱引用的对象，不管内存空间是否足够，都会回收它的内存。
 （4）虚引用
            虚引用并不会决定对象的生命周期，如果一个对象仅持有虚引用，那么它就和没有任何引用一样，在任何时候都可能被垃圾回收器回收。
 * 
  */


public class ClassReferenceType {
	public static void main(String[] args) {
		testWeakReference();
		
	}
	
	public static void testWeakReference() {
		WeakReference<String> weakRef = new WeakReference<String>(new String("reference"));
		WeakReference<String> weakRef2 = new WeakReference<String>("hello");
		System.out.println(weakRef.get());//reference
		System.gc();
		System.runFinalization();
		System.out.println(weakRef.get());//null
		System.out.println(weakRef2.get());//hello
		System.gc();
		System.runFinalization();
		System.out.println(weakRef2.get());//hello
	}

}
