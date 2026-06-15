package com.collection.arrayList;

import java.util.ArrayList;
import java.util.*;

public class DemoTest {
	public static void main(String args[]) {
		Iterable i1=new ArrayList();
		Collection con=new ArrayList();
		con.add(10);
		con.add(7.14f);
		con.add("abc");
		con.add(true);
		
		
		//We can Print this collection using 5 ways
		System.out.println(con);//normal
		//for loop
		//Iterator<E>
		//ListIterator<E>
		//foreach Loop
		
	}
}
