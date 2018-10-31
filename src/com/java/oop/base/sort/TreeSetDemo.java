package com.java.oop.base.sort;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1  = new Person("刘德华",1000);
		Person p2 = new Person("梁朝伟", 1500);
		Person p3 = new Person("郭富城",1200);
		Person p4 = new Person("周星驰", 500);
		TreeSet<Person> t = new TreeSet<>(new java.util.Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getHandSome() - o2.getHandSome();
			}
		});
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		System.out.println(t);
		p3.setHandSome(1600);
		System.out.println(t);
	}

}

class Person {
	private String name;
	private int handSome;
	public Person(String name, int handSome) {
		super();
		this.name = name;
		this.handSome = handSome;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHandSome() {
		return handSome;
	}
	public void setHandSome(int handSome) {
		this.handSome = handSome;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", handSome=" + handSome + "]";
	}
	
	
}

class Work implements Comparable<Work>{
	private String type;
	private double salay;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSalay() {
		return salay;
	}

	public void setSalay(double salay) {
		this.salay = salay;
	}

	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Work(String type, double salay) {
		super();
		this.type = type;
		this.salay = salay;
	}

	@Override
	public int compareTo(Work o) {
		// TODO Auto-generated method stub
		return this.salay > o.salay ? 1:(this.salay == o.salay?0:-1);
	}
	
}
