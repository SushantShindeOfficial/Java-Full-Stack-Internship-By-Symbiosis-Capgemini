package com.coep.in;

public class Test {
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		d1.display(10.5f, 5);          // float, int
        d1.display((short)10, (byte)5); // short, byte
        d1.display(10, (byte)5);       // int, byte
        
        d1.display(10, 12);
	}
}
