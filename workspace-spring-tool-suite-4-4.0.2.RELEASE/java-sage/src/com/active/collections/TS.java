package com.active.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TS {
	public static void main(String args[]) {
		TreeSet  tset = new TreeSet ();
		tset.add("apple");
		tset.add("google");
		tset.add("dell");
		tset.add("oracle");

		// tset.pollFirst();
		// tset.pollLast();
		System.out.println();
		Iterator itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
