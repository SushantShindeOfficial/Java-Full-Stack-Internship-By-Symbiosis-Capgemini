package com.jvm.login;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1=Class.forName("com.jvm.login.Employee");
		System.out.println(c1.getName());
		System.out.println(c1.getPackageName());
		System.out.println(c1.getTypeName());
		System.out.println(c1.getModifiers());
		
//		Method method[]=c1.getDeclaredMethods();
//		//methods in Class
//		for(int i=0;i<method.length;i++) {
//			System.out.println("----------------Methods in Class--------------");
//			System.out.println(method[i]);
//		}
//		
//		//Constructors in class
//		Constructor constructor[]=c1.getDeclaredConstructors();{
//			for(int i=0;i<constructor.length;i++) {
//				System.out.println("-------------Constructors in Class-----------");
//				System.out.println(constructor[i]);
//			}
//		}
		
		//Field
		Field field[]=c1.getDeclaredFields();
		for(int i=0;i<field.length;i++) {
			System.out.println(field[i]);
		}
	}
}
