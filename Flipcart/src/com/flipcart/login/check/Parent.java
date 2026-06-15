package com.flipcart.login.check;

@FunctionalInterface
public interface Parent {
	void display();
	static void demo()//static method 
	{
		System.out.println("This is Static demo method ");
	}
	
	default void show() {
		data();
		System.out.println("this is default method ");
	}
	private void data() {
		System.out.println("This is Private Method");
	}

}
