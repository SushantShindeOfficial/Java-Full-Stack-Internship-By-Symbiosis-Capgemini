package com.jvm.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestDemo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Product>c1=Product.class.getDeclaredConstructor();
		Product p1=c1.newInstance();
		p1.display();
		p1.demo();
	}
}
