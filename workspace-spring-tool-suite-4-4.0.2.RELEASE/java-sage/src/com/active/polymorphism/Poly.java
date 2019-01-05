package com.active.polymorphism;

public class Poly {
	public void display(int x) {
		System.out.println(x);
	}

	public void display(float f, double d) {
		System.out.println(f + "  " + d);
	}

	public void display(String name) {
		System.out.println(name);
	}

	public static void main(String args[]) {
		Poly p1 = new Poly();
		p1.display(23);
		p1.display(123, 33);
		p1.display("Java in Sage");
	}

}
