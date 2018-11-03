package com.java.oop.base.reference.type;

import java.util.EnumSet;

//EnumMap要求键为枚举类型

enum State{
	ON,OFF
}

public class EnumMapDemo {
	public static void main(String[] args) {
		for(State s:State.values()) {
			System.out.println(s.name());
		}
		State switchState = State.OFF;
		switch(switchState) {
		case OFF:
			System.out.println("OFF");
			break;
		case ON:
			System.out.println("ON");
			break;
		default:
			break;
		}
		
		EnumSet stateSet = EnumSet.allOf(State.class);
//		for(State s:stateSet) {
//			System.out.println(s);
//		}
	}

}
