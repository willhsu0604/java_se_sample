package com.will.ch_18;

import java.lang.reflect.Field;

public class AnnotationTest_18_1 {

	public static void main(String[] args) {
		Field[] fields = Member.class.getDeclaredFields();
		for(Field field: fields) {
			field.setAccessible(true);
			if(field.isAnnotationPresent(Description.class)) {
				Description description = field.getDeclaredAnnotation(Description.class);
				System.out.println(description.value());
			}
		}

	}

}
