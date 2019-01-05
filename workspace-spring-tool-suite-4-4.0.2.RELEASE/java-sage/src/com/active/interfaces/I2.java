package com.active.interfaces;

public interface I2 {
	public void display();

	public void test();

	default void apple() {
		System.out.println(" default conc. in I2 ");
	}

}
