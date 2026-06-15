package com.multiThreading.RunableI;

public class TEst {
	public static void main(String[] args) {
		Parent p1=new Parent();
		Parent p2=new Parent();
		
		p1.start();//Creates new thread → parallel execution
		p2.start();//Creates new thread → parallel execution
		
//		p1.run();//Normal method call → single thread
//		p2.run();//Normal method call → single thread
	}
}
