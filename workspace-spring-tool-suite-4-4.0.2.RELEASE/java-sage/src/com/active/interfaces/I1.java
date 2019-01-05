package com.active.interfaces;

public interface I1 {
	public void M1();

	public void M2();

	default void M3() {
		System.out.println(" default conc method in I1 ");
	}

}
