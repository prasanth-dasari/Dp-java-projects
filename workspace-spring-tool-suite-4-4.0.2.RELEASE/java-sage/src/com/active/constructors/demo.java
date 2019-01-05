package com.active.constructors;

public class demo {
	
	public demo () {
		System.out.println("default constructor");
	}
	public demo(int x , float f)
	{
		System.out.println(x + " " + f);
		System.out.println(" parameterized ");
	}
	public static void main (String args[]) {
		demo d1= new demo();
		demo d2= new demo(12 , 23);
	}
}
