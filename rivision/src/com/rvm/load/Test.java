package com.rvm.load;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
//	Class c1=Class.forName("com.rvm.load.Data");
//	
//	//System.out.println(c1.getName());
//	Data d1=(Data) c1.newInstance();
//	d1.data();
		
		Constructor<Data> c1=Data.class.getDeclaredConstructor();
		Data d1=c1.newInstance();
		d1.data();
	
	}
}
