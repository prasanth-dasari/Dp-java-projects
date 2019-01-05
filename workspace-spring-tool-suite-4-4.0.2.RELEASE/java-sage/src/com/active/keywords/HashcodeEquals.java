package com.active.keywords;

public class HashcodeEquals {
	public static void main(String args[]) {
		StudentEH amy1 = new StudentEH(1, "AMY");
		StudentEH amy2 = new StudentEH(1, "AMY");

		System.out.println("amy1 hashcode = " + amy1.hashCode());
		System.out.println("amy2 hashcode = " + amy2.hashCode());
		System.out.println("checking equality between amy1 and amy2 = " + amy1.equals(amy2));
	}

}
