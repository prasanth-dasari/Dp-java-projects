package com.active.interfaces;

public class Test implements I1, I2 {

	@Override
	public void display() {
		System.out.println(" third ");
	}

	@Override
	public void test() {
		System.out.println(" fourth ");
	}

	@Override
	public void M1() {
		System.out.println(" first ");
	}

	@Override
	public void M2() {
		System.out.println(" second ");
	}

	public static void main(String args[]) {
		Test t1 = new Test();
		t1.M1();
		t1.M2();
		t1.M3();
		System.out.println();
		t1.display();
		t1.test();
		t1.apple();
	}

}
