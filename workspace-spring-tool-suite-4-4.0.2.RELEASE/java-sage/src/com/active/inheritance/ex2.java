package com.active.inheritance;

public class ex2 extends ex1 {
	
	public static byte b1=5;
	
	public static void main(String args[]) {
		ex2 s1 = new ex2();
		System.out.println(b1);
		System.out.println(s1.d1);
		System.out.println(s1.x);
		System.out.println(f1);
	}
}
